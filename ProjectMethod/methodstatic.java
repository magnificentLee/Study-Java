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
	public static void c(String delimiter) {  // �ν��Ͻ�t1 �Ҽ��� �ƴϱ� ������ delimiter ���� �־������
		System.out.println(delimiter);
		System.out.println("c");
		System.out.println("c");
	}
}

public class methodstatic {
	
	public static void main(String[] args) {
//		Print.a("-");
//		Print.b("-");
		// ������ ���� ���ڸ� �ݺ��ؾ� �Ǵ� ���
		// �ν��Ͻ� t1
		Print t1 = new Print();  // �޼ҵ尡 �ν��Ͻ� �Ҽ��� ���� static�� ���ߵ� (�� ����)
		// �ݴ�� �޼ҵ尡 Ŭ���� �Ҽ��� ���� static�� �־���ߵ�
		t1.delimiter = "-";  // ������ Print Ŭ����(�ν��Ͻ�)�� �Ű��������� "-"�� ����
		t1.a();  // �߰��� �Է����� �ʿ䰡 ������
		t1.b();
		
		Print.c("&");  // �ν��Ͻ� �Ҽ��� �ƴϱ⶧���� static, ���ڰ��� �־������
//		Print.a("*");
//		Print.b("*");
	}

}
