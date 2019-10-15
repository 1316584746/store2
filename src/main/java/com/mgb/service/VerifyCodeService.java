package com.mgb.service;

public interface VerifyCodeService {

    void sendVerifyCode(String phoneNumber);
    boolean validate(String phoneNumber, String verifyCode);

}
