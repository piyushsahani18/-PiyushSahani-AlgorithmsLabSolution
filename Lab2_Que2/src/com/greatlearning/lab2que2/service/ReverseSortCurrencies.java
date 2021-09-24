package com.greatlearning.lab2que2.service;

public class ReverseSortCurrencies {

	public void reverseSort(int[] currencyDenomination, int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			reverseSort(currencyDenomination, low, mid);
			reverseSort(currencyDenomination, mid + 1, high);
			MergesortReverse(currencyDenomination, low, mid, high);
		}

	}

	public void MergesortReverse(int[] currencyDenomination, int low, int mid, int high) {
		int leftArrayLength = mid - low + 1;
		int rightArrayLength = high - mid;

		int[] leftArray = new int[leftArrayLength];
		int[] rightArray = new int[rightArrayLength];

		for (int i = 0; i < leftArrayLength; i++) {
			leftArray[i] = currencyDenomination[low + i];
		}
		for (int i = 0; i < rightArrayLength; i++) {
			rightArray[i] = currencyDenomination[mid + 1 + i];
		}

		int i = 0, j = 0;
		int k = low;

		while (i < leftArrayLength && j < rightArrayLength) {
			if (leftArray[i] >= rightArray[j]) {
				currencyDenomination[k] = leftArray[i++];
			} else {
				currencyDenomination[k] = rightArray[j++];
			}
			k++;
		}

		while (i < leftArrayLength) {
			currencyDenomination[k++] = leftArray[i++];
		}

		while (j < rightArrayLength) {
			currencyDenomination[k++] = rightArray[j++];
		}

	}

}
