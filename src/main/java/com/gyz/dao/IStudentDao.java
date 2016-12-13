package com.gyz.dao;

import com.gyz.po.Student;

public interface IStudentDao {
	/**
	 * ��������
	 * @param student
	 */
	public void add(Student student);
	
	/**
	 * ����ѧ�Ż�ȡ����
	 * @param sno ѧ��
	 * @return
	 */
	public Student getStudentBySno(String sno);
	
	/**
	 * ɾ������
	 * @param student
	 */
	public void delete(Student student);
}
