import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {
	
	public static void main(String[] args) throws IOException {
//		Ŭ���� ��ü�� �̿��ϴ� Math Ŭ����
		System.out.println(Math.PI);
		System.out.println(Math.floor(1.8));
		System.out.println(Math.ceil(1.8));
//		�ν��Ͻ��� �����Ͽ� ����ϴ� FileWriter Ŭ����
		FileWriter f1 = new FileWriter("datatest.txt");
		f1.write("Hello");
		f1.write(" Java");
		f1.close();
		
		
	}

}
