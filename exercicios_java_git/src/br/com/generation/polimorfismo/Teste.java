package br.com.generation.polimorfismo;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int idade;
		String nome;
		
		Acoes a1 = new Cachorro();
		Acoes a2 = new Cavalo();
		Acoes a3 = new Preguiça();
		Cachorro c1 = new Cachorro();
		Cavalo c2 = new Cavalo();
		Preguiça p1 = new Preguiça();
		
		System.out.println("digite idade e o nome do cachorro: ");
		idade=entrada.nextInt();
		nome=entrada.next();
		c1.setIdade (idade);
		c1.setNome(nome);
		System.out.println("digite idade e o nome do cavalo: ");
		idade=entrada.nextInt();
		nome=entrada.next();
		c2.setIdade(idade);
		c2.setNome(nome);
		System.out.println("digite idade e o nome da preguiça: ");
		idade=entrada.nextInt();
		nome=entrada.next();
		p1.setIdade(idade);
		p1.setNome(nome);
		
		System.out.println("a idade do cahorro é: "+c1.getIdade()+" e seu nome: "+c1.getNome());
		System.out.println();
		a1.acao();
		System.out.println();
		a1.som();

		System.out.println("a idade do cavalo é: "+c2.getIdade()+" e seu nome: "+c2.getNome());
		System.out.println();
		a2.acao();
		System.out.println();
		a2.som();
		
		System.out.println("a idade do cavalo é: "+p1.getIdade()+" e seu nome: "+p1.getNome());
		System.out.println();
		a3.acao();
		System.out.println();
		a3.som();
		entrada.close();
		
		

	}

}
