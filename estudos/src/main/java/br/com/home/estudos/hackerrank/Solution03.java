package br.com.home.estudos.hackerrank;

import java.util.Scanner;

public class Solution03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("================================");
		
//		System.out.println(String.format("|%-15s|", "casa"));
//		System.out.println(String.format("|%03d|", 1));
		
		
		for (int i = 0; i < 3; i++) {
			String s1 = sc.next();
			int x = sc.nextInt();
			// Complete this line
			System.out.println(String.format("%-15s", s1) + String.format("%03d", x));
		}
		sc.close();
		System.out.println("================================");

	}

}
