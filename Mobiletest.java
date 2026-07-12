package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mobiletest {

	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(Myconfig.class);
		Mobile m1=ac.getBean(Mobile.class);
		m1.insert();

	}

}
