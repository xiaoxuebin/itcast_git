package com.itheima.service;

import com.itheima.pojo.Items;

import java.util.List;

public interface ItemsService {
    List<Items> findAll();

    int save(Items items);
}
