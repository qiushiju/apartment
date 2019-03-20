package com.zhiyou100.model;

import java.util.Date;
/**
 * @author QiuShiju
 * @date 2018年11月20日
 * @desc 租户
 */
public class Lessee {
      private  int lid;
      private  String lname;
      private  String ltel;
      private  int lsex;
      private  String lnp;
      private  String lidCard;
      private  Date laddTime;
      public  int  getLid(){
      		return  this.lid;
      };
      public  void  setLid(int lid){
      	this.lid=lid;
      }  
     
      public  String  getLname(){
      		return  this.lname;
      };
      public  void  setLname(String lname){
      	this.lname=lname;
      }  
     
      public  String  getLtel(){
      		return  this.ltel;
      };
      public  void  setLtel(String ltel){
      	this.ltel=ltel;
      }  
     
      public  int  getLsex(){
      		return  this.lsex;
      };
      public  void  setLsex(int lsex){
      	this.lsex=lsex;
      }  
     
      public  String  getLnp(){
      		return  this.lnp;
      };
      public  void  setLnp(String lnp){
      	this.lnp=lnp;
      }  
     
      public  String  getLidCard(){
      		return  this.lidCard;
      };
      public  void  setLidCard(String lidCard){
      	this.lidCard=lidCard;
      }  
     
      public  Date  getLaddTime(){
      		return  this.laddTime;
      };
      public  void  setLaddTime(Date laddTime){
      	this.laddTime=laddTime;
      }
	@Override
	public String toString() {
		return "Lessee [lid=" + lid + ", lname=" + lname + ", ltel=" + ltel + ", lsex=" + lsex + ", lnp=" + lnp
				+ ", lidCard=" + lidCard + ", laddTime=" + laddTime + "]";
	}  
     
    
}