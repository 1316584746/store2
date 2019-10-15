package com.mgb.service;

import com.mgb.dto.ResultDto;
import com.mgb.pojo.Employee;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 *接口的方法
 */
public interface EmployeeService {

    List<Employee> getAllEmpl();

    /**
     * 登录的方法
     * @param employee
     * @return
     */
    ResultDto<Employee>  login(Employee employee , HttpServletRequest request);

    /**
     * 员工添加
     */

    ResultDto<Employee>  addEmpl(Employee employee);

    /**
     * 密码修改
     */
   ResultDto<Employee>  uppassword(Employee employee , HttpServletRequest request);



}
