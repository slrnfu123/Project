package com.wine.web.wineservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wine.web.dao.ServiceDao;
import com.wine.web.entity.WineEntity;

@Service
public class WineServiceImp implements WineService{
	
	@Autowired
	private ServiceDao serviceDao;

	@Override
	public List<WineEntity> getList() {
		List<WineEntity> list = serviceDao.getList();
		return list;
	}
}
