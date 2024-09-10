package com.lxs.legou.item.dao;

import com.lxs.legou.core.dao.ICrudDao;
import com.lxs.legou.item.po.SpecGroup;

import java.util.List;

public interface SpecGroupDao extends ICrudDao<SpecGroup> {

    /**
     * 根据实体条件动态查询分组
     * @param specGroup
     * @return
     */
    public List<SpecGroup> selectList(SpecGroup specGroup);

}
