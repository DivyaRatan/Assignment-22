package com.stream.random;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Display {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 100; i++) {
			list.add((int) (Math.random() * 10000) % 100);
		}
		Consumer<Integer> consumerPrint = System.out::println;
		Predicate<Integer> predicateEven = (element) -> (element % 2 == 0) ? true : false;
		Predicate<Integer> predicateOdd = (element) -> (element % 2 == 0) ? false : true;
		Predicate<Integer> predicateDivbysix = (element) -> (element % 6 == 0) ? true : false;
		Predicate<Integer> predicateLessThanTwelve = (element) -> (element < 12) ? true : false;
		Predicate<Integer> predicateGreterThanFifty = (element) -> (element > 50) ? true : false;
		System.out.println("1. All integers in the list");
		list.stream().forEach(consumerPrint);
		System.out.println("2. All even elements in the list");
		list.stream().filter(predicateEven).forEach(consumerPrint);
		System.out.println("3. All odd elements in the list");
		list.stream().filter(predicateOdd).forEach(consumerPrint);
		System.out.println("4. All numbers divisible by 6 in the list");
		list.stream().filter(predicateDivbysix).forEach(consumerPrint);
		System.out.println("5. All numbers less than 12 in the list");
		list.stream().filter(predicateLessThanTwelve).forEach(consumerPrint);
		System.out.println("6. All numbers greater than 50 in the list");
		list.stream().filter(predicateGreterThanFifty).forEach(consumerPrint);
	}
}