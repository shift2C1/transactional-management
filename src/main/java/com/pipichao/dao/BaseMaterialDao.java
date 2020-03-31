package com.pipichao.dao;

import com.pipichao.entity.BaseMaterial;

public interface BaseMaterialDao {
    int deleteByPrimaryKey(String materialNo);

    int insert(BaseMaterial record);

    int insertSelective(BaseMaterial record);

    BaseMaterial selectByPrimaryKey(String materialNo);

    int updateByPrimaryKeySelective(BaseMaterial record);

    int updateByPrimaryKey(BaseMaterial record);
}