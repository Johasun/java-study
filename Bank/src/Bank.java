import java.util.ArrayList;
import java.util.Iterator;


public class Bank {
	private ArrayList<Account> accounts; // ��������
	private int totalAccount; //�Ѱ��¼�
	
	
	////// getter ////////

	public ArrayList<Account> getAccounts() {
		return accounts;
	}
	
	////// ������ /////////
	Bank(){
		accounts = new ArrayList<Account>();
	}
	
	
	////// method ///////
	//���¸� �����Ѵ�
	public void addAccount(String accountNo, String name) {
		accounts.add(new Account(accountNo, name)); //���� ����
		totalAccount++; //���¼� ����
	}
	
	//���¸� ã�´�(���¹�ȣ��)
	public Account getAccount(String accountNo) {
		for(Account act : accounts) {
			if(act.getAccountNo().equals(accountNo)) {
				System.out.println("= �ش� ���¹�ȣ�� �������� =");
				System.out.println(act);
				return act;
			}
		}
		System.out.println("���¹�ȣ�� �ùٸ��� �ʽ��ϴ�.");
		return null;
	}
	
	//���¸� ã�´�(�����ڸ�����)
	public void findAccounts(String username) {
		int count=0;
		System.out.println("= �ش� �����ڸ��� ���� ��� =");
		for(Account act : accounts) {
			if(act.getName().equals(username)) {
				System.out.println(act);
				count++;
			}
		}
		if(count==0) {
			System.out.println("�Է��Ͻ� �����ڸ��� ���°� �������� �ʽ��ϴ�.");
		}
	}
	
	//���¸���� ����
	public void accountList() {
		System.out.println("= ��ü ���� ��� =");
		for(Account act : accounts) {
			System.out.println(act);
		}
	}
	
	//�Ѱ��¼��� ��ȯ�Ѵ�
	public void TotalAccount() {
		System.out.println("��ü ���� �� : "+totalAccount);
	}
}
