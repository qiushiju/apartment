package com.zhiyou100.model;

import java.util.Date;
import java.util.List;
/**
 * @author QiuShiju
 * @date 2018年11月20日
 * @desc 用户
 */
public class User {
      private  int uid;
      private  String uname;
      private  String upassword;
      private  String urealname;
      private  int uroid;
      private  Date uaddTime;
      private  int ustatus;
      /**
       * 一个用户多个角色
       * 用于封装该用户的多个角色
       */
      private  List<Role> roleList;
      
      
      public List<Role> getRoleList() {
		return roleList;
	}
	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}
	public  int  getUid(){
      		return  this.uid;
      };
      public  void  setUid(int uid){
      	this.uid=uid;
      }  
     
      public  String  getUname(){
      		return  this.uname;
      };
      public  void  setUname(String uname){
      	this.uname=uname;
      }  
     
      public  String  getUpassword(){
      		return  this.upassword;
      };
      public  void  setUpassword(String upassword){
      	this.upassword=upassword;
      }  
     
      public  String  getUrealname(){
      		return  this.urealname;
      };
      public  void  setUrealname(String urealname){
      	this.urealname=urealname;
      }  
     
      public  int  getUroid(){
      		return  this.uroid;
      };
      public  void  setUroid(int uroid){
      	this.uroid=uroid;
      }  
     
      public  Date  getUaddTime(){
      		return  this.uaddTime;
      };
      public  void  setUaddTime(Date uaddTime){
      	this.uaddTime=uaddTime;
      }  
     
      public  int  getUstatus(){
      		return  this.ustatus;
      };
      public  void  setUstatus(int ustatus){
      	this.ustatus=ustatus;
      }
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", upassword=" + upassword + ", urealname=" + urealname
				+ ", uroid=" + uroid + ", uaddTime=" + uaddTime + ", ustatus=" + ustatus + ", roleList=" + roleList
				+ "]";
	}
	 
     
    
}