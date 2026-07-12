package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	@Autowired
		Sim s1;
		void insert() {
			s1.use();
		}

	}

