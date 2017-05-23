package com.rajeev.domain;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.RollingFileAppender;
import org.springframework.batch.item.ItemProcessor;

import com.rajeev.model.Patient;

public class PatientProcessor implements ItemProcessor<Patient, Patient> {

	
	
	Logger log =Logger.getLogger(Patient.class);
	public Patient process(Patient result) throws Exception {
		
		try{
	
		Logger rootLogger = Logger.getRootLogger();
		rootLogger.setLevel(Level.INFO);
		 System.out.println(log.getClass());
		PatternLayout layout = new PatternLayout("%d{ISO8601} [%t] %-5p %c %x - %m%n");
			 
			
			
			RollingFileAppender fileAppender = new RollingFileAppender(layout, "demoApplication.log");
			rootLogger.addAppender(fileAppender);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return result;
	}
}
