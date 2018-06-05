package spring.com.nh.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("spring.com.nh.taskscheduler")
@EnableScheduling
public class TaskSchedulerConfig {

}
