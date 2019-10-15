package com.mgb.web.controller;

import com.mgb.dto.ResultDto;
import com.mgb.pojo.Employee;
import com.mgb.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
public class LoginController {

    @Autowired
     private EmployeeService employeeService;
    /**
     * 登录页面显示
     * @return
     */
//    @RequestMapping("/login")
//    public  String  loginpage1(){
//        return "login2";
//    }

    @RequestMapping("/login/page")
    public  String loginpage(){
        return "login2";
    }

    /**
     * 登录的动作
     */
  @RequestMapping("/login/action")
  @ResponseBody
    public ResultDto<Employee> login(Employee employee , HttpServletRequest request){
      System.out.println(employee);
      return  employeeService.login(employee,request);
  }

  //退出登录的方法
  @RequestMapping("/logout")
  public  String logout(HttpServletRequest request){
     //清空session
      //1.获取得到session对象
      HttpSession session = request.getSession();
       //2.将保存的session数据置空null
      session.setAttribute("login",null);
      return "login2";
  }


    /**
     * 忘记密码
     */
@RequestMapping("/phone/back-third-look")
    public  String  Fpassword(){

    return  "/phone/back-third-look";
}

    /**
     * 密码修改跳转
     */
    @RequestMapping("/phone/back-five-look")
    public   ResultDto<Employee>  Fpassword2(Employee employee,HttpServletRequest request){

        System.out.println(employee);
        return  null;
    }

    /**
     * 密码修改完成
     */
@RequestMapping("/phone/back-six-look")
    public  String Fpassword2(){
    return  "/phone/back-six-look";
}


}
