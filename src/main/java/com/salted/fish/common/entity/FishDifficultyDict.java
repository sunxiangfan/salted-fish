package com.salted.fish.common.entity;


import lombok.Data;

/**
 * 难度字典表 fish_difficulty_dict
 *
 * @author shop
 * @date 2019-04-19
 */
@Data
public class FishDifficultyDict {

    /**
     * 主键ID
     */
    private Integer id;
    /**
     * 难度编码
     */
    private String difficultyCode;
    /**
     * 难度名称
     */
    private String difficultyName;

}
