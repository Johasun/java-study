
public class Ex10_Static_Method {
	int number;
	
	public void print() {
		System.out.println("나 일반 함수 number : "+number);
	}

	public static void method() {
		System.out.println("나 static 함수");
		
	}
	
	public static void main(String[] args) {
		Ex10_Static_Method.method();
		method();
		
		
	}

}
