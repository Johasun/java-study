package kr.or.bit;

public class Emp { // extends Object
	private int empno;
	private String ename;
	
	//생성자
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
	
	
	//Object 가지는 재정의
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + "]";
	}
	
	//Object toString() 그런데 원하면 이거 재정의 해서 써
	//개발자 ..... member field 검증 ......
	
	
	
	
	
	
}
