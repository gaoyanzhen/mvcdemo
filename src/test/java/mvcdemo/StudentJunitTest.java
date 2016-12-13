package mvcdemo;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.gyz.dao.IStudentDao;
import com.gyz.po.Student;

public class StudentJunitTest {
	
	private static IStudentDao studentDao;

	@SuppressWarnings("resource")
	@BeforeClass
	public static void init() {
		ApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("classpath:spring-mvc.xml"); 
		studentDao = (IStudentDao) context.getBean("studentDao");
	}
	
	
	public void testStudentBySno() {
		Student student = new Student("003","李四","男",24,"计算机科学与技术");
		Student student2 = null; 
		 try { 
			 studentDao.add(student);
			 student2 = studentDao.getStudentBySno("003");
			 System.out.println(student2.toString());
		 } catch (Exception ex) { 
			 ex.printStackTrace();
		 } finally { 
			 studentDao.delete(student2);
		 } 
	}
	@Test 
	public void batchInsert(){
		try{
			for(int i=1;i<=100000;i++){
				String sno = i+"";
				if(sno.length()<10){
					int num = 10-sno.length();
					String zeros = "";
					for(int j=0;j<num;j++){
						zeros+="0";
					}
					sno=zeros+i;
				}
				Student student = new Student(sno,"李四","男",24,"计算机科学与技术");
				studentDao.add(student);
			}
		} catch (Exception e){
			e.printStackTrace();
		}
		
	}
}
