package com.Akalcedon;

import java.util.Date;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.Akalcedon.dao.Calendar;
import com.Akalcedon.dao.CalendarRepository;


@SpringBootApplication
public class AkalcedonApplication {

	public static void main(String[] args) {
		
		ApplicationContext ctx = SpringApplication.run(AkalcedonApplication.class, args);
		
	  //  CalendarRepository calendarRepository = ctx.getBean(CalendarRepository.class);
		
		
		
	//    Calendar calendar = new Calendar(new Date(), new Date()," description"," colorf"," colorb");
		
	//	calendarRepository.save(calendar);
	//	calendarRepository.save(calendar);
	//	calendarRepository.save(calendar);calendarRepository.save(calendar);calendarRepository.save(calendar);
		
		
		
		
	}

}
