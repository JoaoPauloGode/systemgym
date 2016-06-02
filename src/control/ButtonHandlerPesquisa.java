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
import view.TelaDadosAluno;
import view.TelaPesquisaAluno;

public class ButtonHandlerPesquisa implements ActionListener {

	TelaPesquisaAluno telapesquisa;
	private ListaDeAlunos lista;
	private static int posId=0;
	private static int i=0;
	EscreverXML xml;

	public ButtonHandlerPesquisa(TelaPesquisaAluno telapesquisa, ListaDeAlunos lista) {
		this.telapesquisa = telapesquisa;
		this.lista = new ListaDeAlunos();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==telapesquisa.getPesquisarButton()) {


			
				EscreverXML reescrever=new EscreverXML(lista);
				lista.setListaAlunos(reescrever.buscarXML());
				pesquisa();
				try {
					Escritora.escrever(lista);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				reescrever.gerarXML();
			
			telapesquisa.getNomeFormatField().setText("");
		}
	}

	public void pesquisa() {  
		String linha="";  
		String cpf = telapesquisa.getNomeFormatField().getText();  
		
		try {  
			
			@SuppressWarnings("resource")
			BufferedReader in = new BufferedReader(new FileReader("file\\Lista Alunos.txt"));  
			while((linha = in.readLine()) != null) {  
				i++;  
				if(linha.lastIndexOf(cpf) > 0) {  
					posId = (i-4)/7;
					new TelaDadosAluno();
					i=0;
					break;
					
				}if(linha.lastIndexOf(cpf)==0) {
					JOptionPane.showMessageDialog(null, "Aluno Não Cadastrado!");
					i=0;
					break;
				}
			} 
			i=0;
			if((linha = in.readLine()) == null) {
				JOptionPane.showMessageDialog(null, "Aluno Não Cadastrado!");
			}

		} catch (Exception e) {  
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro na abertura do arquivo");  
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
	

	public int getPosId() {
		return posId;
	}
	
	public int getI() {
		return i;
	}

	public ListaDeAlunos getLista() {
		return lista;
	}
}
