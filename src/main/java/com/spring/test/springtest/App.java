package com.spring.test.springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App // com.spring.test.springtest.Patient
{
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/test/springtest/beans/beans.xml");
		Patient patient1 = (Patient) context.getBean("hospital");
     	//	patient.speak();
      //  Adress adress = (Adress) context.getBean("adress");
		
		Patient patient2 = (Patient) context.getBean("hospital");
		patient1.setPatient_name("jimu");
		System.out.println(patient1);
		((ClassPathXmlApplicationContext) context).close();

	}
}
