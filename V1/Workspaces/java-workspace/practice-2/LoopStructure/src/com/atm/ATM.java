package com.atm;

import java.util.Scanner;

public class ATM {

	private double availableBalance;

	public ATM(double amount) {
		availableBalance = amount;
	}

	public void deposit(double amount) {

		if (amount > 0) {
			availableBalance = availableBalance + amount;
		} else {
			throw new RuntimeException("Invalid Deposit Amount: " + amount);
		}
	}

	public double balanceCheck() {
		return availableBalance;
	}

	public double withdraw(double amount) {

		if (amount > availableBalance) {
			throw new InsufficientBalanceException("Invalid Withdraw Amount(Insufficient Balance): " + amount);
		}

		availableBalance = availableBalance - amount;

		return amount;
	}

	public static void main(String[] args) {

		ATM atm = new ATM(12.34);

		Scanner s = new Scanner(System.in);

		for (;;) {
			System.out.println("Enter operation: ");
			int operation = s.nextInt();

			switch (operation) {

			case 1:
				System.out.println("Current balance: " + atm.balanceCheck());
				break;
			case 2:
				try {
					System.out.println("Enter deposit amount: ");

					double depositAmount = s.nextDouble();

					atm.deposit(depositAmount);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				System.out.println("Current balance: " + atm.balanceCheck());
				break;
			case 3:
				System.out.println("Enter withdraw amount: ");

				double withdrawAmount = s.nextDouble();
				try {
					double withdraw = atm.withdraw(withdrawAmount);
					System.out.println("Withdraw amount: " + withdraw);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

				System.out.println("Current balance: " + atm.balanceCheck());
				break;
			case -1:
				return;
			}
		}
	}
}
