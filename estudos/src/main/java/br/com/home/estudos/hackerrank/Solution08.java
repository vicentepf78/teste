package br.com.home.estudos.hackerrank;

import java.util.Scanner;

public class Solution08 {
	
	public static int B;
	public static int H;
	public static boolean flag;
	
	static  {
		Scanner sc = new Scanner(System.in);
		B = sc.nextInt();
		H = sc.nextInt();
		
		if(B > 0 && H > 0) {
			flag = true;
		} else {
			System.out.println(new Exception("Breadth and height must be positive"));
		}
		
		sc.close();
	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}
	}

}
