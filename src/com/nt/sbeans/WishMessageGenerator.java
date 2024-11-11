package com.nt.sbeans;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	@Autowired //field Injection
	private  LocalDateTime dateTime;
	@Autowired
	private   Date     date;
	
	/*//param constructor for constructor Injection
	@Autowired
	public WishMessageGenerator(LocalDateTime dateTime, Date date) {
		System.out.println("WishMessageGenerator:: 2-arg  constructor");
		this.dateTime = dateTime;
		this.date = date;
	}
	
	//param constructor for constructor Injection
	@Autowired
	public WishMessageGenerator(LocalDateTime dateTime) {
		System.out.println("WishMessageGenerator:: 1-arg  constructor");
		this.dateTime = dateTime;
	
	}


	
	
	//setter method for setter Injection (alt+shift+s, r)
	@Autowired
	public void setDateTime(LocalDateTime dateTime) {
		System.out.println("WishMessageGenerator.setDateTime()");
		this.dateTime = dateTime;
	}
	@Autowired
	public void setDate(Date date) {
		System.out.println("WishMessageGenerator.setDate()");
		this.date = date;
	}
	*/
	
	@Autowired
	public  void   putData1(LocalDateTime dateTime) {
		System.out.println("WishMessageGenerator.putData1()");
		this.dateTime=dateTime;
		
	}
	
	@Autowired
	public void   assignData2(Date  date) {
		System.out.println("WishMessageGenerator.assignData2()");
		this.date=date;
	}
	
		public WishMessageGenerator() {
		System.out.println("WishMessageGenerator::0-param constructor");
	}
	
	
	

	



	//b,method
	 public  String  showWishMessage(String user) {
		 System.out.println("WishMessageGenerator.showWishMessage() dateTime::"+dateTime+"......"+" date::"+date);
		 //get current hour of the day
		 int hour=dateTime.getHour();
		 //generate wish MEssage
		 if(hour<12)
			   return "GM:"+user;
		 else if(hour>=12 && hour<16)
			   return "GA:"+user;
		 else if(hour>=16 && hour<20)
			    return "GE:"+user;
		 else 
			    return "GN:"+user;
	 }
 
}
