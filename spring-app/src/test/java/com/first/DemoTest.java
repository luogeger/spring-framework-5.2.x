package com.first;

import com.first.demo.DemoBean;
import com.first.demo.DemoConfig;
import com.first.tag.Apple;
import com.first.xml.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@DisplayName("测试")
public class DemoTest {

	@Test
	@DisplayName("自定义标签")
	void main2 () {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-tag.xml");
		Apple apple = ac.getBean(Apple.class);
		System.out.println(apple);
	}

	@Test
	@DisplayName("bean标签")
	void main1 () {
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Person person = ac.getBean(Person.class);
		System.out.println(person);
		person.hello();
	}


	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(DemoConfig.class);
		DemoBean bean = ac.getBean(DemoBean.class);
		bean.hello();
	}
}
