package org.jtl.oca;
import java.util.function.Predicate;

public class FizzBuzz {
	private static Predicate<Integer> fizz = (n) -> n % 3 == 0;
	private static Predicate<Integer> buzz = (n) -> n % 5 == 0;
	private static Predicate<Integer> fizzbuzz = (n) -> n % 3 == 0 && n % 5 == 0;

	public static void main(String[] args) {
		for (int i = 1; i < 101; i++) {
			if (fizzbuzz.test(i))
				System.out.println("Fizzbuzz");
			else if (fizz.test(i))
				System.out.println("Fizz");
			else if (buzz.test(i))
				System.out.println("Buzz");
			else
				System.out.println(i);
		}
	}
}
