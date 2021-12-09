package br.senai.arquivo.araylist;

import java.util.ArrayList;

public class app {

	public static void main(String[] args) {
		DadosDaConta objDadosContato = new DadosDaConta();
		Arquivo arquivo = new Arquivo();
		String caminho = "Z:\\CONTATO\\contato.txt";
		//OBJETOS DE CONTATOS PARA TESTE
		
		Cadastro contato1 = new Cadastro("Ana Silvinha","ana@gmail.com","11111-222","Itapevi");
		Cadastro contato2 = new Cadastro("Pedro","pedro@outlook.com","010101-222","Piaui");
		Cadastro contato3 = new Cadastro("João","João@gmail.com","01010222-4","Barueri");
		Cadastro contato4 = new Cadastro("Geovanna","gio@gmail.com","45252-6","Bauru");
		
		//TESTE DE CADRASTRO DE CONTATOS
		
		objDadosContato.Cadastrarcontatos(contato1);
		objDadosContato.Cadastrarcontatos(contato2);
		objDadosContato.Cadastrarcontatos(contato3);
		objDadosContato.Cadastrarcontatos(contato4);
		
		//PERCORRE O ARRYLIST DE CONTATOS E GRAVA OS DADOS NO ARQUIVO TXT:
		//PARA PEGAR TODOS OS ITENS DO ARRYLIST EM UMA OUTRA CLASSE
		
		/*EXEMPLO 1
		ArrayList<Cadastro> listagem = objDadosContato.listarContatos();
		for(Cadastro contato : listagem) {
			System.out.println("Nome "+ contato.getNome() + " Email " + contato.getEmail() + " Telefone " + contato.getTelefone() + " Cidade " + contato.getCidade());
		}
		System.out.println(objDadosContato.contarContatos());
	}*/
		
	//EXEMPLO 2
	String texto = "";	
	for (Cadastro contato : objDadosContato.listarContatos()) {
		//ESSE PONTO E VIRGULO SERVE PARA QUANDO FOR ENVIADO PARA O ARQUIVO O ARQUIVO ENTENDER QUE ACABOU A LINHA
		texto += contato.getNome() + ";"+ contato.getEmail() + ";" + contato.getTelefone() + ";" + contato.getCidade() + "\n";
		
		
	}
	
	System.out.println(texto);
	
	arquivo.escrever(caminho, texto);
		
		
		
	}
}
