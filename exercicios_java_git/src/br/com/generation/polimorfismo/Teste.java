package br.com.generation.polimorfismo;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int idade;
		String nome;
		
		Acoes a1 = new Cachorro();
		Acoes a2 = new Cavalo();
		Acoes a3 = new Pregui�a();
		Cachorro c1 = new Cachorro();
		Cavalo c2 = new Cavalo();
		Pregui�a p1 = new Pregui�a();
		
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
		System.out.println("digite idade e o nome da pregui�a: ");
		idade=entrada.nextInt();
		nome=entrada.next();
		p1.setIdade(idade);
		p1.setNome(nome);
		
		System.out.println("a idade do cahorro �: "+c1.getIdade()+" e seu nome: "+c1.getNome());
		System.out.println();
		a1.acao();
		System.out.println();
		a1.som();

		System.out.println("a idade do cavalo �: "+c2.getIdade()+" e seu nome: "+c2.getNome());
		System.out.println();
		a2.acao();
		System.out.println();
		a2.som();
		
		System.out.println("a idade do cavalo �: "+p1.getIdade()+" e seu nome: "+p1.getNome());
		System.out.println();
		a3.acao();
		System.out.println();
		a3.som();
		entrada.close();
		
		

	}

}
