package com.zhiyou100.service;

import java.util.List;

import com.zhiyou100.model.House;
import com.zhiyou100.util.PageUtil;

public interface HouseService {
	/**
	 * 返回全部的房屋信息
	 * @param filed 
	 * @param keywords 
	 * @param end 
	 * @param start 
	 */
	List<House> findAll(PageUtil page, String keywords, String filed);
	/**
	 * 查询房屋从数据量
	 * @param filed 
	 * @param keywords 
	 */
	int count(String keywords, String filed);
	/**
	 * 根据id查房子信息
	 */
	House findHouseById(int hid);
	/**
	 * 更新数据
	 */
	void edit(House house);

}
