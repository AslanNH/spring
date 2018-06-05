package spring.com.nh.bean.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(ScopeConfig.class);
		DemoSingletonService s1 = context.getBean(DemoSingletonService.class);
		DemoSingletonService s2 = context.getBean(DemoSingletonService.class);
		
		DemoPrototypeServicce p1  = context.getBean(DemoPrototypeServicce.class);
		DemoPrototypeServicce p2 = context.getBean(DemoPrototypeServicce.class);
		
		System.out.println("s1与s2是否相等:"+s1.equals(s2));
		System.out.println("p1与p2是否相等:"+p1.equals(p2));
		
		context.close();
	}
}
