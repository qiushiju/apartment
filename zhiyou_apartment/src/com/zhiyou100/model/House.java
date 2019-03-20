package com.zhiyou100.model;

import java.util.Date;
/**
 * @author QiuShiju
 * @date 2018年11月20日
 * @desc 房屋信息
 */
public class House {
      private  int hid;
      private  String haddress;
      private  String hfloor;
      private  int hroomNum;
      private  String harea;
      private  String hdir;
      private  int hdeco;
      private  int hair;
      private  double hprice;
      private  int hrentStatus;
      private  String himage;
      private  Date haddTime;
      private  Date hupdateTime;
      public  int  getHid(){
      		return  this.hid;
      };
      public  void  setHid(int hid){
      	this.hid=hid;
      }  
     
      public  String  getHaddress(){
      		return  this.haddress;
      };
      public  void  setHaddress(String haddress){
      	this.haddress=haddress;
      }  
     
      public  String  getHfloor(){
      		return  this.hfloor;
      };
      public  void  setHfloor(String hfloor){
      	this.hfloor=hfloor;
      }  
     
      public  int  getHroomNum(){
      		return  this.hroomNum;
      };
      public  void  setHroomNum(int hroomNum){
      	this.hroomNum=hroomNum;
      }  
     
      public  String  getHarea(){
      		return  this.harea;
      };
      public  void  setHarea(String harea){
      	this.harea=harea;
      }  
     
      public  String  getHdir(){
      		return  this.hdir;
      };
      public  void  setHdir(String hdir){
      	this.hdir=hdir;
      }  
     
      public  int  getHdeco(){
      		return  this.hdeco;
      };
      public  void  setHdeco(int hdeco){
      	this.hdeco=hdeco;
      }  
     
      public  int  getHair(){
      		return  this.hair;
      };
      public  void  setHair(int hair){
      	this.hair=hair;
      }  
     
      public  double  getHprice(){
      		return  this.hprice;
      };
      public  void  setHprice(double hprice){
      	this.hprice=hprice;
      }  
     
      public  int  getHrentStatus(){
      		return  this.hrentStatus;
      };
      public  void  setHrentStatus(int hrentStatus){
      	this.hrentStatus=hrentStatus;
      }  
     
      public  String  getHimage(){
      		return  this.himage;
      };
      public  void  setHimage(String himage){
      	this.himage=himage;
      }  
     
      public  Date  getHaddTime(){
      		return  this.haddTime;
      };
      public  void  setHaddTime(Date haddTime){
      	this.haddTime=haddTime;
      }  
     
      public  Date  getHupdateTime(){
      		return  this.hupdateTime;
      };
      public  void  setHupdateTime(Date hupdateTime){
      	this.hupdateTime=hupdateTime;
      }
	@Override
	public String toString() {
		return "House [hid=" + hid + ", haddress=" + haddress + ", hfloor=" + hfloor + ", hroomNum=" + hroomNum
				+ ", harea=" + harea + ", hdir=" + hdir + ", hdeco=" + hdeco + ", hair=" + hair + ", hprice=" + hprice
				+ ", hrentStatus=" + hrentStatus + ", himage=" + himage + ", haddTime=" + haddTime + ", hupdateTime="
				+ hupdateTime + "]";
	}  
     
    
}