package org.jtl.oca;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class IsUnique implements Predicate<Predicate<Integer>> {
	private List<Integer> a;

	public IsUnique(List<Integer> a) {
		this.a = a;
	}

	public boolean test(Predicate<Integer> p) {
		int trueCounter = 0;
		for (int i : a) {
			if (p.test(i)) {
				trueCounter++;
			}
		}
		return trueCounter == 1;
	}

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(2, 5, 8);
		IsUnique numbers = new IsUnique(nums);
		System.out.println(numbers.test((n) -> (n % 3 == 0) || (n % 5 == 0)));
	}
}

// class Even implements Predicate<Integer> {
// public boolean test(Integer n) {
// return n % 2 == 0;
// }
//
// }
