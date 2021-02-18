

// 가전제품 공통의 속성
// 제품의 가격과 제품의 포인트 정보를 가지고 있다는 점.
// 각각의 가전제품은 제품별 고유한 이름을 가지고 있다. -> toString -> class의 이름이 제품의 이름.
class Product{
	int price; // 상품의 가격
	int bonuspoint; // 포인트 
	Product (int price){ // 생성자 가격값을 꼭 받아와야한다.
		this.price = price;
		this.bonuspoint = (int)(this.price / 10.0); // 보너스 포인트 계산하기
	}
}

// product를 상속받은 KtTv
class KtTv extends Product{
	KtTv(){
		super(500); // kttv의 가격은 500이다. 가격값을 넘겨주는 단계이다.
		// 왜냐면 product는 가격값을 받는게 기본 생성자로 정의되어 있기 때문에
		// 가격값을 전달안해주면 오류가 난다.
	}
	// 여기서 ktTv는 product를 상속받아서 제품의 가격과 포인트가 자동으로 생성되었다.
	// 생성자를 거치면서 제품의 포인트도 계산되어졌다.
	
	@Override
	public String toString() {
		// toString -> 원래 있는건데 상속은 하나만 되니까
		// ktTv에서는 상속받지 못했다가,
		// product의 값들을 모두 상속받으면서
		// product안에 있는 값도 자동으로 상속되어졌다. -> toString 상속받기 완료
		return "KtTv"; // 제품의 이름을 넣어주었음. 원래는 클래스의 주소값을 보내주는 함수였는데
//		그 함수를 재정의해서 거기에 클래스 이름을 넣어주었다
	}
}

// 제품 하나 더 만드는 과정
// 제품은 만들때마다 class를 하나씨 생성해야한다.
// product를 상속받은 Audio
class Audio extends Product{
	Audio(){
		super(100); // Audio의 가격
	}
	
	@Override
	public String toString() {
		return "Audio";
	}
}

// 노트북도 만들어주었음 제품으로.
class NoteBook extends Product{
	NoteBook(){
		super(150);
	}
	
	@Override
	public String toString() {
		return "NoteBook";
	}
}

// 제품의 구매자 클래스를 생성하는과정
// 구매자는 제품을 구매하기 위한 돈과 포인트를 가지고 있음.

class Buyer{
	int money = 1000; // 구매자가 한명 추가될때마다 각각 십만원씩 가지고 있음
	int bonuspoint; // 보너스 포인트는 처음엔 없음. 제품 구매와 동시에 계산되고 포인트가 쌓임.
	
	void Buy(Product n) { // ktTv를 한대 사는 함수! ktTv의 정보값을 받아와야,
		// 제품의 가격을 알고 제품을 살 수 있기 때문에 kttv의 주소값을 받아와서
		// kttv의 변수들과 함수를 사용할 수 있다. 클래스 객체 개념이다.
		if(this.money < n.price) {
			System.out.println("잔액이 부족합니다. 고객님의 현재 잔액: "+this.money);
			return; //함수의 종료 메서드를 빠져나간다. 잔액 부족하면 밑에 구매행위를 행하지 않음 
		}
		
		// 실 구매행위
		this.money -= n.price; // 가지고 있는 잔액에 받아온 주소값에 연결된 price값을 빼준다.
		// 여기서는 tv의 주소값으로 이동되었고 -> tv는 product를 상속받아 생성자에 500을 넣어줬다.
		this.bonuspoint += n.bonuspoint; // -> 이것도 처음에 kttv가 맍들어졌을때
		// 생성자를 호출함과 동시에 보너스포인트가 계산되어졌다.
		// 그 미리 계산되어진 보너스가격을 더해주었다.
		
	}
}
public class Ex13_Inherit {
	public static void main(String[] args) {
		KtTv kttv = new KtTv();
		Audio audio = new Audio();
		NoteBook notebook = new NoteBook();
		// 제품들의 객체가 하나씩 생성되었고
		// 각각 가격과 보너스포인트가 계산되어졌다.
		
		Buyer buyer = new Buyer();
		// 구매자 한명이 생성되었다.
		
		buyer.Buy(kttv);
		buyer.Buy(notebook);
		buyer.Buy(audio);
		

}
