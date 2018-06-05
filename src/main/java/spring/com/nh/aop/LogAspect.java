package spring.com.nh.aop;

import java.lang.reflect.Method;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * 切面
 * @author pact
 *
 */
//声明一个切面
@Aspect
//让此切面成为spring容器管理的bean
@Component
public class LogAspect {

	@Pointcut("execution(* spring.com.nh.aop.DemoMethodService.*(..))")
	public void annotationPointCut() {};
	
	@Before("annotationPointCut()")
	public void before(JoinPoint joinPoint) {
		MethodSignature signature = (MethodSignature)joinPoint.getSignature();
		Method method = signature.getMethod();
		System.out.println("方法规则事拦截,"+method.getName());
	}
}
