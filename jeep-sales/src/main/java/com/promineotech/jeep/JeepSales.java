package com.promineotech.jeep;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackageClasses = { ComponentScanMarker.class })
public class JeepSales {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(JeepSales.class,args);
		
	}

}
