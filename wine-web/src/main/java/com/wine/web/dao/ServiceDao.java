package com.wine.web.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.wine.web.entity.WineEntity;

@Mapper
public interface ServiceDao {
	
	
	@Select("SELECT * FROM WINE")
	List<WineEntity> getList();
}
