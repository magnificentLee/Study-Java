
public class method2why2 {
	public static void printTwoTimesA() {
		// �޼ҵ带 �̿��Ͽ� �ڵ带 �����ϴ� ���
		System.out.println("-");
		System.out.println("a");
		System.out.println("a");
	}
	
	public static void main(String[] args) {
		
		// 100000000
		printTwoTimesA();
		// 100000000
		printTwoTimesA();
		// 100000000
		printTwoTimesA();
		
		printTwoTimesB();
		// Ư�� �ڵ�� ���콺�� ��Ƽ� ��Ŭ�� - refactor - extractmethod - �ս��� �޼ҵ�ȭ ����
	}

	public static void printTwoTimesB() {
		System.out.println("-");
		System.out.println("b");
		System.out.println("b");
	}

}
