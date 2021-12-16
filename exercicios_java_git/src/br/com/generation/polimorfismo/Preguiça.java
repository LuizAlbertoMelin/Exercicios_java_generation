package br.com.generation.polimorfismo;

public class Preguiça extends Animal implements Acoes{

	@Override
	public void acao() {
		System.out.println("a preguiça sobe a arvore");
		
	}

	@Override
	public void som() {
		System.out.println("ZZZZZZZZZ, a mimir");
		
	}

}
