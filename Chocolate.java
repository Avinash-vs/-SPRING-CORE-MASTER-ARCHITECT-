package sping_abc;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Chocolate implements Icecream{
	public void eat() {
		System.out.println("baby chocolate icecream eated");
	}

}
