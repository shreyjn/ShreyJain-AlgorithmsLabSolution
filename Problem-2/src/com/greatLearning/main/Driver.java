package com.greatLearning.main;

import java.util.Scanner;

import com.greatLearning.Denominations.Min_Denom;

public class Driver {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations array");
		int size = sc.nextInt();

		int[] denoms = new int[size];
		System.out.println("Enter the currency denominations");
		for (int i = 0; i < size; i++) {
			denoms[i] = sc.nextInt();

		}

		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();

		Min_Denom ob = new Min_Denom();
		ob.compute(denoms, amount);
		sc.close();

	}
}
