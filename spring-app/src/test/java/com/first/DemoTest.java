package com.first;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(DemoConfig.class);
		DemoBean bean = ac.getBean(DemoBean.class);
		bean.hello();
	}
}
