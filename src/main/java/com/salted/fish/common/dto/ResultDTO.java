package com.salted.fish.common.dto;


public class ResultDTO {

    private String code;
    private String message;
    private Object data;

    public static ResultDTO success(Object data) {
        ResultDTO dto = new ResultDTO();
        dto.setCode("200");
        dto.setMessage("操作成功");
        dto.setData(data);
        return dto;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
