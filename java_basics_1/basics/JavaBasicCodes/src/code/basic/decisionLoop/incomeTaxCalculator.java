package code.basic.decisionLoop;

public class incomeTaxCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			double tax = 0;
			int income = 62345;

			if (income <= 20000) {
				tax = 0;
			}
			if (income > 20000 && income <= 40000) {
				tax = 20000 * 0 + (income - 20000) * 0.1;
			}
			if (income > 40000 && income <= 60000) {
				tax = 20000 * 0 + 20000 * 0.1 + (income - 40000) * 0.2;
			}
			if (income > 60000) {
				tax = 20000 * 0 + 20000 * 0.1 + 20000 * 0.2 + (income - 60000) * 0.3;
			}
			// * tax=Math.round(tax,2);
			System.out.printf("Value: %.2f", tax);
			;
		}

	}

}
