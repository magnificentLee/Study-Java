import java.io.FileWriter;
import java.io.IOException;

public class method0 {

	public static void main(String[] args) throws IOException {
		
		printTwoTimes("a", "-");
		// �� �Ʒ��� ������ ���, �Ʒ��� �޼ҵ带 �̿��� ���� ����(���X)�ϱ� ������ �ٸ��������� ����� �� ����
		System.out.println(twoTimes("a", "-"));
		
		// 100000000 �ٸ� �ڵ� �߰�
//		writeFileTwoTimes("a", "*");
		FileWriter fw = new FileWriter("out.txt");
		fw.write(twoTimes("a", "*"));
		fw.close();
		printTwoTimes("a", "&");
		// �Ʒ��� ���� �����ϴ� �ڵ�� �ƴ�
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
