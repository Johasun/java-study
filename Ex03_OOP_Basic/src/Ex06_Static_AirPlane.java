import kr.or.bit.AirPlane;

public class Ex06_Static_AirPlane {

	public static void main(String[] args) {
		AirPlane airplane = new AirPlane(707, "�������װ�");
		airplane.AirPlaneInfo();
		airplane.airPlaneTotalCount();
		
		AirPlane airplane2 = new AirPlane(808, "�������װ�");
		airplane2.AirPlaneInfo();
		airplane2.airPlaneTotalCount();
	}

}
