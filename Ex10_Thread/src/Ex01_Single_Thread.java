/*
���α׷� >> ���� >> ���μ��� >> �ּ� �ϳ��� ������(stack) >> JVM �ϳ��� main thread(stack) ����
���ݱ��� : �̱� ���μ��� >> �̱� ������ (stack 1��) >> main �Լ��� �ö󰡼� ����

JVM > call stack > main �Լ� ����

stack �ѹ��� 1���� �Լ��� ���� ���� (10�� �Լ��� �ִ��� ���ÿ� ������ �ƴ϶� ���������� 1����)

**************************
* ���ݱ��� �ϳ��� stack �� ��� *
**************************
*/
public class Ex01_Single_Thread {
	public static void main(String[] args) {
		System.out.println("�� main �Լ� �ϲ��̾�");
		worker();
		worker2();
		System.out.println("main ����");
	}
	static void worker() {
		System.out.println("�� 1�� �ϲ��̾�");
	}
	static void worker2() {
		System.out.println("�� 2�� �ϲ��̾�");
	}
}
