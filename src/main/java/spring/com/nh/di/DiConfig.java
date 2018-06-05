package spring.com.nh.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
//声明当前类是个配置类，相当于spring的xml文件
@Configuration
//扫描包下的所有注解
@ComponentScan("spring.com.nh.di")
public class DiConfig {

}
