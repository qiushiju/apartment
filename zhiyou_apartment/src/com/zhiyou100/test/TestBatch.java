package com.zhiyou100.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import com.zhiyou100.util.DBUtil;

public class TestBatch {
	@Test
	public void testStatementBatch() throws SQLException{
		// 开始时间
		long startTime = System.currentTimeMillis();
		// 获得连接对象
		Connection connection = DBUtil.getConnection();
		// 生成Statement执行语句对象
		Statement statement = connection.createStatement();
		for(int i=1;i<=1000;i++){ // 1百万数据-->经测试非常慢,改为1000
			// sql语句 
			String sql = "insert into testbatch(id,name) values("+i+",'admin"+i+"')";
			// 添加到缓存区
			statement.addBatch(sql);
			if(i%100==0){
				// 缓存区有100条数据时执行
				statement.executeBatch();
				// 执行完清空缓冲区
				statement.clearBatch();
				System.out.println("共插入"+i+"条数据");
			}
		}
		// 关闭连接
		DBUtil.closeAll(null, statement, connection);
		// 开始时间
		long endTime = System.currentTimeMillis();
		System.out.println("共计耗时"+(endTime-startTime)+"毫秒");
	}
	@Test
	public void testPrepareStatementBatch() throws SQLException{
		// 开始时间
		long startTime = System.currentTimeMillis();
		// 获得连接对象
		Connection connection = DBUtil.getConnection();
		// sql语句
		String sql = "insert into testbatch(id,name) values(?,?)";
		// 生成PrepareStatement执行语句对象
		PreparedStatement ps = connection.prepareStatement(sql);
		for(int i=1;i<=1000;i++){
			// 向?处设置实参
			ps.setInt(1, i);
			ps.setString(2, "admin"+i);
			// 向缓冲区添加sql语句
			ps.addBatch();
			if(i%100==0){
				// 缓存区有100条数据时执行
				ps.executeBatch();
				// 执行完清空缓存区
				ps.clearBatch();
				System.out.println("共插入"+i+"条数据");
			}
		}
		// 关闭连接
		DBUtil.closeAll(null, ps, connection);
		// 开始时间
		long endTime = System.currentTimeMillis();
		System.out.println("共计耗时"+(endTime-startTime)+"毫秒");
	}
	@Test
	public void testPrepareStatementDeleteBatch() throws SQLException{
		// 开始时间
		long startTime = System.currentTimeMillis();
		// 获得连接对象
		Connection connection = DBUtil.getConnection();
		// sql语句
		String sql = "delete from testbatch where id = ?";
		// 生成PrepareStatement执行语句对象
		PreparedStatement ps = connection.prepareStatement(sql);
		for(int i=1;i<=1000;i++){
			// 向?处设置实参
			ps.setInt(1, i);
			// 向缓冲区添加sql语句
			ps.addBatch();
			if(i%100==0){
				// 缓存区有100条数据时执行
				ps.executeBatch();
				// 执行完清空缓存区
				ps.clearBatch();
				System.out.println("共删除"+i+"条数据");
			}
		}
		// 关闭连接
		DBUtil.closeAll(null, ps, connection);
		// 开始时间
		long endTime = System.currentTimeMillis();
		System.out.println("共计耗时"+(endTime-startTime)+"毫秒");
	}
}






