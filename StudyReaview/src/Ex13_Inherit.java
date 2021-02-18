

// ������ǰ ������ �Ӽ�
// ��ǰ�� ���ݰ� ��ǰ�� ����Ʈ ������ ������ �ִٴ� ��.
// ������ ������ǰ�� ��ǰ�� ������ �̸��� ������ �ִ�. -> toString -> class�� �̸��� ��ǰ�� �̸�.
class Product{
	int price; // ��ǰ�� ����
	int bonuspoint; // ����Ʈ 
	Product (int price){ // ������ ���ݰ��� �� �޾ƿ;��Ѵ�.
		this.price = price;
		this.bonuspoint = (int)(this.price / 10.0); // ���ʽ� ����Ʈ ����ϱ�
	}
}

// product�� ��ӹ��� KtTv
class KtTv extends Product{
	KtTv(){
		super(500); // kttv�� ������ 500�̴�. ���ݰ��� �Ѱ��ִ� �ܰ��̴�.
		// �ֳĸ� product�� ���ݰ��� �޴°� �⺻ �����ڷ� ���ǵǾ� �ֱ� ������
		// ���ݰ��� ���޾����ָ� ������ ����.
	}
	// ���⼭ ktTv�� product�� ��ӹ޾Ƽ� ��ǰ�� ���ݰ� ����Ʈ�� �ڵ����� �����Ǿ���.
	// �����ڸ� ��ġ�鼭 ��ǰ�� ����Ʈ�� ���Ǿ�����.
	
	@Override
	public String toString() {
		// toString -> ���� �ִ°ǵ� ����� �ϳ��� �Ǵϱ�
		// ktTv������ ��ӹ��� ���ߴٰ�,
		// product�� ������ ��� ��ӹ����鼭
		// product�ȿ� �ִ� ���� �ڵ����� ��ӵǾ�����. -> toString ��ӹޱ� �Ϸ�
		return "KtTv"; // ��ǰ�� �̸��� �־��־���. ������ Ŭ������ �ּҰ��� �����ִ� �Լ����µ�
//		�� �Լ��� �������ؼ� �ű⿡ Ŭ���� �̸��� �־��־���
	}
}

// ��ǰ �ϳ� �� ����� ����
// ��ǰ�� ���鶧���� class�� �ϳ��� �����ؾ��Ѵ�.
// product�� ��ӹ��� Audio
class Audio extends Product{
	Audio(){
		super(100); // Audio�� ����
	}
	
	@Override
	public String toString() {
		return "Audio";
	}
}

// ��Ʈ�ϵ� ������־��� ��ǰ����.
class NoteBook extends Product{
	NoteBook(){
		super(150);
	}
	
	@Override
	public String toString() {
		return "NoteBook";
	}
}

// ��ǰ�� ������ Ŭ������ �����ϴ°���
// �����ڴ� ��ǰ�� �����ϱ� ���� ���� ����Ʈ�� ������ ����.

class Buyer{
	int money = 1000; // �����ڰ� �Ѹ� �߰��ɶ����� ���� �ʸ����� ������ ����
	int bonuspoint; // ���ʽ� ����Ʈ�� ó���� ����. ��ǰ ���ſ� ���ÿ� ���ǰ� ����Ʈ�� ����.
	
	void Buy(Product n) { // ktTv�� �Ѵ� ��� �Լ�! ktTv�� �������� �޾ƿ;�,
		// ��ǰ�� ������ �˰� ��ǰ�� �� �� �ֱ� ������ kttv�� �ּҰ��� �޾ƿͼ�
		// kttv�� ������� �Լ��� ����� �� �ִ�. Ŭ���� ��ü �����̴�.
		if(this.money < n.price) {
			System.out.println("�ܾ��� �����մϴ�. ������ ���� �ܾ�: "+this.money);
			return; //�Լ��� ���� �޼��带 ����������. �ܾ� �����ϸ� �ؿ� ���������� ������ ���� 
		}
		
		// �� ��������
		this.money -= n.price; // ������ �ִ� �ܾ׿� �޾ƿ� �ּҰ��� ����� price���� ���ش�.
		// ���⼭�� tv�� �ּҰ����� �̵��Ǿ��� -> tv�� product�� ��ӹ޾� �����ڿ� 500�� �־����.
		this.bonuspoint += n.bonuspoint; // -> �̰͵� ó���� kttv�� �����������
		// �����ڸ� ȣ���԰� ���ÿ� ���ʽ�����Ʈ�� ���Ǿ�����.
		// �� �̸� ���Ǿ��� ���ʽ������� �����־���.
		
	}
}
public class Ex13_Inherit {
	public static void main(String[] args) {
		KtTv kttv = new KtTv();
		Audio audio = new Audio();
		NoteBook notebook = new NoteBook();
		// ��ǰ���� ��ü�� �ϳ��� �����Ǿ���
		// ���� ���ݰ� ���ʽ�����Ʈ�� ���Ǿ�����.
		
		Buyer buyer = new Buyer();
		// ������ �Ѹ��� �����Ǿ���.
		
		buyer.Buy(kttv);
		buyer.Buy(notebook);
		buyer.Buy(audio);
		

}
