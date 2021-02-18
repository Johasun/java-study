
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Account {
	private String accountNo; // ���¹�ȣ
	private String name;  // �����ڸ�
	private long balance ; // �ܰ�
	private ArrayList<Transaction> transaction; //�ŷ�����(0���̻�)

	
	/////////// getter //////////
	public String getAccountNo() {
		return accountNo;
	}

	public String getName() {
		return name;
	}

	////////// ������ //////////
	public Account(String accountNo, String name) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = 0;
		transaction = new ArrayList<Transaction>();
	}

	@Override
	public String toString() {
		return "[���¹�ȣ :"+this.accountNo+", ������ �� : "+this.name+", �ܾ� : "+this.balance+"��]";
	}


	////////// method /////////
	
	//�Ա��Ѵ�
	public void deposit(long amount) {
		this.balance+=amount;	//amount ���� �ܰ��� �־��ش�
		System.out.println(amount+"���� �Ա��Ͽ����ϴ�.");
		System.out.println("�����ܾ��� "+this.balance+"�� �Դϴ�.");
		setDate("�Ա�", amount);
	}
	
	//����Ѵ�
	public void withdraw(long amount) {
		if(this.balance<amount) { // �ܰ��� ����Ϸ��� �ݾ׺��� ������	
			System.out.println("�ܾ��� �����մϴ�. �����ܾ�: "+this.balance);
			return;
		} else { //amount ���� �ܰ����� ������
			this.balance-=amount;
			System.out.println(amount+"���� �����Ͽ����ϴ�");
			System.out.println("�����ܾ��� "+this.balance+"�� �Դϴ�.");
		}
		setDate("���", amount);
	}
	
	//�ŷ������� �����ϴ� �ܰ�
	private void setDate(String kind, long amount) {
		Transaction t = new Transaction();
		
		Date date = new Date();
		SimpleDateFormat sdfDay = new SimpleDateFormat("yyyy��MM��dd��");
		SimpleDateFormat sdfTime = new SimpleDateFormat("HH��mm��");
		
		t.setAmount(amount);
		t.setBalance(balance);
		t.setKind(kind);
		t.setTransactionDate(sdfDay.format(date));
		t.setTransactionTime(sdfTime.format(date));
		transaction.add(t);
		
		//transaction.add(new Transaction(sdfDay.format(date),sdfTime.format(date), kind, amount, this.balance));
	}
		
	//�ܰ��� Ȯ���Ѵ�
	public long getBalance() {
		return this.balance;
	}
	
	//�ŷ������� ����
	public void Transactions() {
		System.out.println("= �ŷ����� =");
		for(Transaction t : transaction) {
			System.out.println(t);
		}
	}
	
}