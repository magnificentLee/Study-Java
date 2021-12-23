
public class AccountingAppwithmethod {
	// 공급가액
	public static double valueOfSupply = 10000.0;  // 전역변수선언
	// 부가가치세율 %
	public static double vatRate = 0.1;
	// 부가세 = 공급가액 * 부가가치세율
	public static double getVAT() {
		return valueOfSupply * vatRate;
	}
	// 합계 = 공급가액 * 부가세
	public static double getTotal() {
		return valueOfSupply * getVAT();
	}
	public static void main(String[] args) {
		
		System.out.println("Value of supply : " + getTotal());
		System.out.println("VAT : " + getVAT());
		System.out.println("Total : " + getTotal());

	}

}
