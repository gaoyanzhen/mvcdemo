package mvcdemo;

import java.util.HashMap;
import java.util.Map;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.gyz.controller.LoginController;
import com.gyz.dao.IStudentDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mvc.xml") 
@Transactional
public class LoginControllerTest {
	private static LoginController controller;
	
	@BeforeClass
	public static void before(){
		ApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("classpath:spring-mvc.xml"); 
		controller = (LoginController)context.getBean("loginController");
	}
	
	@Test
	public void testLogin(){
		//IUserService userService = new UserServiceImpl();
		//LoginController controller =  new LoginController();
		//studentDao = (IStudentDao) context.getBean("studentDao");
		Map<String,Object> model = new HashMap<String,Object>();
		String view = controller.login("gyz","123",model);
		System.out.println("∑µªÿ ”Õº£∫"+view);
	}
}
