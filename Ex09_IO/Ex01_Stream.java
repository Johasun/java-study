import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/*
 Stream  �߰� �Ű�ü(������ ���) default : Byte

 JAVA API
 [�߻� Ŭ����]
 InputStream , OutPutStream
 
 ����� [���] �ΰ��� �߻�Ŭ���� ��� ������ ����ض�
 
 1. Memory : ByteArray...  , ByteArray...
 2. File   : File...       , File...    ^^(���)

*/
public class Ex01_Stream {
	public static void main(String[] args) {
		//byte(-128~127) ������ �����ϴ� ������ Ÿ��
		byte[] inSrc = {0,1,2,3,4,5,6,7,8};
		byte[] outSrc =null; //���� �޸𸮸� ������ ���� �ʴ�(�ʱ�ȭ)
		
		//�����͸�  read , write  ��� memory
		ByteArrayInputStream input =null;
		ByteArrayOutputStream output = null;
		
		input = new ByteArrayInputStream(inSrc); //inSrc �迭(�޸�) >> read
		output = new ByteArrayOutputStream(); //write
		
		System.out.println("ourSrc before : " + Arrays.toString(outSrc));
		
		//���İ��� ���� 
		int data=0;
		while((data =input.read()) != -1) {  //���̻� read data ������  -1
			 System.out.println("data : " + data);
			//System.out.println(input.read()); //read() �Լ��� ���������� next()
			//read �� �����͸� �ٸ� �޸� write
			 output.write(data);
			 //write ����� data �� �ƴϰ� 
			 //ByteArrayOutputStream �ڽ��� ��� data ������
		}
		
		System.out.println(output.toByteArray()); //������ �ִ� ���� �ּ�
		
		outSrc = output.toByteArray();
		
		System.out.println("ourSrc after : " + Arrays.toString(outSrc));

	}

}
