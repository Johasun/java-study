package kr.or.bit;

class Product{
	int price;
	int bonuspoint;
	Product(int price){
		this.price = price;
		this.bonuspoint = (int)(this.price / 10.0);
	}
}

class KtTv extends Product{
	//가격정보 부모
	KtTv() {
		super(500);
	}
	
	@Override
	public String toString() {
		return "KtTv";
	}
}

class Audio extends Product{
	//가격정보 부모
	Audio() {
		super(100);
	}
	
	@Override
	public String toString() {
		return "Audio";
	}
}

class NoteBook extends Product{
	//가격정보 부모
	NoteBook() {
		super(150);
	}
	
	@Override
	public String toString() {
		return "NoteBook";
	}
}

// 구매자
class Buyer {
	int money;
	int bonuspoint;
	Product[] cart;
	int sum;
	
	Buyer(){
		this(10000);
	}
	
	Buyer(int money){
		cart = new Product[10];
		this.money = money;
		this.bonuspoint = 0;
	}

	//카트에 담기
	void Cart(Product n) {
		for(int i = 0; i<cart.length; i++) {
			if(cart[i]==null) {
				cart[i]=n;
				sum+=n.price; // 금액 누적
				System.out.println(n.toString()+"상품을 장바구니에 담았습니다.");
				break;
			} else if(i==cart.length-1 && cart[i]!=null) {
				System.out.println("장바구니가 가득찼습니다.");
			} 
		}
	}
	
	// 구매한 물건이름과 가격정보 나열
	void summary() {
		System.out.println("<장바구니에 담긴 상품들>");
		for(int i = 0; i<cart.length; i++) {
			if(cart[i]==null) {
				break;
			}
			System.out.println("["+(i+1)+"]"+"상품의 이름: "+ cart[i].toString()+", 상품의 가격: "+cart[i].price);
		}
		System.out.println("전체상품의 가격: "+sum);
		
	}
	
	//단일구매
	void Buy(Product n) {
		if(this.money < n.price) {
			System.out.println("고객님 잔액이 부족합니다 ^^!"+this.money);
			return; // 함수의 종료 ^^(구매행위 종료)
		}
		// 실 구매 행위
		this.money -= n.price; // 잔액
		this.bonuspoint += n.bonuspoint; //누적
		System.out.println("구매한 물건은: "+n.toString());
	}
	
	//장바구니구매
	void CartBuy() { // 구매자가 어떤 물건을 사는지 정보를 알아야 ( 그 물건의 가격정보 얻어올 수 있다)
		if(this.money<sum) {
			System.out.println("금액이 부족하여 장바구니의 모든 제품을 구매할 수 없습니다.");
			System.out.println("당신의 잔액: "+this.money);
			return;
		}
		System.out.println("<구매한 물건>");
		for(int i = 0; i<cart.length; i++) {
			if(cart[i]==null) {
				break;
			}
			this.money -= cart[i].price;
			System.out.print(cart[i].toString()+" ");
		}
		System.out.println(" ");
		System.out.println("현재잔액: "+this.money);
		cart = new Product[10];
		sum = 0;
	}
}



public class Ex12_Inherit_KeyPoint {
	public static void main(String[] args) {
		KtTv kttv = new KtTv();
		Audio audio = new Audio();
		NoteBook notebook = new NoteBook();
		
		Buyer buyer = new Buyer(10000);
		buyer.Cart(kttv);
		buyer.Cart(audio);
		buyer.Cart(kttv);
		buyer.Cart(kttv);
		buyer.Cart(audio);
		buyer.Cart(kttv);
		buyer.Cart(audio);
		buyer.Cart(kttv);
		buyer.Cart(audio);
		buyer.Cart(kttv);
		buyer.Cart(kttv);
		buyer.Cart(audio);
		buyer.summary();
		buyer.CartBuy();
		
		buyer.Cart(kttv);
		buyer.Cart(audio);
		buyer.Cart(kttv);
		buyer.Cart(audio);
		buyer.Cart(kttv);
		buyer.summary();
		buyer.CartBuy();

	}

}
