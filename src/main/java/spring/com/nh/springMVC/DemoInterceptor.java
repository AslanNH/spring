package spring.com.nh.springMVC;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
/**
 * 自定义实现拦截器
 * @author pact
 *
 */
public class DemoInterceptor extends HandlerInterceptorAdapter{

	/**
	 * 请求发生前操作
	 * @param request
	 * @param response
	 * @param handler
	 * @return
	 * @throws Exception
	 */
	public boolean preHandler(HttpServletRequest request,
			HttpServletResponse response, Object handler)throws Exception {
		long startTime = System.currentTimeMillis();
		request.setAttribute("startTime", startTime);
		return true;
	}
	/**
	 * 请求完成后操作
	 * @param request
	 * @param response
	 * @param handler
	 * @param modelAndView
	 * @throws Exception
	 */
	public void postHandler(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView)throws Exception {
		long startTime = (Long) request.getAttribute("startTime");
		request.removeAttribute("startTime");
		long endTime = System.currentTimeMillis();
		System.out.println("本次请求处理时间为: "+ new Long(endTime- startTime)+"ms");
		request.setAttribute("handlingTime", endTime-startTime);
	}
}
