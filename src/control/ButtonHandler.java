package control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import model.ListaDeAlunos;
import view.TelaCadastroAluno;
import view.TelaInicial;
import view.TelaPagamento;
import view.TelaPesquisaAluno;
import view.TelaRemoverAluno;
import view.TelaVenda;

public class ButtonHandler implements MouseListener {

	TelaInicial telainicial;
	TelaCadastroAluno telaCadastroAluno;
	TelaRemoverAluno telaRemoverAluno;
	TelaVenda telaVenda;
	TelaPagamento telaPagamento;
	TelaPesquisaAluno telaPesquisaAluno;
	ListaDeAlunos listaAlunos;

	public ButtonHandler(TelaInicial telainicial, ListaDeAlunos listaAlunos) {
		this.telainicial=telainicial;
		this.listaAlunos=listaAlunos;
	}

	public ButtonHandler(TelaCadastroAluno telaCadastroAluno) {
		this.telaCadastroAluno = telaCadastroAluno;
	}

	public ButtonHandler(TelaRemoverAluno telaRemoverAluno) {
		this.telaRemoverAluno = telaRemoverAluno;
	}

	public ButtonHandler(TelaInicial telainicial) {
		this.telainicial=telainicial;
	}

	public ButtonHandler(TelaVenda telaVenda) {
		this.telaVenda=telaVenda;
	}
	
	public ButtonHandler(TelaPagamento telaPagamento) {
		this.telaPagamento=telaPagamento;
	}
	
	public ButtonHandler(TelaPesquisaAluno telapesquisaAluno) {
		this.telaPesquisaAluno=telapesquisaAluno;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==telainicial.getCadastrarAlunoButton()) {
			new TelaCadastroAluno(listaAlunos);
		}else if(e.getSource()==telainicial.getRemoverAlunoButton()) {
			new TelaRemoverAluno(listaAlunos);
		}else if(e.getSource()==telainicial.getListarAlunoButton()) {

			try {
				java.awt.Desktop.getDesktop().open(new File("file\\Lista Alunos.txt"));

			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}else if(e.getSource()==telainicial.getRealizarVendaButton()) {
			new TelaVenda();
		}else if(e.getSource()==telainicial.getRealizarPagamentoButton()) {
			new TelaPagamento();
		}else if(e.getSource()==telainicial.getPesquisarAlunoButton()) {
			new TelaPesquisaAluno();
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}
