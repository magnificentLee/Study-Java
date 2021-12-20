
public class ComparisonOperator2 {

	public static void main(String[] args) {
		
		Integer a = 1;
		Integer b = 1;
		if (a == b) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
		String c = "egoing";
		String d = "egoing";
		String f =  args[0];
		Integer g = Integer.parseInt(args[1]);
		String h = args[0];
		String x = h;
		if (c == d) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
		if (c == f) {  // 메모리 주소가 다르게 나올것임
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
		if (a == g) {  // 변환했을때는 같다고 나옴
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
		if (x == h) {
			System.out.println("Same");
		} else {
			System.out.println("Different");
		}
		if (c == x) {
			System.out.println("Same");
		} else {
			System.out.println("Different");
		}
		// 결론
		// 내부에서 선언한 변수와 외부에서 입력한 변수의 메모리 주소는 다름
		// 하지만 외부에서 입력한 변수를 내부에서 변환과정 Integer g = Integer.parseInt(args[1])을
		// 거치게 되면 메모리 주소가 동일하게 되는 것 같음
		// 단, String h = args[0]; String x = h; 이런 과정은 메모리 주소만 복사하게 되는 꼴이라
		// a 와 h(x) 의 메모리 주소는 다르게 되는 것
	}

}
