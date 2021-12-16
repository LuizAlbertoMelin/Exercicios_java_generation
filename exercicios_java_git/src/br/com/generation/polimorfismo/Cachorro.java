package br.com.generation.polimorfismo;

public class Cachorro extends Animal implements Acoes{

	@Override
	public void acao() {
		// TODO Auto-generated method stub
		System.out.println("O cachorro está correndo, perseguindo uma moto");
	}

	@Override
	public void som() {
		// TODO Auto-generated method stub
		System.out.println("AUAUAUA GRRR AUAU");
	}
	
	
}
