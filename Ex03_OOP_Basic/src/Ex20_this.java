/*
 * ��Ģ : �����ڴ� ��ü ������ 1���� ȣ�� (Car c = new car() or Car c = new Car(100))
 * ����������
 * this Ȱ���ϸ� �������� �����ڸ� ȣ���� �� �ִ�
 * 
 */
//�Ʒ��ڵ� �ߺ��� ������...
//���� �Ҵ��ϴ� �κ� �ߺ������� ... �Ҵ��ϴ� �κ��� 1���� ǥ���� �� ������?

class Zcar{
	String color;
	String geartype;
	int door;
	
	Zcar(){
		// �����ڸ� ȣ���ϴ� this ...
		this("red", "auto", 2); // �ٽ� ���� ȣ�� ^^
		System.out.println("default constructor");
	}
	
	Zcar(String color, String geartype, int door){
		this.color = color;
		this.geartype = geartype;
		this.door = door;
		System.out.println("overloading constructor");
	}
	
	void print() {
		System.out.println(this.color + ", "+this.geartype+", "+this.door);
	}
}

class Zcar2{
	String color;
	String geartype;
	int door;
	
	Zcar2(){
		this("red", 1);
		System.out.println("default constructor");
	}
	Zcar2(String color, int door){
		this(color, door, "auto");
		System.out.println("overloading constructor param 2��");
	}
	Zcar2(String color, int door, String geartype){
		this.color = color;
		this.door = door;
		this.geartype = geartype;
		System.out.println("overloading constructor param 3��");

	}
	void print() {
		System.out.println(this.color + ", "+this.geartype+", "+this.door);
	}
}
public class Ex20_this {

	public static void main(String[] args) {
//		Zcar zcar = new Zcar();
//		zcar.print();

		Zcar2 zcar = new Zcar2();
		zcar.print();
		
		Zcar2 zcar2 = new Zcar2("gold", 2);
		
		Zcar2 zcar3 = new Zcar2("red", 10, "auto");
	
	}

}
