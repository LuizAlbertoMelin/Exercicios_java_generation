package br.com.generation.exercicios;

import java.util.Scanner;

public class Equação_linear {

	public static void main(String[] args) {
		double a, b, c, d, e, f, x, y;
		Scanner entrada = new Scanner(System.in);
		System.out.println("digite seus valores de A a F em sequencia: ");
		a=entrada.nextDouble();
		b=entrada.nextDouble();
		c=entrada.nextDouble();
		d=entrada.nextDouble();
		e=entrada.nextDouble();
		f=entrada.nextDouble();
		entrada.close();
		x=((c*e)-(b*f)/(a*e)-(b*d));
		y=((a*f)-(c*d)/(a*e)-(b*d));
		System.out.println("seu valor de x é: "+x+" seu valor de y é: "+y);


	}

}
