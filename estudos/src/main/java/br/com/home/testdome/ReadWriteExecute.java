package br.com.home.testdome;

import java.math.BigDecimal;

public class ReadWriteExecute {

	public static int symbolicToOctal(String permString) {

		String[] parte1 = permString.substring(0, 3).split("");
		
//		"rwxr-x-w-"
		System.out.println("Parte 1 = " + parte1.length);
		int res01 = calculo(parte1);
		
		String[] parte2 = permString.substring(3, 6).split("");
		System.out.println("Parte 2 = " + parte2.length);
		int res02 = calculo(parte2);
		
		String[] parte3 = permString.substring(6,permString.length()).split("");
		System.out.println("Parte 3 = " + parte3.length);
		int res03 = calculo(parte3);
		
		
		StringBuilder sb = new StringBuilder();
		sb.append(res01);
		sb.append(res02);
		sb.append(res03);
		
//		System.out.println("Builder = " + sb);
		
		Number number = new BigDecimal(sb.toString());

		return  number.intValue();
	}

	private static int calculo(String[] r) {

		int resultado = 0;

		for (int i = 0; i < r.length; i++) {
			if (r[i].equals("r") ) {
				resultado = resultado + 4;
			} else {
				if (r[i].equals("w")) {
					resultado = resultado + 2;
				} else {
					if (r[i].equals("x")) {
						resultado = resultado + 1;
					} else {
						if (r[i].equals("-")) {
							resultado = resultado + 0;
						}
					}
				}
			}
		}

		System.out.println("Resultado : " + resultado);
		return resultado;
	}

	public static void main(String[] args) {
		// Should write 752
		System.out.println(ReadWriteExecute.symbolicToOctal("rwxr-x-w-"));
	}

}
