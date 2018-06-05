package spring.com.nh.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AopConfig.class);
		
		DemoMethodService demoMethodService = 
				context.getBean(DemoMethodService.class);
		demoMethodService.add();
		context.close();
	}
}
