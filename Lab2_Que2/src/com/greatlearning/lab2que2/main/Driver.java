package com.greatlearning.lab2que2.main;

import java.io.IOException;
import java.util.Scanner;

import com.greatlearning.lab2que2.service.CurrencyService;

public class Driver {

	
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		CurrencyService currencyservice = new CurrencyService();
		int currencyDenomSize = 0;
		System.out.println("Enter the size of the currency denomination");
		currencyDenomSize = scan.nextInt();
		int[] allCurrencyDenominations = new int[currencyDenomSize];
		System.out.println("Enter the currency denomination values");
		allCurrencyDenominations = currencyservice.getCurrencyDenominationValue(allCurrencyDenominations);
		System.out.println("Enter the amount you want to pay");
		int amountToPay = scan.nextInt();
		
		// To find the currency denomination possible if possible...
		System.out.println("Your payment approach in order give  least no.of currency domination :");
		currencyservice.LeastCurrencyCount(allCurrencyDenominations, amountToPay);  
		scan.close();
		
	
	}

}
