class Accounting {
	public double valueOfSupply; // �������� ����
	public double vatRate;
	public double expenseRate;
	// ����Ʈ �޼ҵ�
	public void print() {
		System.out.println("Value of supply : " + valueOfSupply);  // ���ް�
		System.out.println("VAT : " + getVAT());  // �ΰ���ġ�� 10%
		System.out.println("Total : " + getTotal()); // �հ�=���ް�+�ΰ���ġ��
		System.out.println("Expense : " + getExpense());  // ���
		System.out.println("Income : " + getIncome());  // ����
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
	// �޼ҵ� getVAT�� ������ִ� �ڵ�(�ڵ�)
	public double getVAT() {
		return valueOfSupply * vatRate;
	}

}

public class AccountingClassApp {
	public static void main(String[] args) {
		// �޼ҵ�� ���� ������ �ڵ带 �׷����ؼ� �̸��� ���� ���������� ���ڴ�
		// �Ʒ� �������� main �޼ҵ� �ȿ����� ��밡��(main{})
		// Accountingmethodapp Ŭ������ ���������� �����ϸ� ��� �޼ҵ忡�� ���� ����
		//Accounting.valueOfSupply = 10000.0;
		//Accounting.vatRate = 0.1;
		//Accounting.expenseRate = 0.3;
		//Accounting.print();
		// �ν��Ͻ� : �ϳ��� Ŭ������ �����ؼ� ���� �ٸ� �������� ���� ���� ���� �޼ҵ带 ���� �������� ����� ��
		// ... ������ ���� �޼ҵ带 ȣ���Ѵٰ� ��������
		//Accounting.valueOfSupply = 20000.0;
		//Accounting.vatRate = 0.05;
		//Accounting.expenseRate = 0.2;
		//Accounting.print();
		// .. �̷� ����(Ŭ������ ���θ� �ٲٴ� ����)�� ����ϰ� �Ͼ�ٸ� ���װ� �߻��� Ȯ���� ������ ����
		// �Ʒ��� �̷��� ������ �����ϱ� ���� �ν��Ͻ�(�޼ҵ�� ������ ������ ���� �ٸ� Ŭ���� ������)�� ����� ����
		//Accounting1.valueOfSupply = 10000.0;
		//Accounting1.vatRate = 0.1;
		//Accounting1.expenseRate = 0.3;
		//Accounting1.print();
		
		//Accounting2.valueOfSupply = 20000.0;
		//Accounting2.vatRate = 0.05;
		//Accounting2.expenseRate = 0.2;
		//Accounting2.print();
		// ������ �̷��� �ϸ� Ŭ������ �����Ҷ����� �������� ������ �������ϱ� ������ ���ŷӰ� ���� ����
		// �ڹٴ� �ڵ����� �������ִ� ����� ����
		
		// ������ �ν��Ͻ� = Accounting�� ����, static�� ����ϸ� �� ��
		Accounting a1 = new Accounting(); // Accounting Ŭ������ �����ϴ� ���
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
