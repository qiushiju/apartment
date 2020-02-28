package com.zhiyou100.dao;

import java.util.List;

import com.zhiyou100.model.House;
import com.zhiyou100.util.PageUtil;

public interface HouseDao {

	List<House> findAll(PageUtil page, String keywords, String filed);

	int count(String keywords, String filed);

	House findHouseById(int hid);

	void edit(House house);
	
	void test20200228up();
        void test20200228down1();
	void test20200228down2();

}
