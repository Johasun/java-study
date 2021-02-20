package kr.or.bit;

import java.io.Serializable;

/*
객체 통신
객체(Car, Tv) 네트워크, 파일 간에(txt writ, read), 프로세스 간에 통신
직렬화 : 객체를 분해해서 줄을 세워 보내는 과정 ( 빨대의 크기가 작아서 byte로 쪼갠다 )
역직렬화 : 객체를 조립하는 과정

실습
대상 >> 파일 >> UserInfo 객체 wirte (직렬화)
대상 >> 파일 >> 직렬화된 UserInfo 객체를 read 조립 (역직렬화)

조립식 : 본드 붙여서
레고식 : 붙였다 띠었다
UserInfo implements Serializable (조립 분해)
클래스옆에 조립식인지 레고식인지 알려주는 과정 -> implements Serializable....

*/
public class UserInfo implements Serializable {
	private String name;
	private String pwd;
	private int age;
	
	public UserInfo() {
		
	}

	public UserInfo(String name, String pwd, int age) {
		this.name = name;
		this.pwd = pwd;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getPwd() {
		return pwd;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", pwd=" + pwd + ", age=" + age + "]";
	}
	
	
	
	
}




