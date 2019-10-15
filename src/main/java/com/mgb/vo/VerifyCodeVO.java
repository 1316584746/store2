package com.mgb.vo;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;

/**
 * 封装了验证码 手机号 发送时间
 */
@Getter
@Setter
public class VerifyCodeVO {
    private String phoneNumber;
    private String code;
    private Date sendTime;


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public VerifyCodeVO(String phoneNumber, String code, Date sendTime) {
        this.phoneNumber = phoneNumber;
        this.code = code;
        this.sendTime = sendTime;
    }
    public VerifyCodeVO() {
    }
}
