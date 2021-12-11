
public class AccountingMethodApp {
	public static double valueOfSupply; // 전역변수 선언
	public static double vatRate;
	public static double expenseRate;
	public static void main(String[] args) {
		// 메소드는 서로 연관된 코드를 그룹핑해서 이름을 붙인 정리정돈의 상자다
		// 아래 변수들은 main 메소드 안에서만 사용가능(main{})
		// Accountingmethodapp 클래스의 전역변수로 선언하면 모든 메소드에서 접근 가능
		valueOfSupply = 10000.0;
		vatRate = 0.1;
		expenseRate = 0.3;
		
		print();
	}
	// 프린트 메소드
	public static void print() {
		System.out.println("Value of supply : " + valueOfSupply);  // 공급가
		System.out.println("VAT : " + getVAT());  // 부가가치세 10%
		System.out.println("Total : " + getTotal()); // 합계=공급가+부가가치세
		System.out.println("Expense : " + getExpense());  // 비용
		System.out.println("Income : " + getIncome());  // 수익
		System.out.println("Dividend 1 " + getDividend1());
		System.out.println("Dividend 2 " + getDividend2());
		System.out.println("Dividend 3 " + getDividend3());
	}
	public static double getDividend1() {
		return getIncome() * 0.5;
	}
	public static double getDividend2() {
		return getIncome() * 0.3;
	}
	public static double getDividend3() {
		return getIncome() * 0.2;
	}
	public static double getIncome() {
		return valueOfSupply - getExpense();
	}
	public static double getExpense() {
		return valueOfSupply * expenseRate;
	}
	public static double getTotal() {
		return valueOfSupply + getVAT();
	}
	// 메소드 getVAT를 만들어주는 코드(자동)
	public static double getVAT() {
		return valueOfSupply * vatRate;
	}

}
