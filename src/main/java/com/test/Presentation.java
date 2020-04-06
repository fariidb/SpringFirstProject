package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Presentation {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context=
				new ClassPathXmlApplicationContext(new String[] {"spring-ioc.xml"});
		IMetier metier =(IMetier) context.getBean("metier");
		System.out.println(metier.calcul());

	}

}
