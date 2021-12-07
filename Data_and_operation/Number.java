
public class Number {

	public static void main(String[] args) {
		// 사칙연산
		System.out.println(6 + 2);
		System.out.println(6 - 2);
		System.out.println(6 * 2);
		System.out.println(6 / 2);  // 3, 기본적으로 정수형태로 출력
		// 형변환
		System.out.println((float)(6 / 2));  // 정수 to 실수
		System.out.println((int)(3.00));  // 실수 to 정수
		// Math 함수
		System.out.println(Math.PI);  // 3.1415926....
		System.out.println(Math.floor(Math.PI));  // 내림 3.0
		System.out.println(Math.ceil(Math.PI));  // 올림 4.0
	}

}
