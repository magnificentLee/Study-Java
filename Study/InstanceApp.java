import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class InstanceApp {

	public static void main(String[] args) throws FileNotFoundException {
		// 실행후 자바프로젝트 새로고침하면 나옴
		PrintWriter p1 = new PrintWriter("result1.txt");
		p1.write("Hello 1");
		p1.close();
		
		PrintWriter p2 = new PrintWriter("result2.txt");
		p2.write("Hello 2");
		p2.close();
		System.out.println(p1.toString());
		p2.toString();
		p2.write("hello 2");
		
		//PrintWriter.write("result1.txt", "Hello 1");
		// 상속이란 부모 클래스에 있는 메소드나 변수를 자식 클래스가 사용할 수 있다. 
		// 상속을 통해서 같은 기능을 하는 메소드를 만들 필요가 없어진다( 코드의 재활용성)
		// 또한 메소드를 고쳐서 사용할 수 있다.( 오버라이드) 

	}

}
