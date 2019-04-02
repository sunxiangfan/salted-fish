package com.salted.fish.common.entity;


import lombok.Data;

/**
 * 标签字典表 fish_label_dict
 *
 * @author shop
 * @date 2019-04-02
 */
@Data
public class FishLabelDict {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Integer id;
    /**
     * 标签code
     */
    private String labelCode;
    /**
     * 标签名称
     */
    private String labelName;
}
