package controller;

import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;

@Component
@Primary //Avoid ambiguity
public class Jio implements Sim{
	public void use() {
		System.out.println("jio inserted");
	}
}
