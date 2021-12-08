package br.com.generation.exercicios;

import java.util.Scanner;

public class Idade_dias_em_anos {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int idade;
		System.out.println("coloque sua idade em dias");
		System.out.println();
		idade=entrada.nextInt();
		System.out.println();
		System.out.println("vc tem "+(idade/365)+" anos, "+((idade%365)/30)+" meses e "+((idade%365)-((idade%365)/30)+" dias "));
		entrada.close();

	}

}
