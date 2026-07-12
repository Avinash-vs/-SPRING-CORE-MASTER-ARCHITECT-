package sping_abc;

import org.springframework.stereotype.Component;

@Component
public class Venilla implements Icecream{
	public void eat() {
		System.out.println("baby vennila icecream eated");
	}
}
