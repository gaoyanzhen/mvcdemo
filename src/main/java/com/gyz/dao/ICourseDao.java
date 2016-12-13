package com.gyz.dao;

import com.gyz.po.Course;

public interface ICourseDao {
	/**
	 * ��������
	 * @param course
	 */
	public void add(Course course);
	
	/**
	 * ����������ȡ����
	 * @param sno ѧ��
	 * @return
	 */
	public Course getCourseByCno(String cno);
	
	/**
	 * ɾ������
	 * @param course
	 */
	public void delete(Course course);
}
