package com.lxs.legou.item.controller;

import com.lxs.legou.core.controller.BaseController;
import com.lxs.legou.core.po.ResponseBean;
import com.lxs.legou.item.po.Spu;
import com.lxs.legou.item.service.ISpuService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Title:商品(spu)
 */
@RestController
@RequestMapping(value = "/item/spu")
public class SpuController extends BaseController<ISpuService, Spu> {

    @ApiOperation(value="保存商品信息", notes="保存商品信息")
    @PostMapping("/save-spu")
    public ResponseBean saveSpu(@RequestBody Spu spu) throws Exception {
        ResponseBean rm = new ResponseBean();
        try {
            service.saveSpu(spu);
        } catch (Exception e) {
            e.printStackTrace();
            rm.setSuccess(false);
            rm.setMsg("保存失败");
        }
        return rm;
    }

    @ApiOperation(value="查询所有", notes="查询所有spu")
    @GetMapping("/list-all")
    public List<Spu> selectAll() {
        return service.list(new Spu());
    }

}