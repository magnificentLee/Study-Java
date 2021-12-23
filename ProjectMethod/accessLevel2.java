import java.io.IOError;
import java.io.IOException;

class Greeting {
	private static void hi() {
		System.out.println("Hi");
	}
}


public class accessLevel2 {

	public static void main(String[] args) throws IOException{
		
//		Greeting.hi();
		// 다른 클래스의 private 메소드는 가져올 수 없음 따라서 에러가 발생함
	}

}
