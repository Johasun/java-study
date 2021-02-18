import kr.or.bit.AirPlane;

public class Ex06_Static_AirPlane {

	public static void main(String[] args) {
		AirPlane airplane = new AirPlane(707, "대한이항공");
		airplane.AirPlaneInfo();
		airplane.airPlaneTotalCount();
		
		AirPlane airplane2 = new AirPlane(808, "대한이항공");
		airplane2.AirPlaneInfo();
		airplane2.airPlaneTotalCount();
	}

}
