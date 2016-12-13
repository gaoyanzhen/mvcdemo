package mvcdemo;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gyz.dao.ICourseDao;
import com.gyz.po.Course;


public class CourseJunitTest {
	
	private static ICourseDao courseDao;
	
	@BeforeClass
	public static void init() {
		ApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("classpath:spring-mvc.xml"); 
		courseDao = (ICourseDao) context.getBean("courseDao");
	}
	
	@Test
	public void getCourseByCno(){
		Course c = new Course("002", "高等数学", 2, 2, 20);
		Course course = null;
		try {
			courseDao.add(c);
			course = courseDao.getCourseByCno("002");
			System.out.println(course.toString());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			courseDao.delete(course);
		}
	}
}
