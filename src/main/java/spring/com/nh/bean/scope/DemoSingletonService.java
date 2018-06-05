package spring.com.nh.bean.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
//单例bean
@Scope("singleton")
public class DemoSingletonService {

}
