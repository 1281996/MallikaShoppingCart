package com.mallika.dao;

import java.util.Map;
import java.util.TreeMap;

import com.mallika.pojo.UserInformation;

public class DAOClass {
public Map<Integer, UserInformation> getAllInformation(){
	
	Map<Integer,UserInformation> map=new TreeMap<>();
	map.put(1234, new UserInformation("hyd", "ap", "india", 1234));
	return map;
	
}
	
	
}
