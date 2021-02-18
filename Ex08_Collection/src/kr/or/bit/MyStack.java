package kr.or.bit;

//Stack �ڷᱸ���� ����
//���� ���� : Array : Object[] sarray
//MyStack my = new MyStack(10); // �⺻������ �迭�� ���� // ũ�⸦ ���� ���� 
//��ġ���� : ����Ǵ� ���� �ִ� ��ġ����(position, index)
//��� : push(Object) , Object pop , isEmpty , Full

public class MyStack {
	Object[] sarray;
	
	MyStack(int s){
		this.sarray = new Object[s];
	}
	
	void push(Object obj) {
		for(int i = 0; i<sarray.length; i++) {
			if(sarray[i]==null) {
				sarray[i]=obj;
				break;
			}
		}
	}
	
	Object pop(){
		Object obj = null;
		for(int i = sarray.length-1; i<=0; i--) {
			if(sarray[i]==null) {
				continue;
			} else if(sarray[i]!=null) {
				obj = sarray[i];
				sarray[i]=null;
				break;
			}
		}
		return obj;
	}
	
	boolean isEmpty(){
		boolean result = true;
		for(int i = 0; i<sarray.length; i++) {
			if(sarray[i]!=null) {
				result = false;
				break;
			}
		}
		return result;
	}
	
	boolean Full(){
		boolean result = true;
		for(int i = 0; i<sarray.length; i++) {
			if(sarray[i]==null) {
				result = false;
				break;
			}
		}
		return result;
	}
}