
public class BolleanApp {

	public static void main(String[] args) {
		
		System.out.println("One");  // string
		System.out.println(1);  // interger
		System.out.println(true);  // boolean type
		System.out.println(false);  // boolean type
		
		String foo = "Hello World";
		System.out.println(foo);
		
		System.out.println(foo.contains("World"));  // true
		System.out.println(foo.contains("world!"));  // false
		// contains = ���̽��� in �� ���� ����ε�
		if (foo.contains("world")) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}

}
