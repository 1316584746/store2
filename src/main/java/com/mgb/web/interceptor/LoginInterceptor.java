package com.mgb.web.interceptor;

import com.mgb.pojo.Employee;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @auther 煤小二
 * @Date 2019/10/9 19:41
 * 登录拦截器
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
   //1.判断用户是否登录
        System.out.println("拦截l!");
        //2.是否存在session
        HttpSession session = httpServletRequest.getSession();
        //3.获取session里面保存的登录用户的数据
        Employee employee = (Employee) session.getAttribute("login");
       //判断employee是否为空值
        if(employee==null){
            //获取conttextpath
            String contextPath = httpServletRequest.getContextPath();
              //倘若没有登录页面从定向到登录页面
            httpServletResponse.sendRedirect(contextPath+"/login/page");
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
