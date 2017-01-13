package top.haw358.utils.reflect;

/**
 * @author <a href="mailto:haw358linux@163.com">黄爱伟</a>
 * <p>我是方法工厂类，负责实例化对象</p>
 *
 */
public class PushArbCaseManagerCallerFactory {

	public static void offer(String methodName, Long param) {
		new PushArbCaseManagerCaller().offer(methodName, param);
	}
}
