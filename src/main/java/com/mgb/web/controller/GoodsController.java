package com.mgb.web.controller;


import com.mgb.dto.ResultDto;
import com.mgb.pojo.Goods;
import com.mgb.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @auther 煤小二
 * @Date 2019/10/14 19:07
 */
@Controller
public class GoodsController{

//    @Autowired
//    private GoodsService goodsService;


//物品添加的页面
    @RequestMapping("/goods/list")
    public  String add(){
        return "/goods/good-list";
    }
    //物品添加的页面
    @RequestMapping("/goods/add")
    public  String add2(){
        return "/goods/goods-add";
    }
    //添加货物的动作
    @PostMapping("/goods/add/action")
    @ResponseBody
    public ResultDto<Goods> addAction(Goods goods){

//        return  goodsService.addgoods(goods);
            return  null;

    }
}
