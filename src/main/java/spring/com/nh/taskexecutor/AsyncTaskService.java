package spring.com.nh.taskexecutor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncTaskService {
	public void executeAsyncTask1(Integer i) {
		System.out.println("执行异步任务1:  "+i );
	}
	public void executeAsyncTask2(Integer i) {
		System.out.println("执行异步任务2:  "+i );
	}
	@Async
	public void executeAsyncTask(Integer i) {
		System.out.println("执行异步任务:  "+i );
	}
	@Async
	public void executeAsyncTaskPlus(Integer i) {
		System.out.println("习性异步任务+1:  "+(i+1));
	}
}
