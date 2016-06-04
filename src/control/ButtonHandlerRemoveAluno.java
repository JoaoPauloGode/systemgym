package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JOptionPane;

import dao.EscreverXML;
import dao.Escritora;
import model.ListaDeAlunos;
import view.TelaRemoverAluno;

public class ButtonHandlerRemoveAluno implements ActionListener {

	TelaRemoverAluno telaRemoveAluno;
	ListaDeAlunos listaDeAlunos;

	public ButtonHandlerRemoveAluno(TelaRemoverAluno telaRemoveAluno, ListaDeAlunos listaDeAlunos) {
		this.telaRemoveAluno = telaRemoveAluno;
		this.listaDeAlunos=listaDeAlunos;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==telaRemoveAluno.getRemoverButton()) {
			
			try {
				EscreverXML reescrever=new EscreverXML(listaDeAlunos);
				listaDeAlunos.setListaAlunos(reescrever.buscarXML());
				listaDeAlunos.remove((Integer.parseInt(telaRemoveAluno.getIdField().getText())));
				Escritora.escrever(listaDeAlunos);
				reescrever.gerarXML();
				JOptionPane.showMessageDialog(null, "Aluno Removido");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			catch (java.lang.IndexOutOfBoundsException e2) {
				e2.printStackTrace();
				JOptionPane.showMessageDialog(null, "Estouro!, ID excede o n�mero de alunos");
			}
			telaRemoveAluno.getIdField().setText("");
		}
	}
}
