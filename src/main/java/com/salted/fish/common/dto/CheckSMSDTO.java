package com.salted.fish.common.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class CheckSMSDTO {

    /**
     * 用户手机号
     */
    @NotEmpty(message = "userPhone is not null")
    private String userPhone;
    /**
     * 验证码
     */
    @NotEmpty(message = "code is not null")
    private String code;
}
