
public class method2why4 {

	public static void main(String[] args) {
		
		// �Է°����� �޼ҵ带 ���� ���� ���� ������ �ϳ��� ��������
		            //����, argument : �޼ҵ��� �Ű������� �ְ� �Ǵ� ���� ������
		printTwoTimes("a", "-");
		printTwoTimes("a", "*");
		printTwoTimes("b", "&");
		printTwoTimes("a", "!");

	}
                                     //�Ű�����, parameter : �޼ҵ� �ȿ��� ���Ǵ� ����
	public static void printTwoTimes(String text, String delimiter) {
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}

}
