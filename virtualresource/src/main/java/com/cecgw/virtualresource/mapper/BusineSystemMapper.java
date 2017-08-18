package com.cecgw.virtualresource.mapper;

import java.util.List;

import com.cecgw.virtualresource.entity.BusineSystemEntity;

public interface BusineSystemMapper {

	public List<BusineSystemEntity> getAllBusineSystemes();
	public BusineSystemEntity getBusineSystemInfoById(String id);
	public void addBusineSystem(BusineSystemEntity bs);
	public void updateBusineSystemInfo(BusineSystemEntity bs);
	public void deleteBusineSystemById(String id);
}
