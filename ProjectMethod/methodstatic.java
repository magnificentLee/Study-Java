class Print{
	public String delimiter;
	public void a() {
		System.out.println(this.delimiter);
		System.out.println("a");
		System.out.println("a");
	}
	public void b() {
		System.out.println(this.delimiter);
		System.out.println("b");
		System.out.println("b");
	}
	public static void c(String delimiter) {  // 인스턴스t1 소속이 아니기 때문에 delimiter 값을 넣어줘야함
		System.out.println(delimiter);
		System.out.println("c");
		System.out.println("c");
	}
}

public class methodstatic {
	
	public static void main(String[] args) {
//		Print.a("-");
//		Print.b("-");
		// 굉장히 많은 숫자를 반복해야 되는 경우
		// 인스턴스 t1
		Print t1 = new Print();  // 메소드가 인스턴스 소속일 때는 static을 빼야됨 (위 참고)
		// 반대로 메소드가 클래스 소속일 때는 static을 넣어줘야됨
		t1.delimiter = "-";  // 복제한 Print 클래스(인스턴스)의 매개변수값을 "-"로 지정
		t1.a();  // 추가로 입력해줄 필요가 없어짐
		t1.b();
		
		Print.c("&");  // 인스턴스 소속이 아니기때문에 static, 인자값을 넣어줘야함
//		Print.a("*");
//		Print.b("*");
	}

}
