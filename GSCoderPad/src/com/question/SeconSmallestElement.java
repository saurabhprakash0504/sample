package com.question;

public class SeconSmallestElement {

	public static void main(String[] args) {

		int a[] = { 51, 2, 5, 3, 4, 6, 7, 6 ,1,1};

		int small = a[0];
		int secondSmall = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < small) {
				secondSmall = small;
				small = a[i];
			} else if (a[i] < secondSmall && a[i] > small) {
				secondSmall = a[i];
			}
		}

		System.out.println("seond small >> " + secondSmall + "  " + small);
	}
}