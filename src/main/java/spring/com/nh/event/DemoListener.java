package spring.com.nh.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 事件监听
 * @author pact
 *
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent>{

	/**
	 * 对接收到的消息进行处理
	 */
	public void onApplicationEvent(DemoEvent event) {
		String msg = event.getMsg();
		System.out.println("我(bean-demoListener)接收到了bean-demoPublisher发布的消息:"+msg);
	}

}
