class Accounting {
	public double valueOfSupply; // 전역변수 선언
	public double vatRate;
	public double expenseRate;
	// 프린트 메소드
	public void print() {
		System.out.println("Value of supply : " + valueOfSupply);  // 공급가
		System.out.println("VAT : " + getVAT());  // 부가가치세 10%
		System.out.println("Total : " + getTotal()); // 합계=공급가+부가가치세
		System.out.println("Expense : " + getExpense());  // 비용
		System.out.println("Income : " + getIncome());  // 수익
		System.out.println("Dividend 1 " + getDividend1());
		System.out.println("Dividend 2 " + getDividend2());
		System.out.println("Dividend 3 " + getDividend3());
	}
	public double getDividend1() {
		return getIncome() * 0.5;
	}
	public double getDividend2() {
		return getIncome() * 0.3;
	}
	public double getDividend3() {
		return getIncome() * 0.2;
	}
	public double getIncome() {
		return valueOfSupply - getExpense();
	}
	public double getExpense() {
		return valueOfSupply * expenseRate;
	}
	public double getTotal() {
		return valueOfSupply + getVAT();
	}
	// 메소드 getVAT를 만들어주는 코드(자동)
	public double getVAT() {
		return valueOfSupply * vatRate;
	}

}

public class AccountingClassApp {
	public static void main(String[] args) {
		// 메소드는 서로 연관된 코드를 그룹핑해서 이름을 붙인 정리정돈의 상자다
		// 아래 변수들은 main 메소드 안에서만 사용가능(main{})
		// Accountingmethodapp 클래스의 전역변수로 선언하면 모든 메소드에서 접근 가능
		//Accounting.valueOfSupply = 10000.0;
		//Accounting.vatRate = 0.1;
		//Accounting.expenseRate = 0.3;
		//Accounting.print();
		// 인스턴스 : 하나의 클래스를 복제해서 서로 다른 데이터의 값과 서로 같은 메소드를 가진 복제본을 만드는 것
		// ... 수없이 많은 메소드를 호출한다고 생각하자
		//Accounting.valueOfSupply = 20000.0;
		//Accounting.vatRate = 0.05;
		//Accounting.expenseRate = 0.2;
		//Accounting.print();
		// .. 이런 과정(클래스의 내부를 바꾸는 과정)이 빈번하게 일어난다면 버그가 발생할 확률이 굉장히 높음
		// 아래는 이러한 에러를 방지하기 위한 인스턴스(메소드는 같지만 데이터 값이 다른 클래스 본제본)를 만드는 과정
		//Accounting1.valueOfSupply = 10000.0;
		//Accounting1.vatRate = 0.1;
		//Accounting1.expenseRate = 0.3;
		//Accounting1.print();
		
		//Accounting2.valueOfSupply = 20000.0;
		//Accounting2.vatRate = 0.05;
		//Accounting2.expenseRate = 0.2;
		//Accounting2.print();
		// 하지만 이렇게 하면 클래스를 생성할때마다 복제본을 일일히 만들어야하기 때문에 번거롭고 좋지 않음
		// 자바는 자동으로 복제해주는 기능이 있음
		
		// 왼쪽은 인스턴스 = Accounting의 복제, static을 사용하면 안 됨
		Accounting a1 = new Accounting(); // Accounting 클래스를 복제하는 기능
		a1.valueOfSupply = 10000.0;
		a1.vatRate = 0.1;
		a1.expenseRate = 0.3;
		a1.print();
		
		Accounting a2 = new Accounting();
		a2.valueOfSupply = 20000.0;
		a2.vatRate = 0.05;
		a2.expenseRate = 0.2;
		a2.print();
		
		a1.print();
		
	}
}
