package com.leo;

import com.leo.bean.Person;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class BootconfigApplicationTests {

	@Autowired
	ApplicationContext app;
	@Autowired
	Person person;
	@Test
	void contextLoads() {
		boolean a = app.containsBean("helloService02");
		System.out.println(a);
	}
	@Test
	void person(){
		System.out.println(person);
	}
}
