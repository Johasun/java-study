/*
����
1. ���� ( error ) 	: ��Ʈ��ũ ���, �޸�, �ϵ���� >> �����ڰ� �ڵ������� �ذ� �Ұ�
2. ���� ( exception )	: �������� �ڵ� �Ǽ��� ���� �߻� >> ������� �ڵ� ( ����ó�� )
>> ���� ... ���ܰ� �߻��ϸ� .. ���α׷��� ���� ���� >> ���������� ����

try{
	 >> ������ �߻��� �� �ִ� �ڵ�
	 >> ������ �߻��ϸ� ... catch ...
}catch(Exception e){
	 >> ������ ����� catch ������ �ľ�
	 >> ó�� ����
	 >> 1. �����ڿ��� email 
	 >> 2. �α����Ͽ� ���� ���
	 >> 3. ���� ����� ���´� // try catch �� �ذ�å�� �ƴ϶� ������ �߻����� �� �˷��ִ� ��
	 >> �������� �ڵ� ������ �ʿ��ϴ� ...
}finally{
	 >> ������ �߻��ϴ�, �߻����� �ʴ� ������ ����Ǿ�� �� �ڵ�
	 >> Db ���� ���� 

}

���ܰ� �߻��ϸ� ������ ���ܹ߻��ǿ� ���ؼ� �ľ�(� �ڿ���, � ����)
���ܿ� ���õ� Ŭ���� ���� ..... ���ܰ� �߻��ϸ� ..... �ڵ����� ���ܿ� �´� Ŭ���� ��ü ����
�׸��� �پ��� ������ �� ��ü�� �־��ݴϴ�

*/
public class Ex01_Exception {
	public static void main(String[] args) {
		System.out.println("main start");
		
		try {
			System.out.println(0/0); //	new ArithmeticException() ���� .. 
		}catch (Exception e) { // Exception Ŭ������ ArithmeticException �� �θ� Ÿ�� (������)
			// ������ ���� �ľ�
			e.printStackTrace();
			//System.out.println("�߻� ���� : " + e.getMessage());
		}
		
		
		
		System.out.println("main end");
		
	}

}
