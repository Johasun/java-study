import kr.or.bit.Card;

public class Ex07_Static_CardMake {

	public static void main(String[] args) {
		// Card 53장
		//heap 메모리에 생성 ( 객체 )
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
		
		// 고객.. 변심 .. 카드가 작아요
		// 현실세계 53 인쇄 .....
		
		// h = 80 w = 50 요구사항 (반영)
		// 프로그램 세계
		// 1. 53장 카드 h, w 일일이 변경
		
		// 2. 설계도 변경 (다시 인쇄)
		
	}

}
