import java.util.ArrayList;
import java.util.Stack;

import kr.or.bit.Coin;

class Product{
	int price;
	int bonuspoint;
	//Product() {	}
	Product(int price) {
		 this.price = price;
		 this.bonuspoint = (int)(this.price / 10.0);
	}
}

class KtTv extends Product {
	 KtTv(){
		  super(500);
	 }
	 //KtTv(int price){ super(price);}
	 
	 @Override
	 public String toString() {
		 return "KtTv";
	 }
}


class Audio extends Product {
	Audio(){
		  super(100);
	 }
 
	 @Override
	 public String toString() {
		 return "Audio";
	 }
}


class NoteBook extends Product {
	NoteBook(){
		  super(150);
	 }
 
	 @Override
	 public String toString() {
		 return "NoteBook";
	 }
}


public class Ex07_Generic_Quiz {

	public static void main(String[] args) {
		//������
		//1. Array  �迭�� ����ؼ�  cart ����� ��ǰ�� �������� (tv , audio , notebook)
		Product[] cart = new Product[3];
		cart[0] = new KtTv();
		cart[1] = new Audio();
		cart[2] = new NoteBook();
		//���ʸ�
		//2. ArrayList   �� ����ؼ�  cart  ����� ��ǰ�� ��������
		ArrayList<Product> pcart = new ArrayList<Product>();
		pcart.add(new KtTv());
		pcart.add(new KtTv());
		pcart.add(new KtTv());
		pcart.add(new KtTv());
		pcart.add(new KtTv());
		pcart.add(new NoteBook());
		
		for(Product product : pcart) {
			System.out.println(product);
		}
		
		// ���� ���̽�
		//Stack 
		
		Stack<Coin> coinbox = new Stack<Coin>();
		coinbox.add(new Coin(100));
		coinbox.add(new Coin(50));
		coinbox.add(new Coin(500));
		coinbox.add(new Coin(10));
		
		while(!coinbox.isEmpty()) {
			Coin coin = coinbox.pop();
			System.out.println("����: "+coin.getValue()+"��");
		}
		
	}

}