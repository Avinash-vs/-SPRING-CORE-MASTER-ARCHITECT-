package controller;
import org.springframework.stereotype.Component;

@Component
public class Airtel implements Sim {
	public void use() {
		System.out.println("Airtel inserted");
	}
}
