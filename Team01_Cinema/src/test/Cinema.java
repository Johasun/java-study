package test;

import java.util.Scanner;

public class Cinema {
	Scanner scanner;
	private String[][] seat;
	String cerealNumber = "10000000";
	
	Cinema(){
		seat = new String[4][5];
		for(int i = 0; i<seat.length; i++) {
			for(int j = 0; j<seat[i].length; j++) {
				seat[i][j]="__";
			}
		}
		scanner = new Scanner(System.in);
	}
	
	// 메뉴화면
	private int CinemaMenu() {
		int menu = 0;
		System.out.println("***********************");
		System.out.println("******영화 예매 시스템******");
		System.out.println("***********************");
		System.out.println("1. 예매하기");
		System.out.println("2. 예매조회");
		System.out.println("3. 예매취소");
		System.out.println("4. 프로그램종료");
		menu = scanner.nextInt();
		return menu;
	}
	
	// 프로그램 가동(반복)
	public void menuWhile() {
		loop_1: while(true) {
			switch(CinemaMenu()) {
			case 1 : // 예매하기
				booking();
				break;
			case 2 : // 예매조회
				checkSystem();
				break;
			case 3 : // 예매취소
				break;
			case 4 :
				break loop_1;
			default :
				System.out.println("올바른 메뉴값이 아닙니다.");
				System.out.println("다시 입력해주세요");
				break;
			}
		}
	}
	
	// 예매하기
	private void booking() {
		
		System.out.println("******좌석 현황******");
		for(int i = 0; i<seat.length; i++) {
			for(int j = 0; j<seat[i].length; j++) {
				String seatNumber = "["+(i+1)+"-"+(j+1)+"]";
				System.out.print((seat[i][j].equals("__")) ? seatNumber : "예매");
			}
			System.out.print("\n");
		}
		System.out.println("-------------------");
		System.out.println("좌석을 선택해주세요. 예)1-1");
		System.out.println("이미 예매된 좌석은 \"예매\"라고 표시됩니다.");
		scanner.nextLine();
		String userNumber = scanner.nextLine();
		

		boolean result = true;
		for(int i = 0; i<seat.length; i++) {
			for(int j = 0; j<seat[i].length; j++) {
				String choiceNumber = (i+1)+"-"+(j+1);
				if(userNumber == choiceNumber && seat[i][j]=="__") {
					result = true;
				}
			}
		}
		if(!result) {
			System.out.println("이미 예매되어있는 좌석입니다.");
		}else {
			System.out.println("예매 가능합니다. 예매하시겠습니까?");
			System.out.println("네(1), 아니오(2), 초기화면(0)중 하나를 입력해주세요.");
			int userChoice = scanner.nextInt();
			
			switch(userChoice) {
			case 1 : 
				for(int i = 0; i<seat.length; i++) {
					for(int j = 0; j<seat[i].length; j++) {
						String choiceNumber = (i+1)+"-"+(j+1);
						if(choiceNumber == userNumber) {
							seat[i][j]=cerealNumber;
						}
					}
				}
				System.out.println("예매가 완료되었습니다.");
				System.out.printf("예매한 좌석번호:[%s] / 예매번호:[%s]\n", userNumber, cerealNumber);
				break;
			case 2 :
				
				break;
			case 3 :
				break;
			}
		}
		
		

	}
	
	// 예매조회
	void checkSystem() {
		// 예매번호 조회
		scanner.nextLine();
		
		// 예매 번호 받기
		System.out.println("예매번호를 입력해주세요");
		String serialNumber = scanner.nextLine(); 
		
		// 예매 번호 확인
		for(int col = 0; col<seat.length; col++) {
			for(int row = 0; row<seat[col].length; row++) {
				if(seat[col][row].equals(serialNumber)) { // 예매한 좌석 출력
					System.out.printf("고객님이 예매하신 좌석은 %d-%d 입니다.\n", col+1, row+1);
				}
			}
		}
	}
	// 예매취소
	
}
