package kr.or.bit;

public class NoteBook {
	private String color;
	private int year;
	
	//�����Ҵ��� ���� ���� �Ҵ� 
	//�����Ҵ��� ���� (�Լ�) >> Ư���� ���� (setter , getter)
	//�ڵ�ȭ �ڵ� (���� ....�ڵ� ����)
	public void setYear(int y) { //setter
		if(y <= 0) {
			year = 1999;
		}else {
			year = y;
		}
	}
	
	public int getYear() { //getter
		return year;
	}
	
	//�ڵ�ȭ
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	//���콺�� ������ �ִ�
	//�������� �Ӽ� �� ��� 
	//Mouse mouse; 
	public void handle(Mouse m) { //Mouse  �ּҰ��� �޾Ƽ� 
		m.x = 100;
		m.y = 200;
		
	}

	public void noteBookInfo() {
		System.out.println("color : " + color + " year : " + year);
	}
	
	
}
