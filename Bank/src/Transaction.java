
public class Transaction {
	String transactionDate; //�ŷ���
	String transactionTime; //�ŷ��ð�
	String kind; //���� (�Ա� �Ǵ� ���)
	long amount; //�ŷ��ݾ�
	long balance; //�ܰ�
	
	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getTransactionTime() {
		return transactionTime;
	}

	public void setTransactionTime(String transactionTime) {
		this.transactionTime = transactionTime;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	/*
	public Transaction(String transactionDate, String transactionTime, String kind, long amount, long balance) {
		this.transactionDate = transactionDate;
		this.transactionTime = transactionTime;
		this.kind = kind;
		this.amount = amount;
		this.balance = balance;
	}
	*/
	@Override
	public String toString() {
		return "[�ŷ��ݾ�:"+amount+",�� �ܾ�:"+balance+"�� �ŷ��ð�: "+transactionDate+transactionTime+"]";
	}
	
	
	
	
}
