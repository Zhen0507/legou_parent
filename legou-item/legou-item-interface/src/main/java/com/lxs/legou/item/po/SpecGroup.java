package com.lxs.legou.item.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.lxs.legou.core.po.BaseEntity;
import lombok.Data;

import java.util.List;
/*
 * 规格参数
 */
@Data
@TableName("spec_group_")
@JsonIgnoreProperties(value = {"handler"})
public class SpecGroup extends BaseEntity {

    @TableField("cid_")
    private Long cid;

    @TableField("name_")
    private String name;

    @TableField(exist = false)
    private List<SpecParam> params; // 该组下的所有规格参数集合

}
