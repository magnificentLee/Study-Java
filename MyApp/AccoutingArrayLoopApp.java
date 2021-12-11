
public class AccoutingArrayLoopApp {

	public static void main(String[] args) {
		// �Է¹޴� ���� : string[] args, �� ���ڿ� �����̱� ������ ��ȯ�� �ʿ���
		double valueOfSupply = Double.parseDouble(args[0]);
		double vatRate = 0.1;
		double expenseRate = 0.3;
		double vat = valueOfSupply * vatRate;
		double total = valueOfSupply + vat;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;
		
		// double�� �����ͷ� �̷���� �迭, double�� �����͸� 3�� ��������
		double[] dividendRates = new double[3];
		dividendRates[0] = 0.5;
		dividendRates[1] = 0.3;
		dividendRates[2] = 0.2;
		
		System.out.println("Value of supply : " + valueOfSupply);  // ���ް�
		System.out.println("VAT : " + vat);  // �ΰ���ġ�� 10%
		System.out.println("Total : " + total); // �հ�=���ް�+�ΰ���ġ��
		System.out.println("Expense : " + expense);  // ���
		System.out.println("Income : " + income);  // ����
		
		int i = 0;
		while (i < dividendRates.length) { // length of dividendRates = 3
			System.out.println("Dividend " + (i + 1) + ":" + income * dividendRates[i]);
			i += 1;
		}

	}

}
