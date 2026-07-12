package sping_abc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_def.Myconfig;

public class TestBaby {

	public static void main(String[] args) {
		ApplicationContext ac=new AnnotationConfigApplicationContext(Myconfig.class);
		Baby b1=ac.getBean(Baby.class);
		b1.open();

	}

}
