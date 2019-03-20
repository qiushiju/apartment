package com.zhiyou100.model;

import java.util.Date;

/**
 * @author QiuShiju
 * @date 2018年11月20日
 * @desc 合同类
 */
public class Contract {
      private  int cid;
      private  String cnum;
      private  int chid;
      private  int clid;
      private  Date ctime;
      private  Date cstartTime;
      private  Date cendTime;
      private  double ctotalMoney;
      private  int cpayType;
      
      public  int  getCid(){
      		return  this.cid;
      };
      public  void  setCid(int cid){
      	this.cid=cid;
      }  
     
      public  String  getCnum(){
      		return  this.cnum;
      };
      public  void  setCnum(String cnum){
      	this.cnum=cnum;
      }  
     
      public  int  getChid(){
      		return  this.chid;
      };
      public  void  setChid(int chid){
      	this.chid=chid;
      }  
     
      public  int  getClid(){
      		return  this.clid;
      };
      public  void  setClid(int clid){
      	this.clid=clid;
      }  
     
      public  Date  getCtime(){
      		return  this.ctime;
      };
      public  void  setCtime(Date ctime){
      	this.ctime=ctime;
      }  
     
      public  Date  getCstartTime(){
      		return  this.cstartTime;
      };
      public  void  setCstartTime(Date cstartTime){
      	this.cstartTime=cstartTime;
      }  
     
      public  Date  getCendTime(){
      		return  this.cendTime;
      };
      public  void  setCendTime(Date cendTime){
      	this.cendTime=cendTime;
      }  
     
      public  double  getCtotalMoney(){
      		return  this.ctotalMoney;
      };
      public  void  setCtotalMoney(double ctotalMoney){
      	this.ctotalMoney=ctotalMoney;
      }  
     
      public  int  getCpayType(){
      		return  this.cpayType;
      };
      public  void  setCpayType(int cpayType){
      	this.cpayType=cpayType;
      }
	@Override
	public String toString() {
		return "Contract [cid=" + cid + ", cnum=" + cnum + ", chid=" + chid + ", clid=" + clid + ", ctime=" + ctime
				+ ", cstartTime=" + cstartTime + ", cendTime=" + cendTime + ", ctotalMoney=" + ctotalMoney
				+ ", cpayType=" + cpayType + "]";
	}  
     
    
}