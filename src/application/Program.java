package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exeptions.AccountOperationException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Account Data: ");
		System.out.print("Number: ");
		int accountNumber = sc.nextInt();
		
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.print("Initial Balance: ");
		Double initialBalance = sc.nextDouble();
		
		System.out.print("Withdraw Limit: ");
		Double withdrawLimit = sc.nextDouble();
		
		Account account = new Account(accountNumber, holder, initialBalance, withdrawLimit);
		
		System.out.print("\nEnter amount for withdraw: ");
		Double amountForWithdraw = sc.nextDouble();
		
		// dealing with possible errors 
		try {
			account.withdraw(amountForWithdraw);
		} catch(AccountOperationException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();

	}

}
