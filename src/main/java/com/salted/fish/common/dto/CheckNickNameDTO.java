package com.salted.fish.common.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class CheckNickNameDTO {

    /**
     * 昵称
     */
    @NotEmpty(message = "userNickName is not null")
    private String userNickName;
}
