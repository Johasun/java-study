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
		System.out.println("������̸�: "+this.airname+ ", ��ȣ: "+this.airnum);
	}
	
	public void airPlaneTotalCount() {
		System.out.printf("����� ������� : [%d]\n	", airtotalcount);
	}
}
