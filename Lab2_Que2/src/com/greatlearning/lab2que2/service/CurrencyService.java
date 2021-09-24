package com.greatlearning.lab2que2.service;
import java.io.IOException;
import java.util.Scanner;

public class CurrencyService {
	
	// User Defined Exception
	class CurrencyException {
		void curDenominationException() throws IOException {
			throw new IOException("Currency Denomination ");
		}
	}

	Scanner scanner = new Scanner(System.in);
	ReverseSortCurrencies rSort = new ReverseSortCurrencies();
	CurrencyException currencyExe = new CurrencyException();

	public int[] getCurrencyDenominationValue(int[] arr) throws IOException {
		for (int i = 0; i < arr.length; i++) {
			try {
				arr[i] = scanner.nextInt();
				if (arr[i] <= 1)
					currencyExe.curDenominationException();
			} catch (IOException e) {
				System.out.println("Kindly Enter the Correct Currency denomination : '0' and '1' not allowed");
				i--;
			}
		}
		return arr;
	}

	public void LeastCurrencyCount(int[] currencyArr, int amountToPay) {
		// Sorting the Currency Denomination Array in reverse order.
		rSort.reverseSort(currencyArr, 0, currencyArr.length - 1);
		// currency denomination to store the respective value of currencies..
		int[] currencyDenominationCount = new int[currencyArr.length];
		// Empty Array to reset the value in case of unsuccessful combination.
		int[] RequiredCurrecyArray = new int[currencyArr.length];
		int flag = 0;

		for (int i = 0; i < currencyArr.length; i++) {
			int amp = amountToPay;
			for (int j = i; j < currencyArr.length; j++) {
				currencyDenominationCount[j] = amp / currencyArr[j];
				amp %= currencyArr[j];
			}
			if (amp == 0) {
				flag = 1;
				break;
			} else
				currencyDenominationCount = RequiredCurrecyArray;
		}

		if (flag == 1) {
			for (int k = 0; k < currencyDenominationCount.length; k++) {
				if (currencyDenominationCount[k] != 0)
					System.out.println(currencyArr[k] + ":" + currencyDenominationCount[k]);
			}
		} else
			System.out.println("Not Possible to Pay");

	}
}
