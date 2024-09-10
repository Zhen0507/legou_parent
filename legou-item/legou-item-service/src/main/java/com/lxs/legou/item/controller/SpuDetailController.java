package com.lxs.legou.item.controller;

import com.lxs.legou.core.controller.BaseController;
import com.lxs.legou.item.po.SpuDetail;
import com.lxs.legou.item.service.ISpuDetailService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title:
 */
@RestController
@RequestMapping(value = "/item/spu-detail")
public class SpuDetailController extends BaseController<ISpuDetailService, SpuDetail> {

}