package br.com.generation.polimorfismo;

public class Cavalo extends Animal implements Acoes{

	@Override
	public void acao() {
		// TODO Auto-generated method stub
		System.out.println("O cavalo est� correndo, pulando obstaculos");
	}

	@Override
	public void som() {
		// TODO Auto-generated method stub
		System.out.println("POCOTO POCOTO POCOTO IIIRRRR�, RILICHIN?");
	}
	
	
}
