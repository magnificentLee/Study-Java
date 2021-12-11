
public class AccountingApp {

	public static void main(String[] args) {
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply * vatRate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;
		double dividened1 = income * 0.5;
		double dividened2 = income * 0.3;
		double dividened3 = income * 0.2;
		
		System.out.println("Value of supply : " + valueOfSupply);  // 공급가
		System.out.println("VAT : " + vat);  // 부가가치세 10%
		System.out.println("Total : " + total); // 합계=공급가+부가가치세
		System.out.println("Expense : " + expense);  // 비용
		System.out.println("Income : " + income);  // 수익
		System.out.println("Divdiend 1 : " + dividened1); // 배당 5:3:@
		System.out.println("Divdiend 2 : " + dividened2);
		System.out.println("Divdiend 3 : " + dividened3);
		// Edit - Find/Replace로 숫자 전부 변경 가능
	}

}
