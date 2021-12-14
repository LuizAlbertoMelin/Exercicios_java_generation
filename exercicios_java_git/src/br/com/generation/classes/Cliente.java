package br.com.generation.classes;

public class Cliente {

	public static void main(String[] args) {
		Dados_cliente a1 = new Dados_cliente();
		Dados_cliente a2 = new Dados_cliente();
		
		a1.nome  = "Jeff";
		a1.idade = 52;
		a1.cpf = 00000000;
		a1.sexo = "masculino";
		a1.saldo = 3000;
		a1.email = "yugbdsuy@gmail.com";
		
		a2.nome  = "Vagner";
		a2.idade = 67;
		a2.cpf = 00000000;
		a2.sexo = "masculino";
		a2.saldo = 2999;
		a2.email = "yjioytijoytsuy@gmail.com";
		
		System.out.println("Nome: " + a1.nome);
		System.out.println(a1.idade);
		System.out.println(a1.cpf);
		System.out.println(a1.sexo);
		a1.cadastro();
		System.out.println("Nome do : " + a2.nome);
		System.out.println(a2.idade);
		System.out.println(a2.cpf);
		System.out.println(a2.sexo);
		a2.cadastro();
	}

}
