package top.haw358.utils.reflect;

import org.springframework.util.ReflectionUtils;
import top.haw358.utils.Bean;
import top.haw358.utils.spring.SpringContextHolder;

import java.lang.reflect.Method;

/**
 * @author <a href="mailto:haw358linux@163.com">黄爱伟</a>
 * <p>我是代理商，我有资源，我提供运行环境，当然你也可以直接去找项目领导谈，但他要使用你的资源</p>
 *
 */
public class PushArbCaseManagerCaller extends Thread {
	

	private String methodName;
	private Long param;
	

	public void offer(String methodName, Long param) {
		this.methodName = methodName;
		this.param = param;
		this.start();
	}
	
	public void reInvoke1() {
		Method method = ReflectionUtils.findMethod(Bean.class, this.methodName, Long.class);
		ReflectionUtils.invokeMethod(method, SpringContextHolder.getBean(Bean.class), this.param);
	}

	@Override
	public void run() {
		try {
			reInvoke1();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
}
