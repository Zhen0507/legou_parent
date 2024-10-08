package com.lxs.legou.item.service.impl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.lxs.legou.core.service.impl.CrudServiceImpl;
import com.lxs.legou.item.po.Category;
import com.lxs.legou.item.service.ICategoryService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @作者: 敬亭山
 * @类名: CategoryServiceImpl
 * @创建时间: 2024/8/5
 **/
@Service
public class CategoryServiceImpl extends CrudServiceImpl<Category> implements ICategoryService {

    @Override
    public List<Category> list(Category entity) {
        QueryWrapper<Category> queryWrapper = Wrappers.query();
        if (StringUtils.isNotEmpty(entity.getTitle())) {
            queryWrapper.like("title_", entity.getTitle());
        }
        if (null != entity.getParentId()) {
            queryWrapper.eq("parent_id_", entity.getParentId());
        }
        if (null != entity.getIsRoot() && entity.getIsRoot().equals(1)) {
            queryWrapper.isNull("parent_id_");
        }

        return getBaseMapper().selectList(queryWrapper);
    }

}
