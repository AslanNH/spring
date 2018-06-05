package spring.com.nh.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		//使用AnnotationConfigApplicationContext作为Spring容器，接受输入一个配置类作为参数
		AnnotationConfigApplicationContext context=
					new AnnotationConfigApplicationContext(DiConfig.class);
		//获取声明配置的UsrFunctionService的Bean
		UsrFunctionService usrFunctionService = context.getBean(UsrFunctionService.class);
		System.out.println(usrFunctionService.SayHello("di"));
		context.close();
	}
}
