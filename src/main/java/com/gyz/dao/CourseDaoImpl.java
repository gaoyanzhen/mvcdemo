package com.gyz.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;

import com.gyz.po.Course;

public class CourseDaoImpl extends NamedParameterJdbcDaoSupport implements ICourseDao {

	private final String SQL_INSERT_COURSE = "INSERT INTO Course (Cno, Cname, Ccredit, Semester, Period) VALUES (:cno, :cname, :ccredit, :semester, :period)";
	private String SQL_SELECT_COURSE_BY_CNO = "SELECT Cno, Cname, Ccredit, Semester, Period FROM Course WHERE Cno=:cno";
	private String SQL_DELETE_COURSE_BY_CNO = "DELETE FROM Course WHERE Cno=:cno";
	
	public void add(Course course) {
		Map<String,Object> paramMap = new HashMap<String,Object>();
		paramMap.put("cno", course.getCno());
		paramMap.put("cname", course.getCname());
		paramMap.put("ccredit", course.getCcredit());
		paramMap.put("semester", course.getSemester());
		paramMap.put("period", course.getPeriod());
		this.getNamedParameterJdbcTemplate().update(SQL_INSERT_COURSE, paramMap);
	}

	public Course getCourseByCno(String cno) {
		Map<String,Object> paramMap = new HashMap<String,Object>();
		paramMap.put("cno", cno);
		Course c = this.getNamedParameterJdbcTemplate().queryForObject(SQL_SELECT_COURSE_BY_CNO, paramMap,new RowMapper<Course>() {

			public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
				Course course = new Course(); 
				course.setCno(rs.getString("Cno"));
				course.setCname(rs.getString("Cname"));
				course.setCcredit(rs.getInt("Ccredit"));
				course.setSemester(rs.getInt("Semester"));
				course.setPeriod(rs.getInt("Period"));
				return course;
			}
		});
		return c;
	}

	public void delete(Course course) {
		Map<String,Object> paramMap = new HashMap<String,Object>();
		paramMap.put("cno", course.getCno());
		this.getNamedParameterJdbcTemplate().update(SQL_DELETE_COURSE_BY_CNO, paramMap);
	}

}
