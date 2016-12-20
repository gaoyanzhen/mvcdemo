package mvcdemo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.gyz.dao.IUserDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:classpath:spring-mvc.xml", "classpath*:applicationContext.xml" }) 
@Transactional
public class UserTest {
	@Autowired
	private IUserDao userDao;
	
	@Test 
	 public void testStudentByCno() {
		List list = userDao.getUserByPage(3, 8);
		System.out.println(list.size());
	}
	
	
}
