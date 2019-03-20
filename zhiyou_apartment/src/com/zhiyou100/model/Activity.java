package com.zhiyou100.model;

import java.util.Date;

/**
 * @author QiuShiju
 * @date 2018年11月20日
 * @desc 活动类
 */
public class Activity {
      private  int aid;
      private  Date atime;
      private  String asubject;
      private  String aintr;
      private  String aaddress;
      private  double aprice;
      public  int  getAid(){
      		return  this.aid;
      };
      public  void  setAid(int aid){
      	this.aid=aid;
      }  
     
      public  Date  getAtime(){
      		return  this.atime;
      };
      public  void  setAtime(Date atime){
      	this.atime=atime;
      }  
     
      public  String  getAsubject(){
      		return  this.asubject;
      };
      public  void  setAsubject(String asubject){
      	this.asubject=asubject;
      }  
     
      public  String  getAintr(){
      		return  this.aintr;
      };
      public  void  setAintr(String aintr){
      	this.aintr=aintr;
      }  
     
      public  String  getAaddress(){
      		return  this.aaddress;
      };
      public  void  setAaddress(String aaddress){
      	this.aaddress=aaddress;
      }  
     
      public  double  getAprice(){
      		return  this.aprice;
      };
      public  void  setAprice(double aprice){
      	this.aprice=aprice;
      }
	@Override
	public String toString() {
		return "Activity [aid=" + aid + ", atime=" + atime + ", asubject=" + asubject + ", aintr=" + aintr
				+ ", aaddress=" + aaddress + ", aprice=" + aprice + "]";
	}  
     
    
}