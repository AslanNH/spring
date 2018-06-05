package spring.com.nh.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * 事件发布类
 * @author pact
 *
 */
@Component
public class DemoPublisher {

	/**
	 * 注入ApplicationContext用来发布事件
	 */
	@Autowired
	ApplicationContext applicationContext;
	/**
	 * 使用ApplicationContext的publishEvent方法来发布
	 * @param msg
	 */
	public void publish(String msg) {
		applicationContext.publishEvent(new DemoEvent(this,msg));
	}
}
