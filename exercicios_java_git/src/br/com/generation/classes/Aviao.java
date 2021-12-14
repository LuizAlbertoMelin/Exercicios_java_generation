package br.com.generation.classes;

public class Aviao {

	public static void main(String[] args) {
		Dados_avião a1= new Dados_avião();
		Dados_avião a2 = new Dados_avião();
		
		a1.nome  = "Jeff";
		a1.assentos = 103;
		a1.pessoas = 98;
		a1.numeroSerie = 00000000;
		a1.modelo = "Boing";
		
		a2.nome  = "Vagner";
		a2.assentos = 404;
		a2.pessoas = 333;
		a2.numeroSerie = 00000000;
		a2.modelo = "airbus";
		
		System.out.println("Nome: " + a1.nome);
		System.out.println(a1.modelo);
		System.out.println(a1.assentos);
		System.out.println(a1.pessoas);
		System.out.println(a1.numeroSerie);
		a1.estacioando();
		System.out.println("Nome: " + a2.nome);
		System.out.println(a2.modelo);
		System.out.println(a2.assentos);
		System.out.println(a2.pessoas);
		System.out.println(a2.numeroSerie);
		a2.estacioando();

	}

}
