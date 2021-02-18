import java.util.Scanner;

public class Check {
	private Scanner scanner;
	private String[][] str;

	
	Check(String[][] str){
		scanner = new Scanner(System.in);
		this.str = str;

	}
	
	void checkSystem() {
		// 예매번호 조회
		scanner.nextLine();
		
		// 예매 번호 받기
		System.out.println("예매번호를 입력해주세요");
		String serialNumber = scanner.nextLine(); 
		
		// 예매 번호 확인
		for(int row = 0; row<str.length; row++) {
			for(int col = 0; col<str[row].length; col++) {
				if(str[row][col].equals(serialNumber)) { // 예매한 좌석 출력
					System.out.printf("고객님이 예매하신 좌석은 %d-%d 입니다.\n", row+1, col+1);
					return;
				}
				else {
					System.out.println("예매번호가 올바르지 않습니다.");
					System.out.println("다시 입력하시겠습니까? 1. 예 2. 아니오");
					int userAnswer = scanner.nextInt();
					if (userAnswer==1) {
						checkSystem();
						return;
					} else {
						return;
					}
				}
			}
		}
	}
}
