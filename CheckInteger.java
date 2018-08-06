package com.stream.random;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

class CheckInteger {
	public static Predicate<Integer> isEven() {
		return (a -> a % 2 == 0);
	}

	public static Predicate<Integer> isOdd() {
		return (a -> a % 2 != 0);
	}

	public static Predicate<Integer> isPalindrome() {
		Predicate<Integer> p = a -> {
			String word = "" + a;//For changing in string
			StringBuilder str = new StringBuilder(word);//Stringbuilder to use reverse
			return (word.equals(str.reverse().toString()) ? true : false);
		};
		return p;
	}

	public static void main(String args[]) throws IOException {
		Scanner scanner = new Scanner(System.in);
		List<Integer> number = new ArrayList<>();
		number.add(scanner.nextInt());
		number.stream().filter(isEven()).forEach(i -> System.out.println("Even"));//Passing the value if it is true
		number.stream().filter(isOdd()).forEach(i -> System.out.println("Odd"));
		number.stream().filter(isPalindrome()).forEach(i -> System.out.println("No. is palindrome"));
		number.stream().filter(isPalindrome().negate()).forEach(i -> System.out.println("No. is not palindrome"));//Passing the value if it is false
		scanner.close();
	}
}