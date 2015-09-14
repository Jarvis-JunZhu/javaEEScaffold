package javaEEScaffold;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vino.shirospring.entity.User;
import com.vino.shirospring.service.UserService;

public class UserTest {
	private UserService userService;
	private  ClassPathXmlApplicationContext ctx ;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("进行准备工作");
		 ctx =  new ClassPathXmlApplicationContext("applicationContext.xml"); 
		 userService=ctx.getBean("userService",UserService.class);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSave() {
		User user=new User("admin","1111","超管");
		//userService.save(user);
		userService.findByUsername("admin");
	}

}
