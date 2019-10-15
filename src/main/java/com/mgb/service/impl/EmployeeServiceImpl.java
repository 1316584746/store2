package com.mgb.service.impl;

import com.mgb.dao.EmployeeMapper;
import com.mgb.dto.ResultDto;
import com.mgb.pojo.Employee;
import com.mgb.service.EmployeeService;
import com.mgb.utils.MD5Util;
import com.mgb.utils.commonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
@Service
//增加事务
@Transactional(rollbackFor = Exception.class)
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired//注入接口
    private EmployeeMapper employeeMapper;

    /**
     * 获取所有的员工
     * @return
     */
    @Override
    public List<Employee> getAllEmpl() {

        return employeeMapper.findAll();
    }


//登录的方法
    /**
     * 业务处理
     * @param employee
     * @return
     */
    @Override
    public ResultDto<Employee> login(Employee employee , HttpServletRequest request) {
        if(employee == null){
            return  new ResultDto<>(1001,"登录异常!!");
        }
        //验证用户名和密码是否为空
        if(employee.getERfid() ==null||employee.getERfid().isEmpty()){
            return  new ResultDto<>(1002,"用户数据错误");
        }
        //通过Dao查询数据库
       Employee  dbEmpl =employeeMapper.findByname(employee.getERfid());
        //验证是否为空
        if(dbEmpl==null){
            return  new ResultDto<>(1003,"不存在该员工");
        }
    //如果存在 比对密码
        if(!dbEmpl.getEPassword().equals(MD5Util.MD55(employee.getEPassword()))){
            return  new ResultDto<>(1004,"密码错误");
        }
        //保存成功登录的session的数据
        //1.获取session对象
        HttpSession session = request.getSession();
        //2.将登录成功的用户信息保存到session对象中
        session.setAttribute("login",dbEmpl);

        return new ResultDto<>(200,"登陆成功");
    }

    /**
     * 添加员工
     * @param employee
     * @return
     */
    @Override
    public ResultDto<Employee> addEmpl(Employee employee) {

        Employee empl = employeeMapper.getEmpl((int) employee.getELevel());
        String emplNum = commonUtil.creatEmplNum((int) employee.getELevel(), empl == null ? null : empl.getEId());
           employee.setEId(emplNum);
//密码加密
          employee.setEPassword(MD5Util.MD55(employee.getEPassword()));
        Integer save= employeeMapper.save(employee);

           if(save>0){
                return  new ResultDto<>(200,"添加成功!!");
           }

           return  new ResultDto<>(404,"添加失败!!");
    }

    /**
     * 密码修改
     * @param employee
     * @param request
     * @return
     */
    @Override
    public ResultDto<Employee> uppassword(Employee employee, HttpServletRequest request) {


        if(employee.getEPassword()==null || employee.getEPassword().isEmpty()){
            return  new ResultDto<>(101,"数据错误");
        }
         //查询数据库的信息
        Employee uppassword = employeeMapper.uppassword(employee.getEPassword());



        return null;
    }


}
