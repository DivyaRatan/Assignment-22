package com.stream.random;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public abstract class Result {
	public static void main(String args[]) throws IOException {
		PrintWriter out = new PrintWriter(new File("c:\\test\\boy.txt"));
		Random rand = new Random();
		int number, count = 0;
		while (count != 100) {
			number = rand.nextInt(49) + 1;//for generating random number
			out.println(number);
			count++;
		}
		out.close();
		System.out.println("Succesful");
		Scanner scanner = new Scanner(new File("c:\\test\\boy.txt"));
		ArrayList<Integer> list = new ArrayList<>();
		while (scanner.hasNext()) {
			list.add(scanner.nextInt());
		}
		System.out.println("REMOVED DUPLICATES........");
		list.stream().distinct().forEach(System.out::println);//distinct function to remove duplicates
		System.out.println("SORTED........");
		list.stream().distinct().sorted().forEach(System.out::println);
		scanner.close();
	}
}