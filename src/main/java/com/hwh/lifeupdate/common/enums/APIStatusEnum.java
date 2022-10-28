package com.hwh.lifeupdate.common.enums;

/**
 * @description:
 * @author: HWH
 * @create: 2022-10-28 15:46
 **/

public enum APIStatusEnum {

    SUCCESS("500", "操作成功");

    private String code;
    private String msg;

    APIStatusEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
