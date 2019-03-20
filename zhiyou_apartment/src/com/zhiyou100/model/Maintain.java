package com.zhiyou100.model;

import java.util.Date;
/**
 * @author QiuShiju
 * @date 2018年11月20日
 * @desc 维修
 */
public class Maintain {
      private  int mid;
      private  int mhid;
      private  int mloid;
      private  Date mtime;
      private  String mresult;
      public  int  getMid(){
      		return  this.mid;
      };
      public  void  setMid(int mid){
      	this.mid=mid;
      }  
     
      public  int  getMhid(){
      		return  this.mhid;
      };
      public  void  setMhid(int mhid){
      	this.mhid=mhid;
      }  
     
      public  int  getMloid(){
      		return  this.mloid;
      };
      public  void  setMloid(int mloid){
      	this.mloid=mloid;
      }  
     
      public  Date  getMtime(){
      		return  this.mtime;
      };
      public  void  setMtime(Date mtime){
      	this.mtime=mtime;
      }  
     
      public  String  getMresult(){
      		return  this.mresult;
      };
      public  void  setMresult(String mresult){
      	this.mresult=mresult;
      }
	@Override
	public String toString() {
		return "Maintain [mid=" + mid + ", mhid=" + mhid + ", mloid=" + mloid + ", mtime=" + mtime + ", mresult="
				+ mresult + "]";
	}  
     
    
}