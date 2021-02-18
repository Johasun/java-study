import java.util.Scanner;

public class Ex11_do_while_Menu {
	//상단 ... 일반 ... 변수 (고유, 상태 , 부품(참조:클래스))
	Scanner sc = new Scanner(System.in); //부품(참조:클래스)
	public int[][] seats = new int[4][5];
	
	//기능
	void inputRecord() { // 예매하기
		System.out.println("********좌석 현황********");
		
		// 좌석현황 표 보이기
		for(int i = 0; i<seats.length; i++	) {
			System.out.println(seats[i]);
			}
			
		
		
		// 좌석을 선택해주세요
		
		// 사용자 좌석 입력
		
		// 예매 가능 확인
		
		// 예매 가능 결과 출력
		
		// 예매 완료 출력 ( 좌석번호 + 예매 번호 )
		
	}
	void deleteRecord() { // 예매조회
		System.out.println("********예매 조회********");
		
		// 예매번호 입력 받기
		
		// 올바르지 않은 예매번호 오류 출력
		// 예매번호 확인하여 좌석 출력
		
	
	}
	void sortRecord() { // 예매취소
		System.out.println("********예매 취소********");
		
		// 예매번호 입력 받기 -> 예매 조회와 중복
		
		// 예매 번호 출력하기 -> 여기까지 예매조회와 동일
		
		// 예매 취소 선택 메시지 출력
		
		// 예미 취소하기
	}
	
	
	
	
	int displayMenu() {
		System.out.println("********************");
		System.out.println("****영화 예매 시스템****");
		System.out.println("********************");
		System.out.println("1. 예매하기");
		System.out.println();
		System.out.println("2. 예매조회");
		System.out.println();
		System.out.println("3. 예매취소");
		System.out.println();
		System.out.println("4. 프로그램 종료");
		System.out.println();
		
		
		int menu = 0;
		do {
			  try {
					    menu = Integer.parseInt(sc.nextLine()); // 메뉴 번호 입력 받기
					    
						if(menu >= 1 && menu <= 4) {
							break; //while 탈출 (1<= menu <=4)
						}else {
							//1보다 작거나 4보다 큰 값값 .. 프로그램적인 오류 (x)
							//나는 오류 보겠다 (오류 사용자 강제)
							//System.out.println("잘못 입력 하셨습니다");
							throw new Exception("메뉴 선택 번호가 잘못 되었습니다");
						}
			  }catch (Exception e) {
				  System.out.println(e.getMessage());
				  System.out.println("메뉴 선택 문제 발생");
				  System.out.println("메뉴 1~4번까지 입력");
			  }
			  
		}while(true);
		//실행 : 사용자가 1 ~ 4까지 번호중에서 하나를 선택
		return menu; // 사용자가 선택한 메뉴 번호 반환
	}
	
	public static void main(String[] args) {
		Ex11_do_while_Menu ex11 = new Ex11_do_while_Menu();
		while(true) {
			switch (ex11.displayMenu()) { // 메뉴 화면 출력
			case 1 : ex11.inputRecord(); // 예매하기
				break;
			case 2 : ex11.deleteRecord(); // 예매조회
				break;
			case 3 : ex11.sortRecord(); // 예매취소
				break;
			case 4 : System.out.println("프로그램 종료");
					 //return;  //main 종료
					 System.exit(0); //프로그램 강제 종료 (kill)
			}
		}
	}

}