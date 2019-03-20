package com.zhiyou100.model;

import java.util.Date;
/**
 * @author QiuShiju
 * @date 2018年11月20日
 * @desc 后勤
 */
public class Logi {
      private  int loid;
      private  String loname;
      private  String loidCard;
      private  String lotel;
      private  int losex;
      private  Date loaddTime;
      private  double losalary;
      public  int  getLoid(){
      		return  this.loid;
      };
      public  void  setLoid(int loid){
      	this.loid=loid;
      }  
     
      public  String  getLoname(){
      		return  this.loname;
      };
      public  void  setLoname(String loname){
      	this.loname=loname;
      }  
     
      public  String  getLoidCard(){
      		return  this.loidCard;
      };
      public  void  setLoidCard(String loidCard){
      	this.loidCard=loidCard;
      }  
     
      public  String  getLotel(){
      		return  this.lotel;
      };
      public  void  setLotel(String lotel){
      	this.lotel=lotel;
      }  
     
      public  int  getLosex(){
      		return  this.losex;
      };
      public  void  setLosex(int losex){
      	this.losex=losex;
      }  
     
      public  Date  getLoaddTime(){
      		return  this.loaddTime;
      };
      public  void  setLoaddTime(Date loaddTime){
      	this.loaddTime=loaddTime;
      }  
     
      public  double  getLosalary(){
      		return  this.losalary;
      };
      public  void  setLosalary(double losalary){
      	this.losalary=losalary;
      }
	@Override
	public String toString() {
		return "Logi [loid=" + loid + ", loname=" + loname + ", loidCard=" + loidCard + ", lotel=" + lotel + ", losex="
				+ losex + ", loaddTime=" + loaddTime + ", losalary=" + losalary + "]";
	}  
     
    
}