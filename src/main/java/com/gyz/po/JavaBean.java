package com.gyz.po;

public class JavaBean {
	private String userName;  
    private String passWord;
    
	public String getUserName() {
		System.out.println("get sucess!");
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName +"end";
		System.out.println("set sucess!");
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
}
