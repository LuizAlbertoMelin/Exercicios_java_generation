package br.com.generation.exercicios;

import java.util.Scanner;

public class Media_ponderada {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double nota1,nota2,nota3;
		System.out.println("escreva na ordem sua nota 1, 2 e 3: ");
		nota1=entrada.nextInt();
		nota2=entrada.nextInt();
		nota3=entrada.nextInt();
		entrada.close();
		System.out.println("sua nota final foi: "+((nota1*0.2)+(nota2*0.3)+(nota3*0.5)));


	}

}
