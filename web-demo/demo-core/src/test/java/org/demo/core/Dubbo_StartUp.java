package org.demo.core;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Dubbo_StartUp {
	public static void main(String[] args) throws Exception {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "classpath:conf/spring.xml",
						"classpath:conf/spring-mybaties.xml",
						"classpath:conf/dubbo-provider.xml" });
		context.start();
		System.out.println("已经开启DUBBO.");

		System.in.read(); // ��������˳�

	}
}
