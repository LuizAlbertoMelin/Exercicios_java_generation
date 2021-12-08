package br.com.generation.exercicios;

import java.util.Scanner;

public class Idade_em_dias {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int anos, meses, dias;
		System.out.println("digite sua idade na ordem anos meses e dias");
		anos=entrada.nextInt();
		meses=entrada.nextInt();
		dias=entrada.nextInt();
		System.out.println("sua idade em dias é: "+(((anos*12)+meses*30)+dias));
		entrada.close();
	}

}
