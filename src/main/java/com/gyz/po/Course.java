package com.gyz.po;

public class Course {
	/**
	 * 课程号
	 */
	private String Cno;
	/**
	 * 课程名
	 */
	private String Cname;
	/**
	 * 学分
	 */
	private int Ccredit;
	/**
	 * 学期
	 */
	private int semester;
	/**
	 * 学时
	 */
	private int period;
	
	public Course() {
		super();
	}
	public Course(String cno, String cname, int ccredit, int semester,
			int period) {
		super();
		Cno = cno;
		Cname = cname;
		Ccredit = ccredit;
		this.semester = semester;
		this.period = period;
	}
	public String getCno() {
		return Cno;
	}
	public void setCno(String cno) {
		Cno = cno;
	}
	public String getCname() {
		return Cname;
	}
	public void setCname(String cname) {
		Cname = cname;
	}
	public int getCcredit() {
		return Ccredit;
	}
	public void setCcredit(int ccredit) {
		Ccredit = ccredit;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	@Override
	public String toString() {
		return "Course [Cno=" + Cno + ", Cname=" + Cname + ", Ccredit="
				+ Ccredit + ", semester=" + semester + ", period=" + period
				+ "]";
	}
	
}
