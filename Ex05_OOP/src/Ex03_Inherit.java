// ���赵
class Tv{
	boolean power; // default false
	int ch;
	
	void power() {
		this.power = !this.power;
	}
	
	void chUp() {
		this.ch++;
	}
	void chDown() {
		this.ch--;
	}
	
}

class Vcr{ //���� �÷��̾�
	boolean power;
	void power() {
		this.power = !this.power;
	}
	void play() {
		System.out.println("����ϱ�");
	}
	void stop() {
		System.out.println("�����ϱ�");
	}
	void rew() {
		
	}
	void ff() {
		
	}
}
/*
 Tv ���赵
 Vcr ���赵
 
 TvVcr �̶�� ��ǰ
 
 1. class TvVcr extends Tv, Vcr >> ���߻�� ����
 2. class Tv extends Vcr .... TvVcr extends Tv >> �ڿ��̸� �浹
 
 �ذ� : class TvVcr extends Tv { Vcr vcr }
 
 >> class TvVcr { Tv t; Vcr v; }
 >> class TvVcr extends Tv { Vcr vcr }
 >> class TvVcr extends Vcr { Tv tv }
 
 Q : Tv ���, Vcr ���
 ���� : �ֱ�� . ���α�� >> �� �߿� ���� >> ������ ���� Ŭ���� ( ��� ) >> �������� ��������
 
 
 */
class TvVcr extends Tv {
	Vcr vcr;
	TvVcr(){
		vcr = new Vcr(); // TvVcr�� �����ϸ� vcr�� ���� ������
		
	}
}


public class Ex03_Inherit {
	public static void main(String[] args) {
		TvVcr t = new TvVcr();
		t.power();
		System.out.println("����: "+t.power);
		t.chUp();
		System.out.println("ä��: "+t.ch);
		
		//����
		t.vcr.power();
		System.out.println("��������: "+t.vcr.power);
		t.vcr.play();
		t.vcr.stop();
		
		t.vcr.power();
		t.power();
		System.out.println("����: "+t.power);
		System.out.println("��������: "+t.vcr.power);

	}
}
