package GitProjet;

import java.util.Scanner;

public class GitTeste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		/*
		 * 2. Faça um algoritmo que receba dois números e ao final mostre a
		 * soma, subtração, multiplicação e a divisão dos números lidos.
		 */

		Scanner valor = new Scanner(System.in);
		System.out.println("Informe o primeiro numero");
		int x = valor.nextInt();
		System.out.println("Informe o segundo numero");
		int y = valor.nextInt();
		int soma = x + y;
		int subtracao = x - y;
		int divisao = x / y;
		int multiplicacao = x * y;
		System.out.println("Soma dos numero é = " + soma);
		System.out.println("Subtração dos numeros é = " + subtracao);
		

	}

}


