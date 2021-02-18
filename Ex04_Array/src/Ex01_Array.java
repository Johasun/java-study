
public class Ex01_Array {

	public static void main(String[] args) {
		//������ �迭(2����)
		//[��][��]
		//�¼� (������ �¼�) , ���� ��ǥ��(�浵,����) ,  �ٵ� , ��ȭ�� �¼�
		
		int[][] score = new int[3][2];
		System.out.println(score[0][0]); //�ʱ�ȭ�� �� ���� �ƴϰ� default 
		score[0][0] = 100;
		score[0][1] = 200;
		
		score[1][0] = 300;
		score[1][1] = 400;
		
		score[2][0] = 500;
		score[2][1] = 600;
		
		//2���� �迭�� ���� ����϶�
		//for 2��
		//���� ���� : �迭�̸�.length >> score.length
		//���� ����(���� ������ �ึ�� �ٸ� �� �ִ�) :  �迭�̸�[0].length
		
		for(int i = 0 ; i < score.length ; i++) {
			for(int j = 0 ; j < score[i].length ; j++) {
				System.out.printf("score[%d][%d]=%d\t",i,j,score[i][j]);
			}
			System.out.println();
		}
		
		int[][] score3= new int[][] {
			{11,12},
			{13,14},
			{15,16}
		};
		
		//����
		//������ for���� ���ؼ� score3 �迭�� ���� ����ϼ��� (2��)
		//for(int value : Array){}
		//�ܸӸ��� ����ؼ�
		//2���� �迭�� �׸�
		int[] arr = {10,20,30};
		for(int value : arr) {
			System.out.println(value);
		}
		//ó�� .... �ּ� (� �ּ� (�� �迭�� �ּ� ... ���� Ÿ���ϱ�)
		for(int[] col : score3) {
			for(int value : col) {
				System.out.println("�� : " + value);
			}
		}
		
		

	}

}
