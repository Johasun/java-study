import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import kr.or.bit.utils.Edu_Date;


/*
* Calendar �� ��ӹ޾� ������ ������ Ŭ������ 
 * GregorianCalendar
   buddhisCalendar �ִµ� getInstance()�� [�ý����� ������ ��������]�� [Ȯ��]�ؼ�
      �±��� ��� buddhisCalendar �� �ν��Ͻ��� ��ȯ�ϰ� �� �ܿ��� GregorianCalendar
     �� �ν��Ͻ��� ��ȯ�Ѵ�
   GregorianCalendar �� Calendar�� ��ӹ޾� ���ó� ������ �������� ����ϰ� �ִ� 
   �׷����¿� �°� ������ ������ �±��� ������ ������ ���������� GregorianCalendar ���
   �׷��� �ν��Ͻ��� ���� �����ؼ� ������� �ʰ� �޼��带 ���ؼ� �ν��Ͻ��� ��ȯ�ް��ϴ�
   ������ �ּ��� �������� ���α׷� ������ �ϵ��� �ϱ� ����
   class MyApp{
     static void main(){
      Calendar cal = new GregorianCalendar();
      �ٸ� ������ ������ ����ϴ� �������� �����ϸ� ����......    }  }
   class MyApp{
     static void main(){
      Calendar cal = new getInstance();
        �ٸ� ������ ������ ����ϴ� �������� �����ϸ� ����......   }  }
  API : ������ Protected Calendar() 
 */
//Java API
//��¥ : Date (��) -> Calendar(��)
public class Ex09_Calendar {
	public static void main(String[] args) {
		Date dt = new Date();
		System.out.println(dt.toString()); //Wed Feb 17 10:05:52 KST 2021 //������
		
		//�Ź���
		//Calendar cal = new Calendar(); // �߻��ڿ� new �� �� ���� ��ü�� �ּҸ� ���� �� �ִ�
		Calendar cal = Calendar.getInstance(); // ���������� new ��¥ ��ü ���� �ּ� ����
		System.out.println(cal.toString()); //������ (��¥ ���� �� ���)
		
		
		// ����� �ʿ��� ������ �����ؼ� ���� ����ض�
		System.out.println("�⵵ : "+ cal.get(Calendar.YEAR));
		System.out.println("��(0~11) : "+ (cal.get(Calendar.MONTH)+1));
		System.out.println("�� : "+cal.get(Calendar.DATE));
		
		//cal.get() ���� Ÿ�� >> ���� >> ��� >> ����
		
		System.out.println("�� ���� ��°�� : "+cal.get(Calendar.WEEK_OF_MONTH));
		System.out.println(" : "+cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(" : "+cal.get(Calendar.DAY_OF_WEEK));
		
		//�� �� ��
		System.out.println(cal.get(Calendar.HOUR)+"��");
		System.out.println(cal.get(Calendar.MINUTE)+"��");
		System.err.println(cal.get(Calendar.SECOND)+"��");
		
		System.out.println("���� ����: "+cal.get(Calendar.AM_PM)); // ���� 0 ���� 1
		
		//�л���� �ý���
		//ȸ������ ������, �л� ��û ������ >> ������ ���� 200 ������
		//150 �������� ��¥ ����
		//��ܿ� ���� ��¥ ��� ex) 2021-02-17
		//�䱸���� : 2021�� 02�� 17��
		//150 ������ ���ؼ� ���� ...
		
		//������ class ���� >> method ���ؼ� >> 
		//150 >> EduDate.today() >> ȣ�� >> ���� >> today �Լ� �ѹ��� ���� 
		
		
		String result = Edu_Date.monthFormat_DateString(cal);
		System.out.println(result);
		
		result = Edu_Date.DateString(cal,"-");
		System.out.println(result);

		//System.out.println(cal.get(Calendar.YEAR)+"��"+(cal.get(Calendar.MONTH)+1)+"��"+cal.get(Calendar.DATE)+"��");
	}

}








