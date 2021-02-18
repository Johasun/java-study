/*
String >> 클래스 > new 통해서 사용가능 > 일반적인 값타입 처럼 사용해도 문제가 없다 
String 가지고 있는 수 많은 함수 (문자열 .. 조작하는 것이 ( 합치고 자르고 붙이고 ) 
String 가지는 다양한 함수 활용  (static 함수 + 일반 함수) 
최소 15개 ~ 20 암기 삶이 편해진다 ....

*/
public class Ex05_String_Class2 {
	public static void main(String[] args) {
		String str = "";
		System.out.println(">"+str+"<");
		// 사용방법 : int, double 와 같이 사용
		
		String[] strarr = {"aaa", "bbb", "ccc"};
		for(String s : strarr) {
			System.err.println(s);
		}
		
		//////////////////////////////지금까지///////////
		String str2 = "홍길동";
		System.out.println(str2.length());
		System.out.println(str2.toString()); // Object >> toString() 재정의 
		System.out.println(str2); //toString() 생략
		
		String str3 = new String("김유신"); // 원래는 이렇게 써야 하는 것.
		
		// 1. String name = "가나다라마";
		// String 클래스의 내부적으로 저장되는 자료구조 char[] >> [가][나][다][라][마]
		// class String extends Object {char[] value .... toString() .. length()}
		
		String str4 = "AAA";
		String str5 = "AAA";
		System.out.println(str4);
		System.out.println(str5.toString());
		System.out.println(str4 == str5);
		// String 하기전에 같은 값이 있으면 재활용을 한다.
		// 따라서 두개의 값은 재활용 했기 때문에 같은 값이 나옴.
		// == 연산자 값을 비교 (str4 (주소값), str5 (주소값)
		// 같은 주소
		// 주소가 아니라 실제 가지고 있는 값을 비교 (문자열)
		// String 비교를 == 쓰면 바보 ... why
		
		String str6 = new String("BBB");
		String str7 = new String("BBB");
		System.out.println(str6==str7); //false
		// String 만들때 new 사용하면 강제적으로 메모리 할당 
		// 여기선 new를 만났기 때문에 같은 값이라도
		// 재활용이 아니라 새로운 메모리를 만들게 됨.
		System.out.println(str6.equals(str7));
		//equals는 실제 메모리에 있는 값을 비교한다. //**********~~~~~~~~~~ ★★★☆☆☆★★★☆☆☆★★★☆☆☆
		
		// 문자열의 비교는 equals 사용
		
		// 넌센스
		String s = "A";
		s+="B";
		s+="C";
		System.out.println(s);
		s = "A";
		// 질문 (성능)
		// String 1000개의 문자를 누적해라 ? => 성능상 좋지 않음.
		// 이걸 보완하기 위해
		// 누적 데이터 ....
		//StringBuffer
		//StringBuilder
		// 누적에 대한 성능의 문제를 알고 있다면 위 두개를 쓴다.
		
	}

}
