package com.salted.fish.common.dto;

import lombok.Data;

@Data
public class ResultDTO {

    private Integer code;
    private String message;
    private Object data;

    public static ResultDTO success() {
        ResultDTO dto = new ResultDTO();
        dto.setCode(200);
        dto.setMessage("操作成功");
        dto.setData(null);
        return dto;
    }

    public static ResultDTO success(Object data) {
        ResultDTO dto = new ResultDTO();
        dto.setCode(200);
        dto.setMessage("操作成功");
        dto.setData(data);
        return dto;
    }

    public static ResultDTO fail(String message) {
        ResultDTO dto = new ResultDTO();
        dto.setCode(9999);
        dto.setMessage(message);
        dto.setData(null);
        return dto;
    }

    public static ResultDTO fail() {
        ResultDTO dto = new ResultDTO();
        dto.setCode(9999);
        dto.setMessage("系统错误");
        dto.setData(null);
        return dto;
    }
}
