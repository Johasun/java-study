
public class Ex03_Cinema {

	public static void main(String[] args) {
		String[][] seat = new String[3][5];
		
		for(int i = 0 ; i < seat.length ; i++) {
			for(int j = 0 ; j < seat[i].length ; j++) {
				seat[i][j] ="__"; //�¼�
			}
		}
		
	
		for(int i = 0 ; i < seat.length ; i++) {
			for(int j = 0 ; j < seat[i].length ; j++) {
				System.out.print(seat[i][j]);
			}
			System.out.println();
		}
		
		//�¼�����
		 seat[2][1] ="ȫ�浿";
		 seat[0][0] ="������";
		 
		 for(int i = 0 ; i < seat.length ; i++) {
				for(int j = 0 ; j < seat[i].length ; j++) {
					System.out.printf("[%s]",seat[i][j].equals("__")?"�¼�":"����");
				}
				System.out.println();
			}
		 
		 int row , col; //����� �� �� ���� �޾Ҵٰ� �����ϰ�
		 row=2;
		 col=1;
		 //���Ÿ� �ϰڴ� ������ �Է�....
		 if(seat[row][col].equals("__")) {
			 System.out.println("���� ������ �¼��Դϴ�");
		 }else {
			 System.out.println("�̹� ���� �Ǿ����ϴ�");
		 }
		 

	}

}
