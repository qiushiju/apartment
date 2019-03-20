package com.zhiyou100.service.impl;

import com.zhiyou100.dao.LoginDao;
import com.zhiyou100.dao.impl.LoginDaoImpl;
import com.zhiyou100.model.User;
import com.zhiyou100.service.LoginService;

public class LoginServiceImpl implements LoginService {
	// 创建dao对象
	LoginDao dao = new LoginDaoImpl();
	@Override
	public User findUserByUsername(String username) {
		// 调用dao的方法,查找用户
		User user = dao.findUserByUsername(username);
		return user;
	}

}
