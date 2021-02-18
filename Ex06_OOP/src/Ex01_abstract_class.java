/*
�߻�Ŭ����
>> �̿ϼ� Ŭ����(�ϼ����� ���� ���赵)
1. �ϼ��� �ڵ� + �̿ϼ� �ڵ�
2. �ϼ��� �ڵ�(�Լ�.. ������� �ִ� �Լ�: void run(){�����}) + �̿ϼ� �ڵ�(�Լ�.. ������� ���� �Լ�: void run();
3. �ϼ��� Ŭ����(new ����) 	: �̿ϼ� Ŭ���� ( ������ ��ü ���� �Ұ��� )

����
1. �߻�Ŭ���� (�̿ϼ�) : ������ ��ü ���� �Ұ�( new ��� �Ұ� )
2. �߻�Ŭ���� �ᱹ ... �ϼ��� Ŭ������ ����� ���� ���� [����� ���ؼ� ....]
3. ��Ӱ��迡�� �̿ϼ� �ڿ�(�߻��Լ�) �ϼ��ض� (����) >> ������ �ض�(�߻��ڿ�)

������ ���忡��
>> �ǵ�	>> ��� >> �ݵ�� ������ �ض� >> ������ ���� (���� ���ϴϱ�)
*/

class Car{
	void run() {} // �������� ����
}

class Hcar extends Car{
	//Hcar run() ������ �ص� �ǰ�, ���ص� ���� ����
}

//////////////////////////////////////////
abstract class AbClass{ // abstract Ŭ���� �ȿ� �ּ� 1���� �߻��ڿ��� ����ڴ�
	// �ϼ��� �ڵ�
	int pos;
	void run() {
		++pos;
	}
	//�̿ϼ��� �ڵ�
	abstract void stop(); //{ x } >> �߻��Լ� >> �ݵ�� ������ ���
}

class Child extends AbClass{

	@Override
	void stop() { // ������ ����
		this.pos = 0;
		System.out.println("stop: "+this.pos);
	}
}

class Child2 extends AbClass{

	@Override
	void stop() {
		this.pos = -1;
		System.out.println("stop: "+this.pos);
	}
	
}
public class Ex01_abstract_class {
	public static void main(String[] args) {
		Child ch = new Child();
		ch.run();
		ch.run();
		ch.stop();
		
		Child2 ch2 = new Child2();
		////////////////////////////////////
		// ������
		AbClass ab = ch;
		//�θ�Ÿ���� ���� ������ �ڽ�Ÿ�� ��ü�� �ּҸ� ���� �� �ִ�(������)
		//�� �θ�� �ڱ�Ÿ���� �ڿ��� �� �� �ִ�
		
		ab.run();
		ab.stop(); //������
		//�θ� Ÿ�� ���� .. �߻��Լ� ���� �ȵſ� ... ������(�ڽ�) �Լ� ȣ�� ( ���������� )
	}
}
