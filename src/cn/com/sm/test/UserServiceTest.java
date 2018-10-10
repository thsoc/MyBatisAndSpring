package cn.com.sm.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.sm.dao.UserDao;
import cn.com.sm.po.User;

public class UserServiceTest {
	private ApplicationContext applicationContext;
	@Before
	public void setup(){
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
	}
	@Test
	public void testFindUserById(){
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		User user = userDao.findUserById(1);
		System.out.println(user.getId()+":"+user.getUsername()+"++++++++++++");
	}
}
