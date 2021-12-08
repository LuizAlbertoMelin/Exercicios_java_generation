package br.com.generation.exercicios;

import java.util.Scanner;

public class Raiz_quadrada {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double x1,x2, y1, y2, d;
		System.out.println("escreva na ordem x1, x2, y1, y2: ");
		x1=entrada.nextDouble();
		x2=entrada.nextDouble();
		y1=entrada.nextDouble();
		y2=entrada.nextDouble();
		entrada.close();
		d=Math.sqrt(((Math.pow(x2-x1, 2))+(Math.pow(y2-y1, 2))));
		System.out.println("a distancia entre eles é: "+d);

	}

}
