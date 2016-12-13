package com.gyz.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.gyz.po.Student;

public class StudentDaoImpl implements IStudentDao {
	private NamedParameterJdbcTemplate jdbcTemplate;
	
	private String SQL_INSERT_STUDENT = "INSERT INTO Student(Sno,Sname,Ssex,Sage,Sdept) VALUES (:Sno,:Sname,:Ssex,:Sage,:Sdept)";
	private String SQL_SELECT_STUDENT_BY_SNO = "SELECT Sno,Sname,Ssex,Sage,Sdept FROM Student WHERE Sno=:Sno";
	private String SQL_DELETE_STUDENT_BY_SNO = "DELETE FROM Student WHERE Sno=:Sno";
	
	public void setJdbcTemplate(NamedParameterJdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void add(Student student) {
		Map<String,Object> paramMap = new HashMap<String,Object>();
		paramMap.put("Sno", student.getSno());
		paramMap.put("Sname", student.getSname());
		paramMap.put("Ssex", student.getSsex());
		paramMap.put("Sage", student.getSage());
		paramMap.put("Sdept", student.getSdept());
		jdbcTemplate.update(SQL_INSERT_STUDENT, paramMap);
	}

	public Student getStudentBySno(String sno) {
		Map<String,Object> paramMap = new HashMap<String,Object>();
		paramMap.put("Sno", sno);
		Student s = jdbcTemplate.queryForObject(SQL_SELECT_STUDENT_BY_SNO, paramMap,new RowMapper<Student>() {

			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student student = new Student(); 
				student.setSno(rs.getString("Sno"));
				student.setSname(rs.getString("Sname"));
				student.setSsex(rs.getString("Ssex"));
				student.setSage(rs.getInt("Sage"));
				student.setSdept(rs.getString("Sdept"));
				return student;
			}
			
		});
		return s;
	}

	public void delete(Student student) {
		Map<String,Object> paramMap = new HashMap<String,Object>();
		paramMap.put("Sno", student.getSno());
		jdbcTemplate.update(SQL_DELETE_STUDENT_BY_SNO, paramMap);
	}

}
