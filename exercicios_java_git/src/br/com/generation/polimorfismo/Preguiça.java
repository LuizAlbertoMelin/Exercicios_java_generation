package br.com.generation.polimorfismo;

public class Pregui�a extends Animal implements Acoes{

	@Override
	public void acao() {
		System.out.println("a pregui�a sobe a arvore");
		
	}

	@Override
	public void som() {
		System.out.println("ZZZZZZZZZ, a mimir");
		
	}

}
