/*

시나리오(요구사항)
저희는 가전제품 매장 솔루션을 개발하는 사업팀입니다
A라는 전자제품 매장이 오픈되면 
[클라이언트 요구사항]
가전제품은 제품의 가격 , 제품의 포인트 정보를 공통적으로 가지고 있습니다
각각의 가전제품은 제품별 고유한 이름을 가지고 있다
ex)
각각의 전자제품은 이름을 가지고 있다(ex: Tv , Audio , Computer)
각각의 전자제품은 다른 가격을 가지고 있다(Tv:5000, Audio:6000 ....)
제품의 포인트는 가격의 10% 적용한다
​
시뮬레이션 시나리오
구매자 : 제품을 구매하기 위한 금액정보 , 포인트 정보를 가지고 있다 
예를 들면 : 10만원 , 포인트 0
구매자는 제품을 구매할 수 있다 , 구매행위를 하게되면 가지고 있는 돈은 감소하고 포인트는 올라간다

1차 코드 (물건이 3개 ...구매할 수 있는 함수)
​
1차 오픈 
-하와이 휴가 ......
공식오픈
매장에 제품이 1000개의 다른 종류의 제품 (마우스 , 토스트기) 제품등록 (자동화)
매장에 1000개의 전시
고객 >> 고객 불만 >> 3개 제품만 살수 있다 ... >> 997 판매 불가 ...

전화 >> 친구 >> 욕(...) >> 친구 >> PC 방 >> 국내 전산망 >> 개발 서버 접속 >> 남은 휴가 3일
>> 997개의 함수를 만들었어요 (마우스 함수 , 토스트기 함수 )
>>END 

변화에 대응하는 코드를 만들지 못했다 .......
>>즐거운 휴가를 보내기 위한 방법을 제시
1. 함수를 하나로 통합할 방법 
2. 제품이 이름 어찌 어찌 ...
3. buy함수를 하나만 만들어서 파라미터를 product객체로 받으면 될 것 같습니다

*/

class Product1{
	int price;
	int bonuspoint;
	Product1(int price){
		this.price = price;
		this.bonuspoint = (int)(this.price / 10.0);
	}
}

class KtTv1 extends Product1{
	//가격정보 부모
	KtTv1() {
		super(500);
	}
	
	@Override
	public String toString() {
		return "KtTv";
	}
}

class Audio1 extends Product1{
	//가격정보 부모
	Audio1() {
		super(100);
	}
	
	@Override
	public String toString() {
		return "Audio";
	}
}

class NoteBook1 extends Product1{
	//가격정보 부모
	NoteBook1() {
		super(150);
	}
	
	@Override
	public String toString() {
		return "NoteBook";
	}
}

// 구매자
class Buyer1{
	int money = 1000;
	int bonuspoint;
	
	///////////////
	///장바구니 생성///
	Product1[] Cart;
	int index = 0;
	void Buy(Product1 n) { // 구매자가 어떤 물건을 사는지 정보를 알아야 ( 그 물건의 가격정보 얻어올 수 있다)
		if(this.money < n.price) {
			System.out.println("고객님 잔액이 부족합니다 ^^!"+this.money);
			return; // 함수의 종료 ^^(구매행위 종료)
		}
		// 실 구매 행위
		this.money -= n.price; // 잔액
		this.bonuspoint += n.bonuspoint; //누적
		System.out.println("구매한 물건은: "+n.toString());
		
	}
}



public class Ex13_Inherit_KeyPoint2 {
	public static void main(String[] args) {
		KtTv1 kttv = new KtTv1();
		Audio1 audio = new Audio1();
		NoteBook1 notebook = new NoteBook1();
		
		Buyer1 buyer = new Buyer1();
		buyer.Buy(kttv);
		buyer.Buy(audio);
		buyer.Buy(notebook);
		buyer.Buy(kttv);

	}

}
