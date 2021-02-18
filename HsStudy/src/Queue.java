
//Stack 자료구조를 설계
//저장 공간 : Array : Object[] sarray
//MyStack my = new MyStack(10); // 기본적으로 배열이 생성 // 크기를 설정 가능 
//위치정보 : 저장되는 값이 있는 위치정보(position, index)
//기능 : push(Object) , Object pop , isEmpty , Full

public class Queue {
	private Object[] sarray;
	private int maxsize;
	private int top;
	
	public Queue(int maxsize) {
		this.maxsize = maxsize;
		sarray = new Object[maxsize];
		top = -1; // top이 -1일때는 배열이 null인 상태.
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	public boolean Full() {
		return (top == maxsize-1);
	}
	
	public Object pop() { // 제거
		Object obj = null;
		if(isEmpty()) {
			System.out.println("Stack empty...");
		}else {
			obj = sarray[top];
			top--;
		}
		return obj;
	}
	
	public void push(Object obj) { // 저장
		if(Full()) {
			System.out.println("Stack full....");
		} else {
			sarray[++top]=obj;
		}
	}
	
}
