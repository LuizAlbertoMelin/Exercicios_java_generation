package br.com.generation.exercicios3;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int idade=0, cont1=0, cont2=0;
		System.out.println("escreva a idade");
		while(idade!=-99) {
			idade=entrada.nextInt();
			if(idade>=0 && idade<21) {
				cont1++;
			}
			else if(idade>50) {
				cont2++;
			}
		}
		System.out.println("idade menor que 21: "+cont1+"\n idade maior que 50: "+cont2);
		entrada.close();
	}

}
