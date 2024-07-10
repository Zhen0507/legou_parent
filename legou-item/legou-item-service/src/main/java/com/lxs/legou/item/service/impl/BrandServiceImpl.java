package com.lxs.legou.item.service.impl;

import com.lxs.legou.core.service.impl.CrudServiceImpl;
import com.lxs.legou.item.dao.BrandDao;
import com.lxs.legou.item.po.Brand;
import com.lxs.legou.item.po.Category;
import com.lxs.legou.item.service.IBrandService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BrandServiceImpl extends CrudServiceImpl<Brand> implements IBrandService {


    @Override
    @Transactional(readOnly = false)
    public boolean saveOrUpdate(Brand entity) {
        boolean result = super.saveOrUpdate(entity); //保存品牌分类

        ((BrandDao) getBaseMapper()).deleteCategoryByBrand(entity.getId()); //删除商品和分类的关联

        //添加商品和分类的关联
        Long[] roleIds = entity.getCategoryIds();
        if (null != roleIds) {
            for (Long roleId : roleIds) {
                ((BrandDao) getBaseMapper()).insertCategoryAndBrand(roleId, entity.getId());
            }
        }
        return result;

    }
    @Override
    public List<Category> selectCategoryByBrand(Long id) {
        return ((BrandDao) getBaseMapper()).selectCategoryByBrand(id);
    }
}
