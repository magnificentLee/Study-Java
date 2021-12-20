
public class AuthApp {

	public static void main(String[] args) {
		
		String id = "egoing";
		String inputId = args[0];
		
		String pass = "1111";
		String inputPass = args[1];
		
		
		System.out.println("Hi.");
		
		// if(inputId == id) {  // true 값이 나오지 않음
//		if (inputId.equals(id)) {
//			if (inputPass.equals(pass)) {
//				System.out.println("Master!");
//			} else {
//				System.out.println("Wrong password!");
//			}
//		} else {
//			System.out.println("Who are you?");
//		}
		if (inputId.equals(id) && inputPass.equals(pass)) {
				System.out.println("Master!");
		} else {
			System.out.println("Who are you?");
		}
//		조건 연산자는 &&(AND)와 ||(OR, shift + \)가 있습니다.
//
//		위와 같이 아이디와 패스워드가 모두 같은지 확인하기 위해서는 AND 연산자를 사용합니다.
//
//		&& 연산자는 전항과 후항이 모두 참일 경우에만 참을 반환하고, 아니면 거짓을 반환합니다.
//
//		|| 연산자는 전항과 후항 중 하나라도 참일 경우에 참을 반환하고, 모두 거짓일 때에만 거짓을 반환합니다.
//
//		사칙연산과 같이 && 연산자는 || 연산자보다 우선순위가 높습니다.
		
	}

}
