import java.util.Stack;

import kr.or.bit.MyStack2;

/*
JAVA API
Stack	Queue ����

Stack �ڷᱸ�� �׸� �׸��� �ϱ�(����)
*/
public class Ex05_Stack_Collection {
	public static void main(String[] args) {
		Stack s = new Stack(); //JAVA API
		s.push("A");
		s.push("B");
		System.out.println(s.pop());
		System.out.println(s.pop());
		//���߿� ���°� ���� ���� >> B A
		//System.out.println(s.pop()); 	>>java.util.EmptyStackException
		System.out.println(s.isEmpty()); //true pop �ι����� �� ���� �����
		
		MyStack2 my = new MyStack2(5);
		System.out.println(my.isEmpty());
		System.out.println(my.isFull());
		my.push("A");
		my.push("B");
		my.push("C");
		my.push("D");
		my.push("E");
		//my.push("F");
		System.out.println(my.pop());
		System.out.println(my.pop());
		System.out.println(my.pop());
		System.out.println(my.pop());
		System.out.println(my.pop());
		System.out.println(my.pop());
		
		
	}

}