
public class AccountingIFApp {

	public static void main(String[] args) {
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply * vatRate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;
		
		double dividend1;
		double dividend2;
		double dividend3;
		
		if (income > 10000.0) {
			dividend1 = income * 0.5;
			dividend2 = income * 0.3;
			dividend3 = income * 0.2;
		}
		else {
			dividend1 = income * 1.0;
			dividend2 = income * 0;
			dividend3 = income * 0;
		}
		System.out.println("Value of supply : " + valueOfSupply);  // 공급가
		System.out.println("VAT : " + vat);  // 부가가치세 10%
		System.out.println("Total : " + total); // 합계=공급가+부가가치세
		System.out.println("Expense : " + expense);  // 비용
		System.out.println("Income : " + income);  // 수익
		System.out.println("Dividend 1 : " + dividend1); // 배당 5:3:@
		System.out.println("Dividend 2 : " + dividend2);
		System.out.println("Dividend 3 : " + dividend3);

	}

}
