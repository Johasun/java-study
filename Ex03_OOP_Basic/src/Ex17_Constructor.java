
//this를 안쓴 코드
// 1. parameter 이름 모호 ...(member field 명 ... 같이 ...충돌) >> this
// 2. 개발자 성격 반복 .. 싫어 해결 >> this


class Car6{
	int door;
	String color;
	
	public Car6() {
		this(4, "red");
	}
	
	public Car6(int userdoor) {
		this(userdoor, "red");
	}
	
	public Car6(String usercolor) {
		this(4, usercolor);
	}
	
	public Car6(int userdoor, String usercolor) {
		door = userdoor;
		color = usercolor;
	}
	
	public void carInfo() {
		System.out.println("door : "+door +", color : "+color);
	}
}
public class Ex17_Constructor {
	public static void main(String[] args) {
		Car6 car6 = new Car6(); // 기본
		Car6 car7 = new Car6(3);
		Car6 car8 = new Car6("blue");
		Car6 car9 = new Car6(3, "blue");
		
		car6.carInfo();
		car7.carInfo();
		car8.carInfo();
		car9.carInfo();
		
	}

}
