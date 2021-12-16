package br.senai.arquivo.araylist;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Arquivo {
	
	public DadosDaConta objDadosContato = new DadosDaConta();
	
	
	
	// ISSOO SERVE PARA TRATAR O ERRO PARA N�O CRACHAR O SITE !!!!
	//para n�o dar varios erros eu coloco para dar uma mensagem com erro escrito
	//cria o arquivo quando esse n�o existir e grava dados no arquivo
	
	public boolean escrever(String caminho, String texto){
		// estrutura try ()catch() ela faz com que haja um tratamento para ver 
		//se esta certo ou errado para o usuario, como se fosse uma forma mais amigavel de falar que
		//deu erro
		
		try {
			
			//OBJETO QUE REPRESENTA O ARQUIVO CLASSE QUE REPRESENTA O ARQUIVO
			FileWriter arquivo = new FileWriter(caminho);
			//OBJETO QUE REPRESENTA O OBJETO DE MANIPULA��O
			
			PrintWriter escreverArq = new PrintWriter(arquivo);
			
			escreverArq.append(texto);
			escreverArq.close();
			return true;
		
			
		}catch(IOException e){
			
			System.out.println("Erro " + e.getMessage());
			return false;
		}
	
	}
	
	public DadosDaConta ler(String caminhopler) {
		
		
		try {
			// VAI REPRESENTAR UM ARQUIVO QUANDO EU FOR LER (EM MODO DE LEITURA)
			FileReader lerarquivo = new FileReader(caminhopler);
			
			//REPRESENTA O DADO DE LEITURA NA M�MORIA DO PROGRAMA
			BufferedReader leituradamemoriadodoprograma =  new BufferedReader(lerarquivo);
			String linha = "";
			
			linha = leituradamemoriadodoprograma.readLine();
		
			while(linha != null) {

				String[] dadoslinha = linha.split(";");
				Cadastro objCadastro = new Cadastro();
				
				objCadastro.setTelefone(dadoslinha[0]);
				objCadastro.setCidade(dadoslinha[1]);
				objCadastro.setEmail(dadoslinha[2]);
				objCadastro.setNome(dadoslinha[3]);
				
				objDadosContato.Cadastrarcontatos(objCadastro);
				
				linha = leituradamemoriadodoprograma.readLine();
				
			}
			
			leituradamemoriadodoprograma.close();
			
			return objDadosContato;
			
		}catch(IOException e){
			System.out.println("ERROOOOO " + e.getMessage());
			return null;
		}
		
		
	}

}
