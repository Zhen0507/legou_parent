package com.lxs.legou.item.controller;

import com.lxs.legou.core.controller.BaseController;
import com.lxs.legou.item.po.Category;
import com.lxs.legou.item.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @作者: 敬亭山
 * @类名: CategoryController
 * @创建时间: 2024/8/6
 **/

/**
 * 商品分类
 */
@RestController
@RequestMapping("/item/category")
public class CategoryController extends BaseController<ICategoryService, Category> {

}
