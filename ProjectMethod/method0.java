import java.io.FileWriter;
import java.io.IOException;

public class method0 {

	public static void main(String[] args) throws IOException {
		
		printTwoTimes("a", "-");
		// 위 아래는 동일한 기능, 아래는 메소드를 이용해 값만 도출(출력X)하기 때문에 다른곳에서도 써먹을 수 있음
		System.out.println(twoTimes("a", "-"));
		
		// 100000000 다른 코드 추가
//		writeFileTwoTimes("a", "*");
		FileWriter fw = new FileWriter("out.txt");
		fw.write(twoTimes("a", "*"));
		fw.close();
		printTwoTimes("a", "&");
		// 아래는 실제 동작하는 코드는 아님
//		Email.send("egoing@gmail.com", "two times a", twoTimes("a", "&"));
		

	}
	public static void printTwoTimes(String text, String delimiter) {
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}
	public static String twoTimes(String text, String delimiter) {
		String out = "";
		out = out + delimiter + "\n";
		out = out + text + "\n";
		out = out + text + "\n";
		return out;
	}
	
//	public static void writeFileTwoTimes(String text, String delimiter) throws IOException {
//		FileWriter fw = new FileWriter("output.txt");
//		fw.write(delimiter+"\n");
//		fw.write(text+"\n");
//		fw.write(text+"\n");
//		fw.close();
//	}
	
	
}
