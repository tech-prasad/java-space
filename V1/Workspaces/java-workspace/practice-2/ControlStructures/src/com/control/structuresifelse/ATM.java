package com.control.structuresifelse;

public class ATM {
	public static void main(String[] args) {

		int accountBalance = 500;

		int wantToWithdraw = 500;

		if (wantToWithdraw <= accountBalance) {
			System.out.println("Withdraw success for amount: " + wantToWithdraw);
		} else {
			System.err.println("Withdraw failed for amount (Insufficient Balance): " + wantToWithdraw);
		}
	}
}
