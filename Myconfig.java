package spring_def;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import sping_abc.Baby;

@Configuration
@ComponentScan(basePackages={"sping_abc", "spring_def"})
public class Myconfig {

	
}
