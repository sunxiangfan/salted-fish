package com.salted.fish.common.entity;


import lombok.Data;

/**
 * 栏目字典表 fish_column_dict
 *
 * @author shop
 * @date 2019-04-02
 */
@Data
public class FishColumnDict {

    private static final long serialVersionUID = 1L;

    /**
     * 主键ID
     */
    private Integer id;
    /**
     * 栏目code
     */
    private String columnCode;
    /**
     * 栏目名称
     */
    private String columnName;
}
