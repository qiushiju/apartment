package com.zhiyou100.model;

/**
 * @author: Qiushiju
 * @Description:权限
 */  
public class Auth {
	private int aid;
	private String adesc;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAdesc() {
		return adesc;
	}
	public void setAdesc(String adesc) {
		this.adesc = adesc;
	}
	@Override
	public String toString() {
		return "Auth [aid=" + aid + ", adesc=" + adesc + "]";
	}
	
}
