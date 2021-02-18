
public class SeatSee {

	static String[][] seat = new String[4][5];

	static void seatSee() {
		System.out.println("***********좌석 현황************");
		for (int i = 0; i < seat.length; i++) {
			for(int j = 0; j < seat[i].length; j++) {
				 
				seat[i][j]="__";
			}
		}
		for(int i = 0 ; i < seat.length ; i++) {
			for(int j = 0 ; j < seat[i].length ; j++) {
				String strSeat = "[" + (i+1) +"-" + (j+1) + "]";
				System.out.print((seat[i][j].equals("__")) ? strSeat : "예매");
			}
			System.out.println();
		}
		System.out.println("--------------------------");
		
	}   
	public static void main(String[] args) {
		seatSee();
	}

}
