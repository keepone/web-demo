package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.api.UserApi;
import com.demo.model.User;

public class StartUp {
	 public static void main(String[] args) {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
					new String[] {"classpath:conf/dubbo-consumer.xml" });
	        context.start();
	        UserApi userApi = (UserApi) context.getBean("UserApi"); // ��ȡԶ�̷������
	        int state = 3;
			String nickname = "mydd";
			User user = new User();
			user.setState(state);
			user.setNickname(nickname);
			System.out.println(userApi.insertUser(user));
	    }
}
