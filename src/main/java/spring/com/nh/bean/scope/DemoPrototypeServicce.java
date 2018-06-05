package spring.com.nh.bean.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
//每次创建一个bean
@Scope("prototype")
public class DemoPrototypeServicce {

}
