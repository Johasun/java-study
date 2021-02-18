import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class Lotto{
	
	private Set<Integer> lotto; //�ζ�
	private String lottoNumber; 
	private int extractNum; //�ζ� ���� Ƚ��
	
	/////////////////
	private File file;
	private BufferedWriter bw;
	private FileReader fr;
	private BufferedReader br;
	private Iterator it;
	private Date date;
	/////////////////
	
	Lotto() {
		file = new File("lottolist.txt");
		date = new Date();
	}
	
	//�ζ� ��ȣ �̱�
	public void extractLottoNumber() {
		
		System.out.println("�١١ڡڡڡڨ������ڡڡڡڡ١�");
		System.out.println("�ڡڷζ� ��ȣ�� �����մϴ�!�ڡ�");
		System.out.println("�١١ڡڡڡڨ������ڡڡڡڡ١�");
		
		
		///////////////�ζ� ��ȣ �̱�///////////////
		lotto = new TreeSet<Integer>();
		for(int i = 0; lotto.size()<6; i++) {
			lotto.add((int)(Math.random()*45)+1);
		}
		
		lottoNumber = lotto.toString(); // �ζ� �� String���� ��� �����ϴ� �Լ� ȣ��
		extractNum++; //ȸ�� �ø���
		writeLottoNumber(); // ���Ͽ� �ζ� ��ȣ�� ����
		
		///////////////�ζ� ��ȣ ���///////////////
		it = lotto.iterator();
		for(int i = 0; i<lotto.size(); i++) {
			System.out.printf("%d��° �ζ� ��ȣ: [%d]\n", (i+1), it.next());
		}
		
	}
	
	//�ζ� ��ȣ ����
	public void writeLottoNumber() {
		try {
			bw = new BufferedWriter(new FileWriter(file, true));
			SimpleDateFormat sdf = new SimpleDateFormat //�ð� �̴´ܰ�
								  ("[yyyy�� MM�� dd�� HH:mm]\n");
			
			bw.write("�١�"+extractNum+"ȸ�� �ζ� ��ȣ�١�\n");
			bw.write("���� �ð�: "+sdf.format(date));
			bw.write("�ζ� ��ȣ: "+lottoNumber+"\n");

			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				bw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	//�ζ� ��ȣ �б�
	public void readLottoNumber() {
		try {
			// file�� �������
			if(file.length()==0) {
				System.out.println("�ζ� ���α׷��� ������� �ʾҽ��ϴ�!^^");
				return;
			}
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			//�д� �ܰ�
			String line = "";
			for(int i = 0; (line = br.readLine()) != null; i++) {
				System.out.println(line);
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				fr.close();
				br.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}

public class Hw01_Lotto2 {
	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		lotto.readLottoNumber();
		lotto.extractLottoNumber();
		lotto.extractLottoNumber();
		lotto.extractLottoNumber();
		lotto.extractLottoNumber();
		lotto.extractLottoNumber();
		lotto.extractLottoNumber();
		lotto.readLottoNumber();
	}
}