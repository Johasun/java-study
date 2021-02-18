package kr.or.bit.utils;

import java.util.Calendar;

// ��¥�� ������ �����ϴ� ���赵
// ���� ��� >> ���ϰ� >> ����� >> new (X) >> static �Լ� >> �ϳ��� �̸����� (�����ε�)


public class Edu_Date {

	public static String DateString(Calendar date) {
		return date.get(Calendar.YEAR) + "��" +
		(date.get(Calendar.MONTH)+1) +"��"+
		date.get(Calendar.DATE)+"��";
	}
	
	public static String DateString(Calendar date, String opr) {
			return date.get(Calendar.YEAR) + opr +
			(date.get(Calendar.MONTH)+1) +opr+
			date.get(Calendar.DATE);
		}
	//�䱸����
	//2021��2��17��
	//1~9�� >> 01, 02...
	//10  11  12 >> �״��
	
	public static String monthFormat_DateString(Calendar date) {
		String month="";
		if((date.get(Calendar.MONTH)+1)<10) {
			month = "0"+(date.get(Calendar.MONTH)+1);
		}else {
			month = String.valueOf((date.get(Calendar.MONTH)+1));
		}
		return date.get(Calendar.YEAR) + "��" +
		month +"��"+
		date.get(Calendar.DATE)+"��";
		

		
	}
}