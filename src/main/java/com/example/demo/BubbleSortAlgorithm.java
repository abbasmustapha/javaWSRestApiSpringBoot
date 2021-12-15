package com.example.demo;

import java.util.Arrays;

public class BubbleSortAlgorithm implements SortAlgorithm{

	public int[] sort(int[] numbers) {
		affiche("Avant le tri...", numbers);
		int n = numbers.length;
		int swap = 0;
		
		for(int i=0;i<n; i++) {
			for (int j = 1; j < n -i; j++) {
				if(numbers[j-1] < numbers[j]) {
					swap = numbers[j-1];
					numbers[j-1] = numbers[j];
					numbers[j] = swap;
				}
			}
		}
		affiche("Après le tri...", numbers);
		return numbers;
	}
		
	private void affiche(String msg, int[] tab) {
		System.out.println("BubbleSort " + msg + " : " + Arrays.toString(tab).toString());
	}
		
}
