import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Set;
import java.util.TreeSet;

//today ���� (Lotto �Է� ���(read , write) �߰� ��������

public class Hw01_Lotto {
	public static void main(String[] args) {
		
		Set<Integer> lotto = new TreeSet<Integer>();
		for(int i = 0; lotto.size()<6; i++) {
			lotto.add((int)(Math.random()*45)+1);
		}
		
		String s = lotto.toString();
		
		//����
		try {
			File file = new File("lottolist.txt");
			BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
			
			bw.write(s+"\n");
			bw.close();
			
			
		} catch (Exception e) {
			System.out.println(e);
		} 
		
		//�б�
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("lottolist.txt");
			br = new BufferedReader(fr);
			
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
