
public class method2why4 {

	public static void main(String[] args) {
		
		// 입력값마다 메소드를 만들 수는 없기 때문에 하나로 통일해줌
		            //인자, argument : 메소드의 매개변수에 넣게 되는 실제 데이터
		printTwoTimes("a", "-");
		printTwoTimes("a", "*");
		printTwoTimes("b", "&");
		printTwoTimes("a", "!");

	}
                                     //매개변수, parameter : 메소드 안에서 통용되는 변수
	public static void printTwoTimes(String text, String delimiter) {
		System.out.println(delimiter);
		System.out.println(text);
		System.out.println(text);
	}

}
