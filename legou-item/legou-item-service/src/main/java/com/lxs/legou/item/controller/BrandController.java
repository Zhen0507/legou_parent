package com.lxs.legou.item.controller;

import com.lxs.legou.core.controller.BaseController;
import com.lxs.legou.item.po.Brand;
import com.lxs.legou.item.po.Category;
import com.lxs.legou.item.service.IBrandService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 品牌管理
 */
@RestController
@RequestMapping("/item/brand")
@CrossOrigin
public class BrandController extends BaseController<IBrandService, Brand> {

    /**
     * 在品牌编辑后执行的操作。
     * 主要用于更新品牌对应的分类ID数组，因为编辑品牌时可能会涉及到分类的变化。
     *
     * @param entity 刚刚被编辑的品牌实体，包含最新的品牌信息。
     */
    @Override
    public void afterEdit(Brand entity) {
        // 根据品牌ID查询该品牌所关联的分类信息
        List<Category> categories = service.selectCategoryByBrand(entity.getId());
        // 初始化一个Long类型的数组，用于存放分类ID
        Long[] ids = new Long[categories.size()];
        // 遍历分类列表，将分类ID存入数组中
        for (int i=0; i<categories.size(); i++ ) {
            ids[i] = categories.get(i).getId();
        }
        // 更新品牌实体的分类ID数组，以便后续处理或保存
        entity.setCategoryIds(ids);
    }










}
