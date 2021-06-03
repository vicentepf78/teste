package br.com.home.estudos.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution04 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(bufferedReader.readLine().trim());
		int tam = 10;
		
		if(N >= 2 && N <= 20) {
			for (int i = 1; i <= tam; i++) {
				System.out.println(N + " x " + i + " = " + N*i);
			}
		}else {
			System.out.println("Não por gerar resultado N não permitido. ");
		}

		bufferedReader.close();
	}

}
