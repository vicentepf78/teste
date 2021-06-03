package br.com.home.estudos.hackerrank;

import java.util.Scanner;

public class Solution02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		Double d = scan.nextDouble();
		scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		String s = scan.nextLine();
		scan.close();

		// Write your code here.

		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
	}

}
