package spring.com.nh.springMVC;

import java.io.IOException;
import java.nio.charset.Charset;

import org.springframework.http.HttpInputMessage;
import org.springframework.http.HttpOutputMessage;
import org.springframework.http.MediaType;
import org.springframework.http.converter.AbstractHttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.converter.HttpMessageNotWritableException;
import org.springframework.util.StreamUtils;
/**
 * HttpMessageConverter用来处理request和response里的数据的
 * @author pact
 *
 */
public  class MyMessageConverter extends AbstractHttpMessageConverter<DemoObj> {

	public MyMessageConverter() {
		//新建了一个自定义的媒体类型application/x-wisely
		super(new MediaType("application",
				"x-wisely", Charset.forName("UTF-8")));
	}
	/**
	 * 处理请求数据
	 */
	@Override
	protected DemoObj readInternal(Class<? extends DemoObj> clazz, HttpInputMessage inputMessage)
			throws IOException, HttpMessageNotReadableException {
		String temp = StreamUtils.copyToString(inputMessage.getBody(),
				Charset.forName("UTF-8"));
		String[] tempArr = temp.split("-");
		return new DemoObj(new Long(tempArr[0]),tempArr[1]);
	}

	/**
	 * 表名笨HttpMessageConverter只处理DemoObj这个类
	 */
	@Override
	protected boolean supports(Class<?> clazz) {
		
		return DemoObj.class.isAssignableFrom(clazz);
	}

	/**
	 * 处理如何输出数据到response，在此我们在远洋输出前面加上"hello:"
	 */
	@Override
	protected void writeInternal(DemoObj obj, HttpOutputMessage outputMessage)
			throws IOException, HttpMessageNotWritableException {
		String out = "hello:"+obj.getId()+"-"
				+obj.getName();
		outputMessage.getBody().write(out.getBytes());
	}

}
