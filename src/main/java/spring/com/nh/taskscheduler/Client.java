package spring.com.nh.taskscheduler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Client {

	public static void main(String[]args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(TaskSchedulerConfig.class);
	}
}
