import kr.or.bit.Card;

public class Ex07_Static_CardMake {

	public static void main(String[] args) {
		// Card 53��
		//heap �޸𸮿� ���� ( ��ü )
		Card c = new Card();
		c.number = 1;
		c.kind = "heart";
		c.h = 80;
		c.w  = 50;
		c.cardInfo();
		
		Card c2 = new Card();
		c2.number = 1;
		c2.kind = "heart";
		c2.cardInfo();
		
		// ��.. ���� .. ī�尡 �۾ƿ�
		// ���Ǽ��� 53 �μ� .....
		
		// h = 80 w = 50 �䱸���� (�ݿ�)
		// ���α׷� ����
		// 1. 53�� ī�� h, w ������ ����
		
		// 2. ���赵 ���� (�ٽ� �μ�)
		
	}

}
