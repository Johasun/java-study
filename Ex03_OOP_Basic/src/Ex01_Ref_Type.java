import kr.or.bit.Apt;
import kr.or.bit.BodyInfo;
import kr.or.bit.Car;
import kr.or.bit.Emp;
import kr.or.bit.Person;
import kr.or.bit.Tv;

public class Ex01_Ref_Type {

	public static void main(String[] args) {
		
		 //ctrl + shift + o (�ڵ��ϼ�)
		
		Emp emp = new Emp(); //��������(�ּҰ� ����)
		System.out.println(emp.toString());
		//kr.or.bit.Emp@28a418fc �ּҰ�(����)
		//kr.or.bit.Emp + @ + �ּ�
		
		emp.number =-100;
		System.out.println(emp.number);
		
		emp.setNum(55);
		int result = emp.getNum();
		System.out.println("result : " + result);
		

		emp.setEname("ȫ�浿");
		String name = emp.getEname();
		System.out.println("name : " + name);
		
		
		int num = 100;  //��Ÿ�� ����
		System.out.println(num);
		
		//�� : ��ü�� ����� ����ڸ��� �ٸ� ���� ���� �� �ְ� �ϱ� ���ؼ�
		Apt sapt = new Apt();
		sapt.door = 20;
		System.out.println(sapt.door);
		System.out.println("�ּ� : " + sapt);
		//kr.or.bit.Apt@1f32e575
		
		Apt lapt = new Apt();
		lapt.door = 10;
		System.out.println(lapt.door);
		System.out.println("�ּ� : " + lapt);
		//kr.or.bit.Apt@279f2327
		
		Apt mapt = new Apt();
		System.out.println(mapt.door);
		System.out.println("�ּ� : " + mapt);
		//kr.or.bit.Apt@2ff4acd0
		
		int i = 10;
		int j;
		j = i;
		j = 100;
		//i ���� 100�� �ǳ��� 
		//���Ҵ�
		
		//�ּҰ� �Ҵ�
		Apt apt = new Apt();
		Apt kapt = apt;
		
		apt.door = 9999;
		System.out.println(kapt.door);
		
		System.out.println("apt : " + apt);
		System.out.println("kapt : " + kapt);
		
		//apt : kr.or.bit.Apt@54bedef2
		//kapt : kr.or.bit.Apt@54bedef2
		
		int[] arr = new int[5];
		int[] arr2 = arr; //�ּҰ� �Ҵ�
		//���� �ּҸ� ���� �մϴ�
		
		//��Ÿ��	(8����)
		//����Ÿ�� (class , Array)
		
		Apt ap; //���� (stack ������ ������ Ȯ�� : default 4byte)
		ap = new Apt(); //�Ҵ� (ap��� ������ �޸𸮸� ���´�) (��ü�� �ּҰ��� ���´�)
		//����� �Ҵ��� �и� �Ҽ� �ִ�
		System.out.println("ap �ּҰ� : " + ap);
		ap = null;
		System.out.println("ap �ּҰ� : " + ap);
		
		//�ʱ�ȭ
		Apt ap2; //main �Լ��ȿ� �ִ� ���� scope local >> ��� >> �ʱ�ȭ
		ap2 = null;
		System.out.println(ap2);
		
		//�Լ��ȿ� 
		Car car;
		car = null;
		System.out.println(car);
		
		Apt ap3 = new Apt();
		System.out.println(ap3.car);
		
		Apt ap4 = new Apt();
		
		Apt ap5 = ap4;
		
		//�ּҰ� ��
		//==
		System.out.println(ap3 == ap4);//�� (������ ������ �ִ� ��)
		System.out.println(ap4 == ap5);//true (�� ���� ���� �ּҸ� ������ �־�)
	
		//Tv �Ѵ븦 �����ϼ���
		//����ȸ�� : ��Ʈ
		//ä���� 5�� ����
		//������ ����ϼ���
		
		Tv bittv = new Tv();
		bittv.brandname = "��Ʈ";
		//bittv.ch = 5;
		bittv.ch_Up();
		bittv.ch_Up();
		bittv.ch_Up();
		bittv.ch_Up();
		bittv.ch_Up();
		
		bittv.tv_Info();
		
		//��� 1���� ����
		//��� :7788 , �̸� : ������ , �μ� : IT , �޿� 1000
		//��ü������ Ű�� 190 , ������ 40
		
		Person person = new Person();
		person.empno = 7788;
		person.ename = "������";
		person.job = "IT";
		person.sal = 1000;
		
		//��� 1
		//person.bodyinfo = new BodyInfo();
		//person.bodyinfo.height =190;
		//person.bodyinfo.weight =40;
		
		//��� 2
		BodyInfo info = new BodyInfo();
		info.height = 190;
		info.weight = 40;
		person.bodyinfo = info;
		System.out.println(person.bodyinfo.height);
		System.out.println(person.bodyinfo.weight);
		
	}

}
