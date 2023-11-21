package com.springboot.controller;

import java.util.HashMap;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.zip.ZipCode;

@RestController
public class Controller {
	@RequestMapping("/add/{zipcode}")
	public ZipCode add(@PathVariable int zipcode)
	{
		HashMap<Integer,ZipCode> address=new HashMap<>();
		address.put(506006,new ZipCode("ts","wrngl","India"));
		address.put(506002,new ZipCode("ts","hnk","India"));
		address.put(506004,new ZipCode("ts","nsrpt","India"));
		
		return address.get(zipcode);
		
		
	}

}
