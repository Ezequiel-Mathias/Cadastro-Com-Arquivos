package br.senai.arquivo.araylist;

import java.util.ArrayList;

public class DadosDaConta {

	ArrayList<Cadastro> contatos = new ArrayList<Cadastro>();
	Cadastro contato = new Cadastro();
	
	//METODOS:
	public void Cadastrarcontatos(Cadastro c) {
		contatos.add(c);
	}
	public int contarContatos() {
		return contatos.size();
	}
	//PARA PEGAR O VALOR TOTAL DO ARRAYLIST
	public ArrayList<Cadastro> listarContatos(){
		return contatos;
	}
}
