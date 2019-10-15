package com.mgb.utils;

//封装Session,为登录之后的记录和判断服务;

import com.mgb.vo.VerifyCodeVO;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;


public class UserContext {
       //声明一个静态常量,作为Session中记录的对象,static减小内存,将常量放于常量池中
      private  static   final  String LOGIN_IN_SESSION="Employee";
    public static final String VERIFYCODE_IN_SESSION = "verifycode_in_session";

    /**
     * 获取HttpSession的方法
     * @return 从Spring中获取HttpSession的对象
     */
    private  static HttpSession getSession(){
        //从Spring中获取Session的方法
        //RequestContextHolder:Spring提供的用于在web访问中操作request相关请求属性
        //getRequestAttributes 获取request的属性集
        //强制转换.向下转型-->RequestAttributes转成ServletRequestAttributes,得到servlet相关操作
        //通过getRequest()得到request对象
        //Session默认生命周期30分钟;
        return   ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();

    }


//手机验证将用户手机信息的到的验证码传入和输出
    /**
     *存放 VerifyCodeVO
     */
    public static void putVerifyCode(VerifyCodeVO vo){
        getSession().setAttribute(VERIFYCODE_IN_SESSION, vo);

    }

    /**
     * 取出session中的verifyCodeVO
     * @return
     */
    public static VerifyCodeVO getVerifyCode(){
        VerifyCodeVO vo = (VerifyCodeVO) getSession().getAttribute(VERIFYCODE_IN_SESSION);
        return vo ;
    }

}