package com.zhiyou100.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.zhiyou100.dao.HouseDao;
import com.zhiyou100.model.House;
import com.zhiyou100.util.DBUtil;
import com.zhiyou100.util.PageUtil;

public class HouseDaoImpl implements HouseDao {
	/**
	 * 查询全部的房子信息
	 */
	@Override
	public List<House> findAll(PageUtil page,String keywords, String filed) {
		Connection conn = DBUtil.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<House> houses = new ArrayList<>();
		String sqlInit = "select hid,haddress,hfloor,hroomNum,harea,hdir,hdeco,"
				+ "hair,hprice,hrentStatus,himage,haddTime,hupdateTime FROM house";
		StringBuilder sb = new StringBuilder(sqlInit);
		if(!"".equals(keywords)&&!"".equals(filed)){
			sb.append(" where "+filed+" like '%"+keywords+"%' ");
		}
		sb.append(" limit ?,? ");
		System.out.println("sql语句拼接:"+sb.toString());
		try {
			ps = conn.prepareStatement(sb.toString());
			ps.setInt(1, page.getStart());
			ps.setInt(2, page.getEnd());		
			rs = ps.executeQuery();
			while(rs.next()){
				House house = new House();
				house.setHaddress(rs.getString("haddress"));
				house.setHaddTime(rs.getDate("haddTime"));
				house.setHair(rs.getInt("hair"));
				house.setHarea(rs.getString("harea"));
				house.setHdeco(rs.getInt("hdeco"));
				house.setHdir(rs.getString("hdir"));
				house.setHfloor(rs.getString("hfloor"));
				house.setHid(rs.getInt("hid"));
				house.setHprice(rs.getDouble("hprice"));
				house.setHrentStatus(rs.getInt("hrentStatus"));
				house.setHroomNum(rs.getInt("hroomNum"));
				house.setHupdateTime(rs.getDate("hupdateTime"));
				houses.add(house);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DBUtil.closeAll(rs, ps, conn);
		return houses;
	}

	@Override
	public int count(String keywords, String filed) {
		Connection conn = DBUtil.getConnection();
		Statement s = null;
		ResultSet rs = null;
		int total = 0;
		String sqlInit = "select count(hid) as total from house ";
		StringBuilder sb = new StringBuilder(sqlInit);
		if(!"".equals(keywords)&&!"".equals(filed)){
			sb.append(" where "+filed+" like '%"+keywords+"%'");
		}
		System.out.println("拼接的sql语句: "+sb.toString());
		try {
			 s = conn.createStatement();
			 rs = s.executeQuery(sb.toString());
			 if(rs.next()){
				total = rs.getInt("total");
			 }
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DBUtil.closeAll(rs, s, conn);
		return total;
	}

	@Override
	public House findHouseById(int hid) {
		Connection conn = DBUtil.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		House house = null;
		String sql = "select hid,haddress,hfloor,hroomNum,harea,hdir,hdeco,hair,hprice,"
				+ "hrentStatus,himage,haddTime,hupdateTime FROM house where hid=?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, hid);
			rs = ps.executeQuery();
			if(rs.next()){
				house = new House();
				house.setHaddress(rs.getString("haddress"));
				house.setHaddTime(rs.getDate("haddTime"));
				house.setHair(rs.getInt("hair"));
				house.setHarea(rs.getString("harea"));
				house.setHdeco(rs.getInt("hdeco"));
				house.setHdir(rs.getString("hdir"));
				house.setHfloor(rs.getString("hfloor"));
				house.setHid(rs.getInt("hid"));
				house.setHprice(rs.getDouble("hprice"));
				house.setHrentStatus(rs.getInt("hrentStatus"));
				house.setHroomNum(rs.getInt("hroomNum"));
				house.setHupdateTime(rs.getDate("hupdateTime"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DBUtil.closeAll(rs, ps, conn);
		return house;
	}

	@Override
	public void edit(House house) {
		Connection conn = DBUtil.getConnection();
		PreparedStatement ps = null;
		ResultSet rs = null;
		String sql = "UPDATE  house SET haddress=?,hfloor=?,hroomNum=?,harea=?,hdir=?,"
				+ "hdeco=?,hair=?,hprice=?,hrentStatus=?,hupdateTime=? where hid = ?";
		try {
			ps = conn.prepareStatement(sql );
			ps.setString(1,house.getHaddress());
			ps.setString(2, house.getHfloor());
			ps.setInt(3, house.getHroomNum());
			ps.setString(4,house.getHarea());
			ps.setString(5,house.getHdir());
			ps.setInt(6,house.getHdeco());
			ps.setInt(7, house.getHair());
			ps.setDouble(8,house.getHprice());
			ps.setInt(9, house.getHrentStatus());
			Date hupdateTime = house.getHupdateTime();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String dateStr = sdf.format(hupdateTime);
			ps.setString(10, dateStr);
			ps.setInt(11,  house.getHid());
			int i = ps.executeUpdate();
			if(i>0){
				System.out.println("更新成功");
			}else{
				System.out.println("更新失败");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
