
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
		if (c == f) {  // �޸� �ּҰ� �ٸ��� ���ð���
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
		if (a == g) {  // ��ȯ�������� ���ٰ� ����
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
		// ���
		// ���ο��� ������ ������ �ܺο��� �Է��� ������ �޸� �ּҴ� �ٸ�
		// ������ �ܺο��� �Է��� ������ ���ο��� ��ȯ���� Integer g = Integer.parseInt(args[1])��
		// ��ġ�� �Ǹ� �޸� �ּҰ� �����ϰ� �Ǵ� �� ����
		// ��, String h = args[0]; String x = h; �̷� ������ �޸� �ּҸ� �����ϰ� �Ǵ� ���̶�
		// a �� h(x) �� �޸� �ּҴ� �ٸ��� �Ǵ� ��
	}

}
