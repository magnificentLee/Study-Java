import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {
	
	public static void main(String[] args) throws IOException {
//		클래스 자체로 이용하는 Math 클래스
		System.out.println(Math.PI);
		System.out.println(Math.floor(1.8));
		System.out.println(Math.ceil(1.8));
//		인스턴스를 생성하여 사용하는 FileWriter 클래스
		FileWriter f1 = new FileWriter("datatest.txt");
		f1.write("Hello");
		f1.write(" Java");
		f1.close();
		
		
	}

}
