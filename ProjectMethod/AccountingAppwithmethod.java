
public class AccountingAppwithmethod {
	// ���ް���
	public static double valueOfSupply = 10000.0;  // ������������
	// �ΰ���ġ���� %
	public static double vatRate = 0.1;
	// �ΰ��� = ���ް��� * �ΰ���ġ����
	public static double getVAT() {
		return valueOfSupply * vatRate;
	}
	// �հ� = ���ް��� * �ΰ���
	public static double getTotal() {
		return valueOfSupply * getVAT();
	}
	public static void main(String[] args) {
		
		System.out.println("Value of supply : " + getTotal());
		System.out.println("VAT : " + getVAT());
		System.out.println("Total : " + getTotal());

	}

}
