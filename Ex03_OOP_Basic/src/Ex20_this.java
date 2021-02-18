/*
 * 원칙 : 생성자는 객체 생성시 1개만 호출 (Car c = new car() or Car c = new Car(100))
 * 예외적으로
 * this 활용하면 여러개의 생성자를 호출할 수 있다
 * 
 */
//아래코드 중복이 보여요...
//값을 할당하는 부분 중복적으로 ... 할당하는 부분을 1개로 표현할 수 없을까?

class Zcar{
	String color;
	String geartype;
	int door;
	
	Zcar(){
		// 생성자를 호출하는 this ...
		this("red", "auto", 2); // 다시 나를 호출 ^^
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
		System.out.println("overloading constructor param 2개");
	}
	Zcar2(String color, int door, String geartype){
		this.color = color;
		this.door = door;
		this.geartype = geartype;
		System.out.println("overloading constructor param 3개");

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
