import java.util.ArrayList;

/*
Today Point
Generic jdk 1.5
c#, java >> 필수 기능

Collection 클래스 >> 데이터 저장 공간 타입 >> (초창기)Object
1. Object 타입 저항 >> 타입 문제 >> 처음 객체를 생성 >> type 강제 >> 제너릭
2. 타입의 안전성 (타입 강제성)
3. 강제 형변환 (casting): 	Car c = (Car)obj (x) -> 제너릭 사용하면 이런거 안해도된다 

class MyGen<T> { //type parameter
	Object obj;
	
	void add(Object obj) {
		this.obj = obj;
	}
	
	Object get() {
		return this.obj;
	}
}


*/

//클래스 설계 (제너릭 적용) 설계도를 생성
class MyGen<T> { //type parameter
	T obj;
	
	void add(T obj) {
		this.obj = obj;
	}
	
	T get() {
		return this.obj;
	}
}

class Person extends Object {
	int age = 100;
}

public class Ex06_Generic {
	public static void main(String[] args) {
		
		MyGen<String> mygen = new MyGen<String>();
		mygen.add("문자열");
		String str = mygen.get();
		System.out.println(str);
		
		ArrayList list = new ArrayList();
		//내부적인 저장공간의 타입  : Object[] elements
		list.add(10);
		list.add(new Person());
		list.add("홍길동");
		
		for(Object obj : list) {
			//방안에 있는 녀석들의 타입정보
			//값타입, 객체타입 casting ...
			if(obj instanceof Person) { // 타입을 확인
				Person p = (Person)obj;
				System.out.println(p.age);
			}else {
				System.out.println(obj);
			}
		}
		
		ArrayList<Person> plist = new ArrayList<Person>();
		plist.add(new Person());
		plist.add(new Person());
		
		for(Person p : plist) {
			System.out.println(p.age);
		}
		
	}
}
