package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

import dao.EscreverXML;
import dao.Escritora;
import model.Aluno;
import model.ListaDeAlunos;
import view.TelaCadastroAluno;

public class ButtonHandlerCadastroAluno implements ActionListener {

	TelaCadastroAluno telaCadastroAluno;
	Escritora escritora;
	ListaDeAlunos listaAlunos;

	public ButtonHandlerCadastroAluno(TelaCadastroAluno telaCadastroAluno, ListaDeAlunos listaAlunos) {
		this.telaCadastroAluno = telaCadastroAluno;
		this.listaAlunos = listaAlunos;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==telaCadastroAluno.getCadastroRealizaAlunoButton()) {

			try {

				EscreverXML escrever = new EscreverXML(listaAlunos);
				listaAlunos.setListaAlunos(escrever.buscarXML());
				listaAlunos.add(new Aluno(telaCadastroAluno.getNomeField().getText(), telaCadastroAluno.getEnderecoField().getText(), telaCadastroAluno.getTelefoneFormatField().getText(),telaCadastroAluno.getCpfFormatField().getText() , 0));

				Escritora.escrever(listaAlunos);
				escrever.gerarXML();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			telaCadastroAluno.getNomeField().setText("");
			telaCadastroAluno.getTelefoneFormatField().setText("");
			telaCadastroAluno.getEnderecoField().setText("");

			JOptionPane.showMessageDialog(null, "Aluno cadastrado");
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
