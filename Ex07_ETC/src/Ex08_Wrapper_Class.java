import java.util.ArrayList;

/*
�ڹٰ� ������ 8���� �⺻Ÿ��(��Ÿ��) : JAVA API ����

8���� �⺻ Ÿ�Կ� ���ؼ� ���赵�� ���� >> 8���� �⺻ Ÿ�Ե� ��ü ���·� ��� ���� >> wrapper class

�� Ÿ�� ��ſ� ��ü ������ Ÿ�� >> generic (�������� parameter)
1. �Ű����� ��ü Ÿ���� �䱸�� �� 
2. �⺻�� ���� �ƴ� ��ü�� ����Ǳ� ���� ��
3. ��ü�� �� ��
4. Ÿ�� ��ȯ�� ��

*/
public class Ex08_Wrapper_Class {
	public static void main(String[] args) {
		int i = 100;
		
		Integer n = new Integer(100); // is deprecated ���� �������� ����� ��..
		System.out.println(n); // ����� n �ּҰ� ���(toString() ������)
		System.out.println(n.MAX_VALUE);
		System.out.println(n.MIN_VALUE);
		
		//POINT
		//Integer �Լ��� parameter
		//���ʸ�
		ArrayList<Integer> li = new ArrayList<Integer>();
		li.add(100);
		//li.add("A");
		for(int value : li) {
			System.out.println(value);
		}
		//char 	Character
		//int  	Integer
		//�������� �ձ��� �빮��
	}
}
