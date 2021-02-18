
class Electronics {
	private boolean power;
	
	public void isPower() {
		if(power!=false) {
			power = false;
			System.out.println("���� OFF");
		}
		else {
			power = true;
			System.out.println("���� ON");
		}
	}

}

abstract class SmartPhone extends Electronics implements Callable, InternetConnectable, Picturable{
	String camera;
	String display;
	String microphone;
	String speaker;
	boolean wifi;
	
	SmartPhone(String camera, String display, String microphone, String speaker, boolean wifi){
		this.camera = camera;
		this.display = display;
		this.microphone = microphone;
		this.speaker = speaker;
		this.wifi = wifi;
	}

	@Override
	public abstract void TakePhoto();

	@Override
	public abstract void Connect();

	@Override
	public abstract void call();
	
	public void wifiOnOff() {
		
		if(wifi!=true) {
			wifi = true;
			System.out.println("wifi�� �������ϴ�.");
		}
		else {
			wifi = false;
			System.out.println("wifi�� �������ϴ�.");
		}
	}
}

interface Callable{
	public void call();
}

interface InternetConnectable{
	public void Connect();
}

interface Picturable{
	public void TakePhoto();
}

class Galaxy extends SmartPhone{

	Galaxy() {
		super("CA", "LA", "MA", "SA", true);
		
	}

	@Override
	public void TakePhoto() {
		System.out.println("������ ī�޶� �Կ����");
	}

	@Override
	public void Connect() {
		System.out.println("������ ���ͳ� ������");
	}

	@Override
	public void call() {
		System.out.println("������ ��ȭ ������");
	}
	
}

class LG extends SmartPhone{

	LG() {
		super("CC", "LC", "MC", "SC", true);
	}

	@Override
	public void TakePhoto() {
		System.out.println("LG ī�޶� �Կ����");
	}

	@Override
	public void Connect() {
		System.out.println("LG ���ͳ� ������");
	}

	@Override
	public void call() {
		System.out.println("LG ��ȭ ������");
	}

}

class Iphone extends SmartPhone{

	Iphone() {
		super("CB", "LB", "MB", "SB", true);
	}

	@Override
	public void TakePhoto() {
		System.out.println("Iphone �����Կ����");
	}

	@Override
	public void Connect() {
		System.out.println("Iphone ���ͳ� ������");
	}

	@Override
	public void call() {
		System.out.println("Iphone ��ȭ ������");
	}
	
}

public class Hw01 {
	public static void main(String[] args) {
		Galaxy galaxy = new Galaxy();
		LG lg = new LG();
		Iphone iphone = new Iphone();
		
		
		System.out.println("������ ī�޶�: "+galaxy.camera);
		System.out.println("������ ����: "+galaxy.display);
		System.out.println("������ ����ũ: "+galaxy.microphone);
		System.out.println("������ ����Ŀ: "+galaxy.speaker);
		System.out.println("������ ��������: "+galaxy.wifi);
		galaxy.isPower();
		galaxy.call();
		galaxy.Connect();
		galaxy.TakePhoto();
		galaxy.wifiOnOff();
		galaxy.wifiOnOff();
		galaxy.isPower();
		
	}
}






