
public class LogicalOperatorApp {

	public static void main(String[] args) {
		// and
		System.out.println(1 == 1);
		System.out.println(true && true);  // true
		System.out.println(true && false);  // false
		System.out.println(false && true);  // false
		System.out.println(false && false);  // false
		
		// or
		System.out.println(true || true);  // true
		System.out.println(true || false);  // true
		System.out.println(false || true);  // true
		System.out.println(false || false);  // false
		
		//not
		System.out.println(!true);  // false
		System.out.println(!false);  // true
	}

}
