
public class AccountingArrayApp {

	public static void main(String[] args) {
		// 입력받는 값은 : string[] args, 즉 문자열 형태이기 때문에 변환이 필요함
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply * vatRate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;
		
		// double형 데이터로 이루어진 배열, double형 데이터를 3개 수납가능
		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		double dividend1 = income * dividendRates[0];
		double dividend2 = income * dividendRates[1];
		double dividend3 = income * dividendRates[2];
		
		
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