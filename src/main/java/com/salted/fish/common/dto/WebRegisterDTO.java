package com.salted.fish.common.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class WebRegisterDTO {

    /**
     * 用户手机号
     */
    @NotEmpty(message = "userPhone is not null")
    private String userPhone;
    /**
     * 密码
     */
    @NotEmpty(message = "userPassword is not null")
    private String userPassword;
    /**
     * 密码
     */
    @NotEmpty(message = "userNickName is not null")
    private String userNickName;
}
