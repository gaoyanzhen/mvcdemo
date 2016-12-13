package mvcdemo;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.gyz.dao.BaseDao;
import com.gyz.po.Employee;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mvc.xml") 
@Transactional
public class EmployeeJunitTest {
	@Autowired
	private BaseDao baseDao;
	
	@Test
	public void addEmployee(){
		try{
			Employee employee = new Employee("丁浩","M","软件开发工程师",new Date(),1);
			baseDao.save(employee);
		}catch (Exception e){
			e.printStackTrace();
		}
		
	}
}
