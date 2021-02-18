/*
����(�ǹ� ���� ȯ��)
���赵 1�� .......
���赵 ���� (������ �����ϴ�) �ϳ��� ���赵 �Ұ� >> �������� ���赵 �����
���θ� >> ȸ������ , ��۰��� , �ֹ����� , ��ǰ���� .... >> ������ ���赵 ���� ����

�������� ���赵 � ���ؿ��� ������ ��ġ�� ....

���� ���� ..å ..
1. is ~ a  �� ~�̴� (�θ� �ڿ�) >> ���
2. has ~ a �� ~�� ������ �ִ� >> ���� 

��)
��   ����
���� �����̴� (0)
���� ������ ������ �ִ� (x)

>>�� extends ����


��   �� ����
���� ���̴� (x)
���� ���� ������ �ִ� (0)
>> class �� { �� }

�������� ���� ....

����   ����
������ �����̴� (x)
������ ������ ������ �ִ�(0)
class ����{}
class ����{
   void �⵿(����){
   
   }
}

��) ��  , �ﰢ�� , �簢�� ����� ���赵�� �ۼ��ϼ���

���� �����̴�
�ﰢ���� �����̴�
�簢���� �����̴�

���� : �߻�ȭ , �Ϲ�ȭ >> �����ڿ� >> �׸��� , ���� 
�� : ��üȭ , Ư��ȭ >> ������ ������ Ư¡ >> ������ ,����

�� : ��ǥ�� >> (x,y)
-���� ���� ������ �ִ�
-�ﰢ���� ���� ������ �ִ�
-�簢���� ���� ������ �ִ�

class Shape{ �׸��� , ����  } >> ��Ӱ��� (�θ�)
class Point { x , y } >> ���� 

��
*/

class Shape{
	String color="gold";
	void draw() {
		System.out.println("�׸���");
	}
}

class Point{
	int x;
	int y;
	Point(){
		//this.x = 1;
		//this.y = 1;
		this(1,1);
	}
	Point(int x , int y){
		this.x = x;
		this.y = y;
	}
}
//���� ���弼�� (���� ���Ǵ� ������ �������� ������ �ִ�)
//1. ���� �����̴�
//2. ���� ���� ������ �ִ� (member field >> Point)
//3. ���� �������� ������ �ִ�  Ư���� (r)

//���� �������� �ʱⰪ 10�� ������
//���� ��ǥ�� �ʱⰪ (10,15) ������
//�⺻(�ʱⰪ)�� �������� ������ �������� ���� ���� �Է¹��� �� �ִ�

class Circle  extends Shape{
	Point point; //����
	int r; //���� ��üȭ , Ư����
	
	Circle() {
		//this.r = 10;
		//this.point = new Point(10,15);
		this(10,new Point(10,15));
	}
	
	Circle(int r , Point point){
		this.r = r;
		this.point = point;
	}
	
}

//�� ������ ���� ���� �ϼż�
//����
//�ﰢ�� Ŭ������ ���弼��
//�ﰢ���� 3���� ���� �׸��� �׸��ٶ�� ����� ������ �ִ�
//������ ����  Shape  �� Point  ���� �޾Ƽ� ���
//default �ﰢ���� ���� ���� �ְ� 3���� �޾Ƽ� �׸��� �׸� �� �ִ�
//class Triangle ...

//60��

//80�� (�ݺ��ڵ� ����)

//100��  (Point x;Point y;Point z;) >> Point[] pointarray
class Triangle extends Shape{
	Point x;
	Point y;
	Point z;
	
	Triangle() {
		//this.x = new Point(10,20);
		//this.y = new Point(30,40);
		//this.z = new Point(50,60);
		this(new Point(10,20),new Point(30,40),new Point(50,60));
	}
	
	Triangle(Point x, Point y , Point z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	//��üȭ , Ư��ȭ 
	//�߰����� ��� ������ ����
	void trianglePoint() {
		System.out.printf("x : (%d,%d)\t",x.x,x.y);
		System.out.printf("y : (%d,%d)\t",y.x,y.y);
		System.out.printf("z : (%d,%d)\t",z.x,z.y);
		System.out.println();
	}
}

//100�� Triangle2  �ﰢ�� Ŭ����
class Triangle2 extends Shape{
	Point[] pointarray;
	
	Triangle2() {
		/*
		this.pointarray = new Point[3];
		pointarray[0] = new Point(10,20);
		pointarray[1] = new Point(30,40);
		pointarray[2] = new Point(50,60);
		this(this.pointarray);
		*/
		this(new Point[] {new Point(10,20) , new Point(30,40) , new Point(50,60)});
		// ��ü �迭�� ��ȿ� �ּҰ��� �־��ִ� �͵� ����� �Ѵ�.
		
	}
	
	Triangle2(Point[] pointarray){
		this.pointarray = pointarray;
	}
	
	//���
	void trianglePoint() {
		for(Point point : this.pointarray) {
			System.out.printf("point : (%d , %d)\t\n",point.x ,point.y);
		}
	}
}



public class Ex02_Inherit_Composition {
	public static void main(String[] args) {

		Circle circle = new Circle();
		System.out.println("������ : " + circle.r);
		System.out.println("�θ��ڿ� : " + circle.color);
		System.out.println("��ǥ x : " + circle.point.x);
		System.out.println("��ǥ y : " + circle.point.y);
		circle.draw();
		System.out.println("---------------------------");
		
		Circle circle2 = new Circle(20,new Point(10,20));
		System.out.println("������ : " + circle2.r);
		System.out.println("�θ��ڿ� : " + circle2.color);
		System.out.println("��ǥ x : " + circle2.point.x);
		System.out.println("��ǥ y : " + circle2.point.y);
		circle.draw();
		System.out.println("---------------------------");
		
		Triangle triangle = new Triangle();
		triangle.trianglePoint();
		triangle.draw();
		
		System.out.println("************************");
		Triangle triangle2 = new Triangle(new Point(1,2),new Point(3,4),new Point(5,6));
		triangle2.trianglePoint();
		triangle2.draw();
		
		System.out.println("*************************");
		Point[] pointarr = {new Point(11,21),new Point(31,41),new Point(51,61)};
		Triangle2 tri3 = new Triangle2(pointarr);
		tri3.trianglePoint();
		tri3.draw();
		
		Point[] pointarr2 = {new Point(11,21), new Point(31,41), new Point(51, 61), new Point(61, 56)};
		Triangle2 tri4 = new Triangle2(pointarr2);
		tri4.trianglePoint();
		
		
	}

}