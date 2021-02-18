/*
Today Point
[��Ӱ���]���� override : ��Ӱ��迡�� �ڽ��� �θ��� �Լ��� [������]
[��Ӱ���]���� [�ڽ� Ŭ����]�� [�θ�Ŭ����]�� �Լ��� ������ �ٲ۴� { ������ }
������ : Ʋ(�Լ��� �̸�, Ÿ��, parameter)�� ��ȭ�� ���� ���븸 ��ȭ

�����ε��� �ϳ��� �̸����� �������� ����� �ϴ°�
�������̵��� ��Ӱ��迡�� �θ��� �޼��带 ������ �ϴ� ���̴�.

 */
class Point2{
	int x = 4;
	int y = 5;
	
	String getPosition() {
		return this.x + " / " + this.y;
	}
}

class Point3D extends Point2{
	int z = 6;
	
//	String getPosition3() {
//		return null;
//	}
//	���� ... ������ ...
	
	// �Լ��� �ݵ�� ������ �Լ������� ...
	// Annotation�� Java code������ ������ �� ���� �ΰ����� ������ �����Ϸ��� �������� ������ �� �ִ�.
	// @Override ���� �� �Լ��� ���� ������ �°� �Ǿ����� Ȯ���غ�
	@Override
	String getPosition() {
		return this.x + " / " + this.y + " / " + this.z;
	}
}

public class Ex04_Inherit_Override {
	public static void main(String[] args) {
		Point3D point = new Point3D();
		String result = point.getPosition();
		System.out.println(result);
	}

}
