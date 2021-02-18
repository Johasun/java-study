package kr.or.bit;

//Stack 자료구조를 설계
//저장 공간 : Array : Object[] sarray
//MyStack my = new MyStack(10); // 기본적으로 배열이 생성 // 크기를 설정 가능 
//위치정보 : 저장되는 값이 있는 위치정보(position, index)
//기능 : push(Object) , Object pop , isEmpty , Full

public class MyStack2{
	private Object[] stackarr; // 저장공간
	private int maxsize; // 최대크기
	private int top; //배열의 index (위치정보)
	
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
			stackarr[++top]=i; //증가하고 넣어야 하니까 전치 -> -1 >> 0
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
