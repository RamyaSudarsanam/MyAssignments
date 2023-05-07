package week3.day1assignments;

public class AxisBank extends BankingInfo{
	public void deposit() {
		System.out.println("Deposit");

	}

	public static void main(String[] args) {
		AxisBank bank=new AxisBank();
		bank.deposit();
		bank.saving();
		bank.fixed();
	}

}
