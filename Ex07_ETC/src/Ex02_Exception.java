
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
		} catch (ArithmeticException e) { // ���� ���� (��üȭ, Ư��ȭ ) ���ƿ� ( ������ up ) Exception ���ٴ� ArithmeticException ���� .. �� ���� ������ �ϴ� ����̰� �ű⼭ ���꿡 ���� ���ܰ� ����ڱ���....
			System.out.println("������ �߻� �α� ��� .. �����ڿ��� ���� �߼�");
			System.out.println("���� : "+e.getMessage());
		} catch (NullPointerException e) { // ���� ���� ���� ���� ...���� ���� ���� 
			
		} catch (Exception e) { // �θ� Ÿ�� 
//			ArithmeticException �ƴϰ� NullPointerException �ƴ� ������ ���ܴ� �ϰ� �� �ذ�
		}
		
			
		System.out.println("main end");
	}

}
