import java.util.ArrayList;

import kr.or.bit.Emp;

public class EX03_ArrayList_Object {
	public static void main(String[] args) {
		//��� 1���� ���弼��
		Emp emp = new Emp(100, "������", "����");
		System.out.println(emp.toString());
		
		// ��� 2���� ���弼��
		// Array
		Emp[] emplist = {new Emp(100, "�达", "�Ϲ�"), new Emp(200, "�ھ�", "�л�")};
		for(Emp e : emplist) {
			System.out.println(e.toString());
		}
		
		//1�� �Ի縦 �� �߾�� �߰����ּ��� (����)
		//Emp[] emplist = new Emp[3];
		//���� ������ �̵� ... 
		
		//Collection
		//ArrayList
		ArrayList elist = new ArrayList();
		elist.add(new Emp(1, "��", "IT"));
		elist.add(new Emp(2, "��", "IT"));
		//1�� �Ի�
		elist.add(new Emp(3, "��", "IT"));
		System.out.println(elist.size());
		
		for(int i = 0; i<elist.size(); i++) {
			//System.out.println(elist.get(i));
			//Emp e = elist.get(i); ArrayList ������ �ִ� �迭 Ÿ�� Object[] ...
			Object obj = elist.get(i);
			//System.out.println(obj); // ������ �� toString() ȣ��
			Emp e = (Emp)obj;
			System.out.println(e.getEmpno() + " / " + e.getEname() + " / "+ e.getJob());
		}
		
		for(Object e : elist) {
			//������ ���󼭴� downcasting
			Emp e2 = (Emp)e;
		}
		
		//�����ڰ� ���� �Ⱦ��ϴ� �� casting ����
		//��¥�� ...
		//Object �Ⱦ� ... �Ⱦ��� �;�
		//��û JAVA ���� ����鿡�� ...
		//generic Ÿ�� (��ü ���� Ÿ�� ����)
		//�������� 90% ���ʸ� ...
		ArrayList<Emp> list2 = new ArrayList<Emp>();
		list2.add(new Emp(1, "A", "IT"));
		
		for(Emp e : list2) {
			System.out.println(e);
		}
	}
}