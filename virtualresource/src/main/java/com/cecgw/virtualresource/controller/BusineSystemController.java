package com.cecgw.virtualresource.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cecgw.virtualresource.entity.BusineSystemEntity;
import com.cecgw.virtualresource.service.BusineSystemService;

@RestController
@RequestMapping(value = "virtualResource/busineSystem")
public class BusineSystemController {

	@Autowired
	BusineSystemService busineSystemService;

	@RequestMapping(value = "/getAll")
	public List<BusineSystemEntity> getAllBusineSystemes() {
		return busineSystemService.getAllBusineSystemes();
	}

	@RequestMapping(value = "/getOneById/{id}")
	public BusineSystemEntity getBusineSystemInfo(@PathVariable("id") String id) {
		return busineSystemService.getBusineSystemInfoById(id);
	}

	@RequestMapping(value = "/update/{id}")
	public Object updateBusineSystemInfo(
			@PathVariable("id") String id, @RequestBody BusineSystemEntity bs) {
		 busineSystemService.updateBusineSystemInfo(id, bs);
		 return null;
	}
	
	@RequestMapping(value = "/delete/{id}")
	public Object deleteBusineSystemInfo(
			@PathVariable("id") String id) {
		 busineSystemService.deleteBusineSystemById(id);
		 return null;
	}

}
