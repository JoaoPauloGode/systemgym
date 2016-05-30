package model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Escritora {


	public static void escrever(ListaDeAlunos listaDeAlunos) throws IOException {

		java.io.File diretorio=new java.io.File("D:\\Workspace2\\System-gym2Xml\\file");
		java.io.File arquivo=new java.io.File(diretorio, "Lista Alunos.txt");

		try {
			arquivo.createNewFile();

			FileWriter fileWriter = new FileWriter(arquivo, false);

			for (Aluno aluno : listaDeAlunos.getListaAlunos() ){
				
			fileWriter.write("Aluno :"+aluno.getNome()+"\r\n"+"Telefone: "+
					aluno.getTelefone()+"\r\n"+"Endereço: "+
					aluno.getEndereco()+"\r\n"+"ID: "+
					aluno.getId()+"\r\nSaldo Devedor: "+
					aluno.getSaldoDevedor()+
					"\r\n"+"=============================================\r\n");
			}
			
			fileWriter.close();

			FileReader fileReader=new FileReader(arquivo);
			BufferedReader bufferedReader=new BufferedReader(fileReader);
			fileReader.close();
			bufferedReader.close();

		}catch(IOException e) {
			e.printStackTrace();
		}
	}




}
