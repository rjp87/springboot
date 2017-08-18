package com.cecgw.virtualresource.service;

import java.util.List;

import com.cecgw.virtualresource.entity.BusineSystemEntity;

public interface BusineSystemService {

	public List<BusineSystemEntity> getAllBusineSystemes();
	public BusineSystemEntity getBusineSystemInfoById(String id);
	public void addBusineSystem(BusineSystemEntity bs);
	public void updateBusineSystemInfo(String id, BusineSystemEntity bs);
	public void deleteBusineSystemById(String id);
}
