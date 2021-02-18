
public class Ex02_Exception {

	public static void main(String[] args) {
		int num = 100;
		int result = 0;
		System.out.println("main Start");
		
		
		try {
			for(int i = 0; i < 10; i++) {
				result = num / (int)(Math.random()*10); // 0~9
				System.out.println("result : " + result + " i : " + i);
			}
		} catch (ArithmeticException e) { // 하위 예외 (구체화, 특수화 ) 좋아요 ( 가독성 up ) Exception 보다는 ArithmeticException 으로 .. 아 뭔가 연산을 하는 기능이고 거기서 연산에 관한 예외가 생기겠구나....
			System.out.println("문제가 발생 로그 기록 .. 관리자에게 메일 발송");
			System.out.println("원인 : "+e.getMessage());
		} catch (NullPointerException e) { // 하위 예외 먼저 선언 ...상위 예외 쓰기 
			
		} catch (Exception e) { // 부모 타입 
//			ArithmeticException 아니고 NullPointerException 아닌 나머지 예외는 니가 다 해결
		}
		
			
		System.out.println("main end");
	}

}
