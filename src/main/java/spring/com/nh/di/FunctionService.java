package spring.com.nh.di;

import org.springframework.stereotype.Service;

@Service
//@Component
//@Repository
//@Controller
public class FunctionService {

	public String sayHello(String word) {
		return "Hello " + word +" !";
	}
}
