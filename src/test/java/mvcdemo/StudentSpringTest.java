package mvcdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.gyz.dao.IStudentDao;
import com.gyz.po.Student;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mvc.xml") 
@Transactional
public class StudentSpringTest {
	@Autowired
	private IStudentDao studentDao;
	
	@Test 
	 public void testStudentByCno() {
		Student student = new Student("003","李四","男",24,"计算机科学与技术");
		Student student2 = null; 
		studentDao.add(student);
		student2 = studentDao.getStudentBySno("003");
		System.out.println(student2.toString());
	}
	
	
}
