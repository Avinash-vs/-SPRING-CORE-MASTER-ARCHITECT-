package sping_abc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Baby {
	
//	-------variable or field injection
	
//	@Autowired 
	Icecream I1;
	
//	--------------setter injection by double click on scrren and generate then clcik on setter
	
	@Qualifier("chocolate")     
	@Autowired
	public void setI1(Icecream I1) {
		I1 = I1;
	}
	
	
//	---------constructor injection
	
	public Baby(@Qualifier("venilla") Icecream I1){        
		this.I1=I1;
	}
	
	void open() {
		I1.eat();
	}
}
