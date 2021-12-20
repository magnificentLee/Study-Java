
public class LoopApp {

	public static void main(String[] args) {

		System.out.println(1);
//		while (true) {
//			System.out.println(2);
//			System.out.println(3);
//			break;
//		}
//		System.out.println(4);
		int i = 0;
		while (i < 3) {
			System.out.println(2);
			System.out.println(3);
			i++;
		}
		
		for (int j = 0; j < 3; j++) {
			System.out.println(5);
			System.out.println(6);
		}
		
		System.out.println(4);
	}

}
