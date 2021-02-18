import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
Collection FrameWork
ǥ��ȭ 
[������ �ڿ��� ���� ���������� �����ؼ� ���� �����ϴ� ǥ��] >> �������̽��� ��������

Iterator �������̽� 
>> hasNext(), Next(), remove() �߻��Լ�
>> ���� : ArrayList >> iterator ����

public Iterator iterator(){
	return new A implements Iterator
}

*/
public class Ex08_Collection_iterator {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(100);
		list.add(200);
		list.add(300);
		
		//��� ��������
		for(int i = 0; i< list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//ǥ��ȭ�� ��¹�� (������ �ڿ��� ���ؼ�)
		Iterator it = list.iterator(); 
		// ArrayList �� Collection �������̽��� ������ �ִ� �߻��Լ� ���� 
		// public Iterator iterator(); >> ���� 
		while(it.hasNext()) { // ���� ������ ������ true
			System.out.println(it.next());
		}
		
		ArrayList<Integer> intlist = new ArrayList<Integer>();
		intlist.add(10);
		intlist.add(11);
		intlist.add(12);
		
		Iterator<Integer> it2 = intlist.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		System.out.println("*****************");
		
		//Iterator �������̽�
		//������ ��ȸ (���� : ������ -> �ٽ� ������)
		ListIterator<Integer> it3 = intlist.listIterator();
		
		//������
		while(it3.hasNext()) {
			System.out.println(it3.next());
		}
		
		//������
		while(it3.hasPrevious()) {
			System.out.println(it3.previous());
		}
		
		
	}

}
