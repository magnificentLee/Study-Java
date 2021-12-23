
public class method2why2 {
	public static void printTwoTimesA() {
		// 메소드를 이용하여 코드를 재사용하는 방법
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
		// 특정 코드들 마우스로 모아서 우클릭 - refactor - extractmethod - 손쉽게 메소드화 가능
	}

	public static void printTwoTimesB() {
		System.out.println("-");
		System.out.println("b");
		System.out.println("b");
	}

}
