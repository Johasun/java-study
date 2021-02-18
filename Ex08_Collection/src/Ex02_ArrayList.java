import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//Today Point


public class Ex02_ArrayList {
	public static void main(String[] args) {
		// List �������̽� ���� : ������ �ְ�, �ߺ� ��� ������ ���� �ٷ� �� ���� Ŭ����
		
		ArrayList arraylist = new ArrayList();
		// Object Ÿ���� ������ ���� �迭 heap ����
		arraylist.add(100);
		arraylist.add(200);
		arraylist.add(300);
		
		for(int i = 0; i< arraylist.size(); i++) {
			System.out.println(arraylist.get(i));
		}
		
		System.out.println(arraylist.toString());
		
		System.out.println(arraylist.get(0));
		
		//�������� ������ �ٷ�� ���� .... (�����)
		//��������� ������ �߰�, ���� >> ArrayList �������� �ʾƿ� >> ������ �ִ� ������ ����
		//[100, 200, 300] >>
		arraylist.add(0, 111);
		System.out.println(arraylist); // [111, 100, 200, 300]
		arraylist.add(400);
		System.out.println(arraylist); // [111, 100, 200, 300, 400]
		
		// arraylist.remove(100); // java.lang.IndexOutOfBoundsException: Index 100 out of bounds 
		// 100�� �ε��� ��ȣ�� ��
		
		// [111, 100, 200, 300, 400] arraylist
		// ArrayList �Լ� ���� (String �Լ� �н�)
		System.out.println(arraylist.contains(200)); //true "200" �̶�� ���� ������ �ִ��� Ȯ��
		System.out.println(arraylist.contains(2000)); //false
		
		arraylist.clear(); // �����͸� ���� (������ ����)
		System.out.println(arraylist.size());
		System.out.println(arraylist.isEmpty()); //true
		
		arraylist.add(101);
		arraylist.add(102);
		arraylist.add(103);
		
		System.out.println(arraylist.isEmpty()); //false
		
		System.out.println("���� ��: "+arraylist.size()); //3
		Object value = arraylist.remove(0); // 0��° ���� ���� ���� .... �� ���� return 
		System.out.println("value: "+value);
		System.out.println("���� �� : "+arraylist.size());
		System.out.println(arraylist);
		
		// POINT
		// ������ ���� �ڵ� ... �ϻ�ٹݻ�
		// ������ ... (Ȯ�强 , ������)
		List li = new ArrayList();
		li.add("��");
		li.add("��");
		li.add("��");
		li.add("��");
		
		List li2 = li.subList(0, 2); // subList �� ���ؼ� ������ ���ջ���
		System.out.println(li2.toString());
		
		System.out.println("======================");
		
		ArrayList alist = new ArrayList();
		alist.add(50);
		alist.add(1);
		alist.add(7);
		alist.add(40);
		alist.add(46);
		alist.add(3);
		alist.add(15);
		
		System.out.println(alist.toString()); //[50, 1, 7, 40, 46, 3, 15] 0~....
		Collections.sort(alist); //�ʱ��ڴ� sort �������� �̿��ϱ�
		System.out.println(alist.toString()); //[1, 3, 7, 15, 40, 46, 50]
		
		Collections.reverse(alist);
		System.out.println(alist.toString()); 
		
		
	}
}
