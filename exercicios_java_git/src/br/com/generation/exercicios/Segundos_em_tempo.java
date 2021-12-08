package br.com.generation.exercicios;

import java.util.Scanner;

public class Segundos_em_tempo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int segundos, minutos;
		System.out.println("digite o tempo do processo em segundos: ");
		System.out.println();
		segundos=entrada.nextInt();
		entrada.close();
		minutos= (segundos%60)/60;
		System.out.println("foram "+(segundos/3600)+" horas, "+minutos+" minutos e "+((segundos%3600)-(60*minutos)) +" segundos.");


	}

}
