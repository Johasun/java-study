
public class Ex10_Static_Method {
	int number;
	
	public void print() {
		System.out.println("�� �Ϲ� �Լ� number : "+number);
	}

	public static void method() {
		System.out.println("�� static �Լ�");
		
	}
	
	public static void main(String[] args) {
		Ex10_Static_Method.method();
		method();
		
		
	}

}
