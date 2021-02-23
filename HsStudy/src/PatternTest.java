import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternTest {
	public static void main(String[] args) {
		
		String pattern = "^\\d{3}-\\d{3}$";
		/*
		구 우편번호 주소
		ex) 100-111
		1) ^ : 시작
		2) \\d{3} :숫자 3자리만 올 수 있음
		3) - : 가운데 '-'가 들어가야된다.
		4) \\d{3} : 숫자 3자리만 올 수 있음
		5) $ : 끝
		
		*/
		System.out.println("우편번호를 입력해주세요");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		boolean i = Pattern.matches(pattern, input);
		if(i==true) {
			System.out.println("올바른 우편번호입니다.");
		} else {
			System.out.println("올바르지않은 우편번호입니다.");
		}
		
	}
}
