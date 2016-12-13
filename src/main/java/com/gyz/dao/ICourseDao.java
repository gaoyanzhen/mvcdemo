package com.gyz.dao;

import com.gyz.po.Course;

public interface ICourseDao {
	/**
	 * 新增对象
	 * @param course
	 */
	public void add(Course course);
	
	/**
	 * 根据主键获取对象
	 * @param sno 学号
	 * @return
	 */
	public Course getCourseByCno(String cno);
	
	/**
	 * 删除对象
	 * @param course
	 */
	public void delete(Course course);
}
