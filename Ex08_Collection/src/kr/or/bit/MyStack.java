package kr.or.bit;

//Stack 자료구조를 설계
//저장 공간 : Array : Object[] sarray
//MyStack my = new MyStack(10); // 기본적으로 배열이 생성 // 크기를 설정 가능 
//위치정보 : 저장되는 값이 있는 위치정보(position, index)
//기능 : push(Object) , Object pop , isEmpty , Full

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
