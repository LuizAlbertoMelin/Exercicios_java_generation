package br.com.generation.exercicios;

import java.util.Scanner;

public class Valor_carro {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		double valorCarro,custoFabrica;
		System.out.println("digite o valor da fabrica: ");
		custoFabrica=entrada.nextDouble();
		valorCarro=custoFabrica+(custoFabrica*0.28)+(custoFabrica*0.45);
		System.out.println("o valor do carro é: "+valorCarro);
		entrada.close();

	}

}
