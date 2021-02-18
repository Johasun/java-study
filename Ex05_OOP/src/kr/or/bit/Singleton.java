package kr.or.bit;
// ������ ���� ( ���� ���� ) >> new ( ��ü )
// ��ü �ϳ��� ����� ���� ...
// �ǵ� : �ϳ��� ��ü�� �����ϰڴ�

// Ȱ��
// ���������� 
// ���� �������� 

// JDBC ���� Ȱ�뿹�� �ҰԿ� ^^
public class Singleton {
	private static Singleton p;
	private Singleton() { // private
		// ���� ��ü ���� �Ұ� ... new ( x ) ... heap ��ü ���� �Ұ� ( �����ڸ� ���ؼ� ) 
		
	}
	
	public static Singleton getInstance() {
		if(p==null) {
			p = new Singleton(); // ������ ȣ�� ��ü �����
		}
		return p;
	}
}

// 1. new ���� ���ϰ� ���� -> �����ڸ� ���ڴ�. 
// 2. ������ �ڿ��� static . 
// 3. null �̸� �̱��� Ÿ�� new
// 4. null �� �ƴϸ� ���� �����Ǿ��� �ּҰ��� ��ȯ�Ѵ�. -> ���� ������ �ʰ�
