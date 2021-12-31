import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: Ranlay.su
 * @date: 2021-12-21 10:33
 * @description: 源码阅读参考笔记:
 * https://juejin.cn/user/3157453124146007/posts
 * @version: 1.0.0
 */
public class Main {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:beans.xml");
		User user = ctx.getBean(User.class);
		System.out.println("user = " + user);
	}
}
