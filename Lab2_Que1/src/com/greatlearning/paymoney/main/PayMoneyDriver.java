package com.greatlearning.paymoney.main;

import java.util.Scanner;

import com.greatlearning.paymoney.service.PayMoneyService;

public class PayMoneyDriver {
	
	public static void main(String[] args) {
		PayMoneyService service = new PayMoneyService();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the transaction array");
		int sizeOfTransaction = scanner.nextInt();
		// TO get the Transaction Array
		int[] TransactionArrayValues = service.getTransactionArrayValues(sizeOfTransaction);
		System.out.println("Enter the total no Of Target needs to be achieved");
		int totalNoOfTarget = scanner.nextInt(); 
		service.noOfTargetToAchieve(totalNoOfTarget, TransactionArrayValues);
		scanner.close();
	}
}
