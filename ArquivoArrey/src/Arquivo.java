

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Arquivo {
	
	// ISSOO SERVE PARA TRATAR O ERRO PARA NÃO CRACHAR O SITE !!!!
	//para não dar varios erros eu coloco para dar uma mensagem com erro escrito
	//cria o arquivo quando esse não existir e grava dados no arquivo
	
	public boolean escrever(String caminho, String texto){
		// estrutura try ()catch() ela faz com que haja um tratamento para ver 
		//se esta certo ou errado para o usuario, como se fosse uma forma mais amigavel de falar que
		//deu erro
		
		try {
			
			//OBJETO QUE REPRESENTA O ARQUIVO CLASSE QUE REPRESENTA O ARQUIVO
			FileWriter arquivo = new FileWriter(caminho);
			//OBJETO QUE REPRESENTA O OBJETO DE MANIPULAÇÃO
			
			PrintWriter escreverArq = new PrintWriter(arquivo);
			
			escreverArq.append(texto);
			escreverArq.close();
			return true;
		
			
		}catch(IOException e){
			
			System.out.println("Erro " + e.getMessage());
			return false;
		}
	
	}
	
	public String ler(String caminhopler) {
		String conteudo = "";
		
		try {
			// VAI REPRESENTAR UM ARQUIVO QUANDO EU FOR LER (EM MODO DE LEITURA)
			FileReader lerarquivo = new FileReader(caminhopler);
			
			//REPRESENTA O DADO DE LEITURA NA MÉMORIA DO PROGRAMA
			BufferedReader leituradamemoriadodoprograma =  new BufferedReader(lerarquivo);
			String linha = "";
			
			linha = leituradamemoriadodoprograma.readLine();
			
			while(linha != null) {
				conteudo += linha + "\n";
				linha = leituradamemoriadodoprograma.readLine();
			}
			leituradamemoriadodoprograma.close();
			return conteudo;
			
		}catch(IOException e){
			System.out.println("ERROOOOO " + e.getMessage());
		}
		
		return conteudo;
	}

}
