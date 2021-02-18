
class Electronics {
	private boolean power;
	
	public void isPower() {
		if(power!=false) {
			power = false;
			System.out.println("전원 OFF");
		}
		else {
			power = true;
			System.out.println("전원 ON");
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
			System.out.println("wifi가 켜졌습니다.");
		}
		else {
			wifi = false;
			System.out.println("wifi가 꺼졌습니다.");
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
		System.out.println("갤럭시 카메라 촬영기능");
	}

	@Override
	public void Connect() {
		System.out.println("갤럭시 인터넷 연결기능");
	}

	@Override
	public void call() {
		System.out.println("갤럭시 통화 연결기능");
	}
	
}

class LG extends SmartPhone{

	LG() {
		super("CC", "LC", "MC", "SC", true);
	}

	@Override
	public void TakePhoto() {
		System.out.println("LG 카메라 촬영기능");
	}

	@Override
	public void Connect() {
		System.out.println("LG 인터넷 연결기능");
	}

	@Override
	public void call() {
		System.out.println("LG 통화 연결기능");
	}

}

class Iphone extends SmartPhone{

	Iphone() {
		super("CB", "LB", "MB", "SB", true);
	}

	@Override
	public void TakePhoto() {
		System.out.println("Iphone 사진촬영기능");
	}

	@Override
	public void Connect() {
		System.out.println("Iphone 인터넷 연결기능");
	}

	@Override
	public void call() {
		System.out.println("Iphone 전화 연결기능");
	}
	
}

public class Hw01 {
	public static void main(String[] args) {
		Galaxy galaxy = new Galaxy();
		LG lg = new LG();
		Iphone iphone = new Iphone();
		
		
		System.out.println("갤럭시 카메라: "+galaxy.camera);
		System.out.println("갤럭시 액정: "+galaxy.display);
		System.out.println("갤럭시 마이크: "+galaxy.microphone);
		System.out.println("갤럭시 스피커: "+galaxy.speaker);
		System.out.println("갤럭시 와이파이: "+galaxy.wifi);
		galaxy.isPower();
		galaxy.call();
		galaxy.Connect();
		galaxy.TakePhoto();
		galaxy.wifiOnOff();
		galaxy.wifiOnOff();
		galaxy.isPower();
		
	}
}






