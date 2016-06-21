package control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import view.TelaCadastroAluno;
import view.TelaInicial;
import view.TelaListaAlunos;
import view.TelaPagamento;
import view.TelaPesquisaAluno;
import view.TelaQuitaMensalidade;
import view.TelaRemoverAluno;
import view.TelaVenda;

public class ButtonHandler implements MouseListener {

	TelaInicial telainicial;
	TelaCadastroAluno telaCadastroAluno;
	TelaRemoverAluno telaRemoverAluno;
	TelaVenda telaVenda;
	TelaPagamento telaPagamento;
	TelaPesquisaAluno telaPesquisaAluno;
	TelaQuitaMensalidade telaQuitaMensalidade;

	public ButtonHandler(TelaInicial telainicial) {
		this.telainicial=telainicial;
	}

	public ButtonHandler(TelaCadastroAluno telaCadastroAluno) {
		this.telaCadastroAluno = telaCadastroAluno;
	}

	public ButtonHandler(TelaRemoverAluno telaRemoverAluno) {
		this.telaRemoverAluno = telaRemoverAluno;
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
	
	public ButtonHandler(TelaQuitaMensalidade telaQuitaMensalidade) {
		this.telaQuitaMensalidade=telaQuitaMensalidade;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==telainicial.getCadastrarAlunoButton()) {
			new TelaCadastroAluno();
		}else if(e.getSource()==telainicial.getRemoverAlunoButton()) {
			new TelaRemoverAluno();
		}else if(e.getSource()==telainicial.getListarAlunoButton()) {
				try {
					new TelaListaAlunos();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
		}else if(e.getSource()==telainicial.getRealizarVendaButton()) {
			new TelaVenda();
		}else if(e.getSource()==telainicial.getRealizarPagamentoButton()) {
			new TelaPagamento();
		}else if(e.getSource()==telainicial.getPesquisarAlunoButton()) {
			new TelaPesquisaAluno();
		}else if(e.getSource()==telainicial.getQuitarMensalidadeButton()) {
			new TelaQuitaMensalidade();
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
