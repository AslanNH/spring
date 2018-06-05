package spring.com.nh.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("spring.com.nh.aop")
//开启spring对apsectj的支持
@EnableAspectJAutoProxy
public class AopConfig {

}
