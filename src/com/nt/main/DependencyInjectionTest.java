package com.nt.main;

import java.sql.Date;
import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.config.AppConfig;
import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		System.out.println("DependencyInjectionTest.main()==>Start");
		//create  IOC container
		  Class<AppConfig>  c11=AppConfig.class;
		  AnnotationConfigApplicationContext ctx=
				   new AnnotationConfigApplicationContext(c11);
		  //get target spring bean class  object ref\
		    Class<WishMessageGenerator>  c1=WishMessageGenerator.class;
		 WishMessageGenerator generator=ctx.getBean("wmg",c1);
		
		 
		 //invoke the b.method
		  String resultMsg=generator.showWishMessage("raja");
		  System.out.println(resultMsg);
		  
		  //close the container
		    ctx.close();
       System.out.println("DependencyInjectionTest.main()===>end");
       
       System.out.println("-------------------------------");
         Class  c3=Date.class;
         System.out.println("c3 obj data ::"+c3);
         System.out.println("c3 object  data  classname::"+c3.getName());
         System.out.println("c3 object data super calss"+c3.getSuperclass());
         System.out.println("c3 object data impleneted interfaces::"+Arrays.toString(c3.getInterfaces()));
         
	}

}
