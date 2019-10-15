package com.mgb.service;

import com.mgb.dto.ResultDto;
import com.mgb.pojo.Goods;

public interface GoodsService {

    /**
     * 货物添加方法
     * @param goods
     * @return
     */
    ResultDto<Goods>   addgoods(Goods goods);



 }
