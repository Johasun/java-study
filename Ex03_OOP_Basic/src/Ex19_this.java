/*
this
1. ��ü �ڽ��� ����Ű�� this(������ ������ ��ü�� �ּҸ� ���� ���̶�� ����)
2. this ��ü �ڽ�(������ ȣ��) >> ��Ģ : �����ڴ� ��ü�� ���鶧 �ѹ��� ȣ��
2.1 this �������� ������ ȣ�� ����

*/

class Test5{
	int i;
	int j;
	
	Test5(){
		
	}
	Test5(int i, int j){
		i = i;
		j = j;
	}
}

class Socar{
	String color;
	String geartype;
	int door;
	
	public Socar() {
		this.color="red";
		this.geartype="auto";
		this.door=2;
	}
	
	public Socar(String color, String geartype, int door) {
		this.color = color;
		this.geartype = geartype;
		this.door = door;
	}
	
	void print() {
		System.out.println(this.color + "/"+this.geartype+"/"+this.color);
	}
}
public class Ex19_this {

	public static void main(String[] args) {
		Test5 test5 = new Test5(10, 10);
		System.out.println(test5.i);
		
		Socar socar = new Socar("red", "auto", 6);
		socar.print();
		
	}

}
