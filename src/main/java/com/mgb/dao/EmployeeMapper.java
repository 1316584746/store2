package com.mgb.dao;

import com.mgb.pojo.Employee;
import com.mgb.pojo.Goods;

import java.util.List;

public interface EmployeeMapper {

//     查找表Employee的所有有数据
  List<Employee>  findAll();

  //通过名字字段查找
    Employee findByname(String name);

//   添加员工
       Integer  save(Employee employee);
    //获取最新员工对的编号
       Employee getEmpl( Integer level);

       //修改密码
    Employee  uppassword(String ephone);


    //商品添加
    Integer addgoods(Goods goods);

 }
