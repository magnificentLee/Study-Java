
public class AuthApp {

	public static void main(String[] args) {
		
		String id = "egoing";
		String inputId = args[0];
		
		String pass = "1111";
		String inputPass = args[1];
		
		
		System.out.println("Hi.");
		
		// if(inputId == id) {  // true ���� ������ ����
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
//		���� �����ڴ� &&(AND)�� ||(OR, shift + \)�� �ֽ��ϴ�.
//
//		���� ���� ���̵�� �н����尡 ��� ������ Ȯ���ϱ� ���ؼ��� AND �����ڸ� ����մϴ�.
//
//		&& �����ڴ� ���װ� ������ ��� ���� ��쿡�� ���� ��ȯ�ϰ�, �ƴϸ� ������ ��ȯ�մϴ�.
//
//		|| �����ڴ� ���װ� ���� �� �ϳ��� ���� ��쿡 ���� ��ȯ�ϰ�, ��� ������ ������ ������ ��ȯ�մϴ�.
//
//		��Ģ����� ���� && �����ڴ� || �����ں��� �켱������ �����ϴ�.
		
	}

}
