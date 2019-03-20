package com.zhiyou100.model;

import java.util.Date;
import java.util.List;

/**
 * @author QiuShiju
 * @date 2018年11月20日
 * @desc 角色
 */
public class Role {
	private int roid;
	private String roname;
	private String rodesc;
	private Date roaddTime;

	/**
	 * 一个用户多个权限
	 *  用于封装该用户的多个角色
	 */
	private List<Auth> authList;

	public List<Auth> getAuthList() {
		return authList;
	}

	public void setAuthList(List<Auth> authList) {
		this.authList = authList;
	}

	public int getRoid() {
		return this.roid;
	};

	public void setRoid(int roid) {
		this.roid = roid;
	}

	public String getRoname() {
		return this.roname;
	};

	public void setRoname(String roname) {
		this.roname = roname;
	}

	public String getRodesc() {
		return this.rodesc;
	};

	public void setRodesc(String rodesc) {
		this.rodesc = rodesc;
	}

	public Date getRoaddTime() {
		return this.roaddTime;
	};

	public void setRoaddTime(Date roaddTime) {
		this.roaddTime = roaddTime;
	}

	@Override
	public String toString() {
		return "Role [roid=" + roid + ", roname=" + roname + ", rodesc=" + rodesc + ", roaddTime=" + roaddTime
				+ ", authList=" + authList + "]";
	}

	
}