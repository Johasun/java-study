

import java.util.Scanner;
public class Cancel {

	private Scanner scanner;

	public Cancel() {

		scanner = new Scanner(System.in);

	}

	public void Cancel() {
		
	    int reservationNumber;
		System.out.println("예약번호를 입력해주세요");

		Scanner scanner = new Scanner(System.in);
        reservationNumber = scanner.nextInt();
        System.out.println(reservationNumber);
        System.out.println("고객님이 예약하신 좌석은 "row+"-"+col+" 입니다.");
        
        System.out.println("예매를 취소하시겠습니까?");
        System.out.println("네(1), 아니오(2) 중 하나를 입력해주세요.");
        
        
		int userNumber;
		userNumber = scanner.nextInt();

			
			if(userNumber == 1) {
				seat[row][col]="___";
				System.out.println("예매가 취소되었습니다. 감사합니다.");
			}if else(userNumber == 2) {
				
			
				//메뉴로 돌아가기
				return Cinema;
			}

		}

	}
}

