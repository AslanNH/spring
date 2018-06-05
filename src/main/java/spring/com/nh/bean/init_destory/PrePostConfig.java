package spring.com.nh.bean.init_destory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("spring.com.nh.bean.init_destory")
public class PrePostConfig {

	@Bean(initMethod="init",destroyMethod="destroy")
	BeanWayService beanWayService() {
		return new BeanWayService();
	}
	@Bean
	JSR250WayService jsr250WayService() {
		return new JSR250WayService();
	}
}
