package com.salted.fish.common.dto;


public class ResultDTO {

    private Integer code;
    private Object data;

    public static ResultDTO success(Object data) {
        ResultDTO dto = new ResultDTO();
        dto.setCode(20000);
        dto.setData(data);
        return dto;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
