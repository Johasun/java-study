import java.util.Scanner;
import java.util.regex.Pattern;

class Student{
	private int number;
	private String phoneNumber;
	private String 
}



public class S0217_HashMap {
	public static void main(String[] args) {
		String str = "^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$";
		
		
		System.out.println("�Է�");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		boolean i = Pattern.matches(str, input);
		if(!i) {
			System.out.println("�߸��� �Է�");
		} else {
			System.out.println("������ġ");
		}
	}
}
