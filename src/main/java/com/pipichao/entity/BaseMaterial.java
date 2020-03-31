package com.pipichao.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * base_material
 * @author 
 */
@Data
public class BaseMaterial implements Serializable {
    /**
     * 物资编号
     */
    private String materialNo;

    /**
     * 物资类别编号
     */
    private String categoryNo;

    /**
     * 物资名称
     */
    private String name;

    /**
     * 物资简称
     */
    private String shortName;

    /**
     * 规格型号
     */
    private String model;

    /**
     * 计量单位
     */
    private String unit;

    /**
     * 物资描述
     */
    private String description;

    /**
     * 状态(启用、禁用)
     */
    private Short status;

    /**
     * 删除标识
     */
    private Short deleteFlag;

    /**
     * 操作人Id
     */
    private String opBy;

    /**
     * 操作日期
     */
    private Date opAt;

    private static final long serialVersionUID = 1L;
}