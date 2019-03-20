package com.zhiyou100.service.impl;

import java.util.List;

import com.zhiyou100.dao.HouseDao;
import com.zhiyou100.dao.impl.HouseDaoImpl;
import com.zhiyou100.model.House;
import com.zhiyou100.service.HouseService;
import com.zhiyou100.util.PageUtil;

public class HouseServiceImpl implements HouseService {
	// 创建dao层对象
	HouseDao dao = new HouseDaoImpl();
	
	@Override
	public List<House> findAll(PageUtil page,String keywords, String filed) {
		// 调用dao的方法,得到全部房子信息
		List<House> houses = dao.findAll(page,keywords,filed);
		return houses;
	}

	@Override
	public int count(String keywords, String filed) {
		int total = dao.count(keywords,filed);
		return total;
	}

	@Override
	public House findHouseById(int hid) {
		House house = dao.findHouseById(hid);
		return house;
	}

	@Override
	public void edit(House house) {
		dao.edit(house);
	}

}
