package kr.or.bit;

public class Emp { // extends Object
	private int empno;
	private String ename;
	
	//������
	public Emp(int empno, String ename) {
		this.empno = empno;
		this.ename = ename;
	}
	
	//getter
	public int getEmpno() {
		return empno;
	}

	//setter
	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
	
	//Object ������ ������
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + "]";
	}
	
	//Object toString() �׷��� ���ϸ� �̰� ������ �ؼ� ��
	//������ ..... member field ���� ......
	
	
	
	
	
	
}
