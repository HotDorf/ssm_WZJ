package com.itm.dao;

import com.itm.domain.Items;

public interface ItemsDao {

    //根据id查询数据
    public Items findById(Integer id);

    public Items findAll();
}
