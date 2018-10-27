package cn.com.sm.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.sm.mapper.EntityContainListMapper;
import cn.com.sm.po.TestBook;
import cn.com.sm.po.TestUser;

public class EntityContainListMapperTest {
	private ApplicationContext applicationContext;
	@Before
	public void setup() {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
	}
	
	@Test
	public void testEntityContainListMapper() {
		EntityContainListMapper entityContainListMapper = (EntityContainListMapper)applicationContext.getBean("entityContainListMapper");
		List<TestUser> list = entityContainListMapper.getList();
		for (TestUser testUser : list) {
			System.out.println("username:"+testUser.getUsername());
			List<TestBook> bookList = testUser.getBookList();
			for (TestBook book : bookList) {
				System.out.println("bookname:"+book.getBookname());
			}
			System.out.println("+++++++++++++++++");
		}
		
	}
}
