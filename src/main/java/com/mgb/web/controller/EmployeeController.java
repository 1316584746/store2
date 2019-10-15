package com.mgb.web.controller;

import com.mgb.dto.ResultDto;
import com.mgb.pojo.Employee;
import com.mgb.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class EmployeeController {

     @Autowired
    private EmployeeService employeeService;




    @RequestMapping("/empl/list")
     public  String list(Model model){
      //调用service获取数据
      List<Employee> employees = employeeService.getAllEmpl();
      //将数据转发到employee.jsp
       model.addAttribute("employees",employees);
       //返回试图
      return  "empl/employee-list";
  }

    /**
     * 员工的添加页面
     * @return
     */
  @RequestMapping("/empl/add")
    public  String add(){

      return "employee-add";
  }


    /**
     * 员工添加的动作
     */
    @PostMapping("/empl/add/action")
    @ResponseBody
    public ResultDto<Employee> addAction(Employee employee){

        return  employeeService.addEmpl(employee);


    }

}
