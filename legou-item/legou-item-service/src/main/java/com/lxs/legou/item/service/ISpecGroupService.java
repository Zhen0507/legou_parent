package com.lxs.legou.item.service;

import com.lxs.legou.core.service.ICrudService;
import com.lxs.legou.item.po.SpecGroup;

import java.util.List;

/**
 * @Title: 商品规格参数分组
 */
public interface ISpecGroupService extends ICrudService<SpecGroup> {

    /**
     * 根据前台传递的规格参数列表，保存规格参数
     * @param cid
     * @param groups
     */
    public void saveGroup(Long cid, List<SpecGroup> groups);

}
