package kr.or.bit;

public class AirPlane {
	private int airnum;
	private String airname;
	private static int airtotalcount;
	
	public AirPlane (int airnum, String airname) {
		this.airnum = airnum;
		this.airname = airname;
		airtotalcount++;
	}
	
	public void AirPlaneInfo() {
		System.out.println("비행기이름: "+this.airname+ ", 번호: "+this.airnum);
	}
	
	public void airPlaneTotalCount() {
		System.out.printf("비행기 누적대수 : [%d]\n	", airtotalcount);
	}
}
