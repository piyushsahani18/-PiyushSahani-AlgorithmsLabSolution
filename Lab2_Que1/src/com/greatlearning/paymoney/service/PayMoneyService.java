package com.greatlearning.paymoney.service;

import java.util.Scanner;

public class PayMoneyService {

	Scanner scanner = new Scanner(System.in);

	public int[] getTransactionArrayValues(int transactionArraySize) {
		System.out.println("Enter the values of the Array");
		int transactionArray[] = new int[transactionArraySize];
		for (int i = 0; i < transactionArray.length; i++) {
			transactionArray[i] = scanner.nextInt();
		}
		return transactionArray;
	}

	public void transactionCount(int[] transactionArray) {
		System.out.println("Enter the value of the Target");
		int target = scanner.nextInt();
		int flag = 0;
		int targetAchieved = 0;
		for (int i = 0; i < transactionArray.length; i++) {
			targetAchieved += transactionArray[i];
			if (targetAchieved > target) {
				System.out.println("Target is achieved after " + (i + 1) + " transactions.");
				System.out.println();
				System.out.println();
				flag = 1;
				break;
			}
		}
		if (flag == 0)
			System.out.println(" Given target cannot be achieved ");
	}

	public void noOfTargetToAchieve(int NoOfTarget, int[] transactionArray) {
		for (int i = 0; i < NoOfTarget; i++) {
			transactionCount(transactionArray);
		}
	}

}
