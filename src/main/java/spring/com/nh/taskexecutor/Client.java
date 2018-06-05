package spring.com.nh.taskexecutor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {

	public static void main(String[]args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
		AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);
		for (int i=0;i<10;i++) {
		/*	asyncTaskService.executeAsyncTask(i);
			asyncTaskService.executeAsyncTaskPlus(i);*/
			asyncTaskService.executeAsyncTask1(i);
			asyncTaskService.executeAsyncTask2(i);
		}
		context.close();
	}
}
