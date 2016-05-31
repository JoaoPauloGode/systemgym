package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

import dao.EscreverXML;
import dao.Escritora;
import model.ListaDeAlunos;
import view.TelaPesquisaAluno;

public class ButtonHandlerPesquisa implements ActionListener {

	TelaPesquisaAluno telapesquisa;
	ListaDeAlunos lista;

	public ButtonHandlerPesquisa(TelaPesquisaAluno telapesquisa, ListaDeAlunos lista) {
		this.telapesquisa = telapesquisa;
		this.lista = new ListaDeAlunos();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==telapesquisa.getPesquisarButton()) {


			try {
				EscreverXML reescrever=new EscreverXML(lista);
				lista.setListaAlunos(reescrever.buscarXML());
				pesquisa();
				Escritora.escrever(lista);
				reescrever.gerarXML();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			telapesquisa.getNomeFormatField().setText("");
		}
	}
	
	public void pesquisa() {  
		String NomeArq="Lista Alunos.txt";  
		String linha="";  
		String pal = telapesquisa.getNomeFormatField().getText();       
		try {  
			int i = 0;  
			@SuppressWarnings("resource")
			BufferedReader in = new BufferedReader(new FileReader("file\\Lista Alunos.txt"));  
			while((linha = in.readLine()) != null) {  
				i++;  
				if(linha.lastIndexOf(pal) >= 0) {  
				
						JOptionPane.showMessageDialog(null, "Aluno Cadastrado! CPF Linha: "+i);
						break;
				}
			} 
			if((linha = in.readLine()) == null) {
				JOptionPane.showMessageDialog(null, "Aluno Não Cadastrado!");
			}
			
			
		} catch (Exception e) {  
			JOptionPane.showMessageDialog(null, "Erro na abertura do arquivo: " + NomeArq);  
		}  
	}
	
	public MaskFormatter Mascara(String Mascara) {
		MaskFormatter F_Mascara = new MaskFormatter();
		try {
			F_Mascara.setMask(Mascara);
			F_Mascara.setPlaceholderCharacter(' ');
		} catch (Exception excecao) {
			excecao.printStackTrace();
		}
		return F_Mascara;
	}
}
