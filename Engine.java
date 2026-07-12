package controller;
import org.springframework.stereotype.Component;


//if here more class have component then we have to use @primary with @component
@Component
public class Engine {
	void insert() {
		System.out.println("Engine added");
	}

}
