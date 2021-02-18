
//Stack �ڷᱸ���� ����
//���� ���� : Array : Object[] sarray
//MyStack my = new MyStack(10); // �⺻������ �迭�� ���� // ũ�⸦ ���� ���� 
//��ġ���� : ����Ǵ� ���� �ִ� ��ġ����(position, index)
//��� : push(Object) , Object pop , isEmpty , Full

public class Queue {
	private Object[] sarray;
	private int maxsize;
	private int top;
	
	public Queue(int maxsize) {
		this.maxsize = maxsize;
		sarray = new Object[maxsize];
		top = -1; // top�� -1�϶��� �迭�� null�� ����.
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean Full() {
		return (top == maxsize-1);
	}
	
	public Object pop() { // ����
		Object obj = null;
		if(isEmpty()) {
			System.out.println("Stack empty...");
		}else {
			obj = sarray[top];
			top--;
		}
		return obj;
	}
	
	public void push(Object obj) { // ����
		if(Full()) {
			System.out.println("Stack full....");
		} else {
			sarray[++top]=obj;
		}
	}
	
}
