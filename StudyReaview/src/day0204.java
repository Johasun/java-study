
class Shape{ // ����
	void print() {
		System.out.println("�׸���.");
	}
}

class Point{
	int x;
	int y;
	
	Point(){
		this(3, 5);
	}
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Triangle extends Shape{
	Point x;
	Point y;
	Point z;
	
	Triangle(){
		this(new Point(10, 20), new Point(30, 40), new Point(50, 60));
	}
	
	Triangle(Point x, Point y, Point z){
		this.x = x;
		this.y = y;
		this.z = z;
	}
}

class Triangle2 extends Shape{
	Point[] point;
	
	Triangle2(){
		this(new Point[] {new Point (10, 20), new Point(30, 40), new Point(50, 60)});
	}
	
	Triangle2(Point[] point){
		this.point = point;
	}
}

class Circle extends Shape{
	Point point;
	int r;
	
	Circle(){
		this(new Point(10, 15), 10);
	}
	
	Circle(Point point, int r){
		this.point = point;
		this.r = r;
	}
}


public class day0204 {
	public static void main(String[] args) {
		Circle circle = new Circle();
		System.out.println("���� x��ǥ: "+circle.point.x);
		System.out.println("���� y��ǥ: "+circle.point.y);
		System.out.println("���� ������: "+circle.r);
	}
}
