package com.first;

import com.first.xml.Person;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class AppMain {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring-${username}.xml");
		Person bean = ac.getBean(Person.class);
		bean.hello();
	}
}
