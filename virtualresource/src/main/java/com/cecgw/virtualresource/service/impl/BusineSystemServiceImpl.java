package com.cecgw.virtualresource.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cecgw.virtualresource.entity.BusineSystemEntity;
import com.cecgw.virtualresource.mapper.BusineSystemMapper;
import com.cecgw.virtualresource.service.BusineSystemService;

@Component
public class BusineSystemServiceImpl implements BusineSystemService{

	@Autowired
	BusineSystemMapper busineSystemDao;

	public List<BusineSystemEntity> getAllBusineSystemes(){
		
		return busineSystemDao.getAllBusineSystemes();
	}
	
	public BusineSystemEntity getBusineSystemInfoById(String id){
		return busineSystemDao.getBusineSystemInfoById(id);
	}
	
	public void addBusineSystem(BusineSystemEntity bs){
		busineSystemDao.addBusineSystem(bs);
	}
	
	public void updateBusineSystemInfo(String id, BusineSystemEntity bs){
		bs.setId(id);
		busineSystemDao.updateBusineSystemInfo(bs);
	}
	
	public void deleteBusineSystemById(String id){
		busineSystemDao.deleteBusineSystemById(id);
	}
}
