package com.lxs.legou.item.service;

import com.lxs.legou.core.service.ICrudService;
import com.lxs.legou.item.po.Spu;

public interface ISpuService extends ICrudService<Spu> {

    /**
     * 保存spu，包括如下表的数据
     *      spu
     *      spuDetail
     *      skus
     * @param spu
     */
    public void saveSpu(Spu spu);

}