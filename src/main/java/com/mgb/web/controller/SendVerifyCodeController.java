package com.mgb.web.controller;

import com.mgb.service.VerifyCodeService;
import com.mgb.utils.JSONResult;
import com.mgb.vo.VerifyCodeVO;
import com.mgb.utils.UserContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SendVerifyCodeController {


    @Autowired
     VerifyCodeService VerifyCodeService;

    /**
     * 发送验证码
     * @param phoneNumber
     * @return
     */
    @RequestMapping("sendVerifyCode")
    @ResponseBody
    public JSONResult sendVerifyCode(String phoneNumber){
        JSONResult json = new JSONResult();
        try {
            this.VerifyCodeService.sendVerifyCode(phoneNumber);
            System.out.println(phoneNumber);
        } catch (Exception e) {
            json.setSuccess(false);
            json.setMsg(e.getMessage());
        }
        return json ;

    }

    @RequestMapping("bindPhone")
    @ResponseBody
    public JSONResult bindPhone(String verifyCode,String phoneNumber){
        JSONResult json = new JSONResult();
        try {
            //将得到的验证码值和电话号码存入Session中
            VerifyCodeVO vo=new VerifyCodeVO();
            vo.setCode(verifyCode);
            vo.setPhoneNumber(phoneNumber);
            UserContext.putVerifyCode(vo);
           this.VerifyCodeService.validate(phoneNumber,verifyCode);

      } catch (Exception e) {
            json.setSuccess(false);
            json.setMsg(e.getMessage());
        }

        return json ;

    }


}
