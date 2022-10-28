package com.hwh.lifeupdate.common;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.hwh.lifeupdate.common.enums.APIStatusEnum;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * @description:
 * @author: HWH
 * @create: 2022-10-28 15:46
 **/

public class APIResult<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 错误码
     */
    @ApiModelProperty(value = "代码", required = true, example = "S-00001")
    private String code;

    /**
     * 接口返回信息
     */
    @ApiModelProperty(value = "消息", required = true, example = "成功")
    private String msg;

    /**
     * 接口返回值
     */
    @ApiModelProperty(value = "body")
    private T data;

    /**
     * 请求成功与否
     * true 成功 false 失败
     */
    @ApiModelProperty(value = "请求成功与否", required = false, example = "true")
    private boolean isSuccess;

    public APIResult() {
        super();
    }

    public APIResult(String code, String msg, T data) {
        super();
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> APIResult<T> success(T data){
        return new APIResult<>(APIStatusEnum.SUCCESS.getCode(), APIStatusEnum.SUCCESS.getMsg(), data);
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this, SerializerFeature.DisableCircularReferenceDetect);
    }

}
