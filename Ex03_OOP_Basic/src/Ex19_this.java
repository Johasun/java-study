/*
this
1. 객체 자신을 가르키는 this(앞으로 생성될 객체의 주소를 담을 곳이라고 가정)
2. this 객체 자신(생성자 호출) >> 원칙 : 생성자는 객체를 만들때 한번만 호출
2.1 this 여러개의 생성자 호출 가능

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
