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
		 * 2. Fa�a um algoritmo que receba dois n�meros e ao final mostre a
		 * soma, subtra��o, multiplica��o e a divis�o dos n�meros lidos.
		 */

		Scanner valor = new Scanner(System.in);
		System.out.println("Informe o primeiro numero");
		int x = valor.nextInt();
		System.out.println("Informe o segundo numero");
		int y = valor.nextInt();
		int soma = x + y;
		int subtracao = x - y;
		int divisao = x / y;
		System.out.println("Soma dos numero � = " + soma);
		System.out.println("Subtra��o dos numeros � = " + subtracao);
		System.out.println("Divis�o dos numeros � = " + divisao);
		

	}

}


