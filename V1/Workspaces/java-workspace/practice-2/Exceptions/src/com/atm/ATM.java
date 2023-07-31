package com.atm;

public class ATM {

	private int amount;

	public int balance() {
		return amount;
	}

	public void credit(int amount) {
		this.amount += amount;
	}

	public int withdraw(int withdrawAmount) {

		if (withdrawAmount > amount) {
			InsufficientBalanceException exception = new InsufficientBalanceException(
					"Entered amount is more than the available balance");

			throw exception;
		}

		this.amount -= withdrawAmount;

		return withdrawAmount;
	}

	public static void main(String[] args) {
		ATM atm = new ATM();

		System.out.println(atm.balance());

		atm.credit(123);

		System.out.println(atm.balance());

		int withdraw = atm.withdraw(1000);

		System.out.println(withdraw);

		System.out.println(atm.balance());
	}
}
