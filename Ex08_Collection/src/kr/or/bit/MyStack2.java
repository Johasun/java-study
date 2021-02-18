package kr.or.bit;

//Stack �ڷᱸ���� ����
//���� ���� : Array : Object[] sarray
//MyStack my = new MyStack(10); // �⺻������ �迭�� ���� // ũ�⸦ ���� ���� 
//��ġ���� : ����Ǵ� ���� �ִ� ��ġ����(position, index)
//��� : push(Object) , Object pop , isEmpty , Full

public class MyStack2{
	private Object[] stackarr; // �������
	private int maxsize; // �ִ�ũ��
	private int top; //�迭�� index (��ġ����)
	
	public MyStack2(int maxsize) {
		this.maxsize = maxsize;
		stackarr = new Object[maxsize];
		top = -1;
	}
	
	public boolean isEmpty() {
		return (top == -1); //true, false
	}
	
	public boolean isFull() {
		return (top == maxsize -1);
	}
	
	public void push(Object i) {
		if(isFull()) {
			System.out.println("stack full....");
		}else {
			stackarr[++top]=i; //�����ϰ� �־�� �ϴϱ� ��ġ -> -1 >> 0
		}
	}
	
	public Object pop() {
		Object value = null;
		
		if(isEmpty()) {
			System.out.println("stack empty");
		}else {
			value = stackarr[top];
			top--;
		}
		
		return value;
	}
}
