package br.com.generation.heran�a;

import java.util.Scanner;

public class Testando_Tudo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int idade;
		String nome;
		Cachorro c1 = new Cachorro();
		Cavalo c2 = new Cavalo();
		Preguica p1 = new Preguica();
		
		System.out.println("digite idade e o nome do cachorro: ");
		idade=entrada.nextInt();
		nome=entrada.next();
		c1.setIdade(idade);
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
		c1.correr();
		c1.emitir();

		System.out.println("a idade do cavalo �: "+c2.getIdade()+" e seu nome: "+c2.getNome());
		System.out.println();
		c2.correr();
		System.out.println();
		c2.emitir();
		
		System.out.println("a idade do cavalo �: "+p1.getIdade()+" e seu nome: "+p1.getNome());
		System.out.println();
		p1.subir();
		System.out.println();
		p1.emitir();
		entrada.close();
	}

}
