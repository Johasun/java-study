package kr.or.bit;

import java.io.Serializable;

/*
��ü ���
��ü(Car, Tv) ��Ʈ��ũ, ���� ����(txt writ, read), ���μ��� ���� ���
����ȭ : ��ü�� �����ؼ� ���� ���� ������ ���� ( ������ ũ�Ⱑ �۾Ƽ� byte�� �ɰ��� )
������ȭ : ��ü�� �����ϴ� ����

�ǽ�
��� >> ���� >> UserInfo ��ü wirte (����ȭ)
��� >> ���� >> ����ȭ�� UserInfo ��ü�� read ���� (������ȭ)

������ : ���� �ٿ���
����� : �ٿ��� �����
UserInfo implements Serializable (���� ����)
Ŭ�������� ���������� ��������� �˷��ִ� ���� -> implements Serializable....

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




