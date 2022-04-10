package com.greatLearning.Denominations;

import com.greatLearning.Sorting.QUICK_SORT;

public class Min_Denom {
	public void compute(int[] arr, int amount) {
// Sorting the array in descending order.

		QUICK_SORT ob = new QUICK_SORT();
		ob.Sort(arr, 0, arr.length - 1);

		int[] curr_notes = new int[arr.length];
		boolean flag = true;
		for (int i = 0; i < arr.length; i++) {
			curr_notes[i] = amount / arr[i];
			amount = amount % arr[i];
		}
// If smallest denomination is not a factor of last remainder, then amount cannot  be tendered.
		if (amount % arr[arr.length - 1] != 0) {
			flag = false;
		}

		if (flag == true) {
			System.out.println("Your payment approach in order to give minimum no of notes will be");
			for (int i = 0; i < arr.length; i++) {
				if (curr_notes[i] != 0)
					System.out.println(arr[i] + ":" + curr_notes[i]);
			}
		} else {
			System.out.println("Exact amount cannot be tendered");
		}

	}
}