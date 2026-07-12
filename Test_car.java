package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test_car {
	public static void main(String[] agrs) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(Myconfig.class);
		Car c1=ac.getBean(Car.class);
		c1.add();
	}

}
