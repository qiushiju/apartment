package com.zhiyou100.model;

import java.util.Date;
/**
 * @author QiuShiju
 * @date 2018年11月20日
 * @desc 租金
 */
public class Rent {
      private  int rid;
      private  int rhid;
      private  int rlid;
      private  double rprice;
      private  Date rpayTime;
      public  int  getRid(){
      		return  this.rid;
      };
      public  void  setRid(int rid){
      	this.rid=rid;
      }  
     
      public  int  getRhid(){
      		return  this.rhid;
      };
      public  void  setRhid(int rhid){
      	this.rhid=rhid;
      }  
     
      public  int  getRlid(){
      		return  this.rlid;
      };
      public  void  setRlid(int rlid){
      	this.rlid=rlid;
      }  
     
      public  double  getRprice(){
      		return  this.rprice;
      };
      public  void  setRprice(double rprice){
      	this.rprice=rprice;
      }  
     
      public  Date  getRpayTime(){
      		return  this.rpayTime;
      };
      public  void  setRpayTime(Date rpayTime){
      	this.rpayTime=rpayTime;
      }
	@Override
	public String toString() {
		return "Rent [rid=" + rid + ", rhid=" + rhid + ", rlid=" + rlid + ", rprice=" + rprice + ", rpayTime="
				+ rpayTime + "]";
	}  
     
    
}