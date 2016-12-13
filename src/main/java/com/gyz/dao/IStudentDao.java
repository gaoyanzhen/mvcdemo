package com.gyz.dao;

import com.gyz.po.Student;

public interface IStudentDao {
	/**
	 * 新增对象
	 * @param student
	 */
	public void add(Student student);
	
	/**
	 * 根据学号获取对象
	 * @param sno 学号
	 * @return
	 */
	public Student getStudentBySno(String sno);
	
	/**
	 * 删除对象
	 * @param student
	 */
	public void delete(Student student);
}
