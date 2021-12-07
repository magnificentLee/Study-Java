
public class Casting {

	public static void main(String[] args) {
		double a = 1.1;  // 1.1
		double b = 1;  // 1.0
		double b2 = (double) 1;  // double b 와 동일
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(b2);
		
		// int c = 1.1;
		double d= 1.1;
		System.out.println(d);
		// 1 to String
		String f = Integer.toString(1);  // 정수를 문자열로
		System.out.println(f.getClass());

	}

}
