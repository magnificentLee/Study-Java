
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
		
		System.out.println("Value of supply : " + valueOfSupply);  // ���ް�
		System.out.println("VAT : " + vat);  // �ΰ���ġ�� 10%
		System.out.println("Total : " + total); // �հ�=���ް�+�ΰ���ġ��
		System.out.println("Expense : " + expense);  // ���
		System.out.println("Income : " + income);  // ����
		System.out.println("Divdiend 1 : " + dividened1); // ��� 5:3:@
		System.out.println("Divdiend 2 : " + dividened2);
		System.out.println("Divdiend 3 : " + dividened3);
		// Edit - Find/Replace�� ���� ���� ���� ����
	}

}
