package control;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;

import view.TelaCadastroAluno;
import view.TelaInicial;
import view.TelaListaAlunos;
import view.TelaListaMensalidades;
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
	TelaListaMensalidades telaListaMensalidades;

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

	public ButtonHandler(TelaListaMensalidades telaListaMensalidades) {
		this.telaListaMensalidades=telaListaMensalidades;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()==telainicial.getCadastrarAlunoButton()) {
			new TelaCadastroAluno();
		}else if(e.getSource()==telainicial.getRemoverAlunoButton()) {
			new TelaRemoverAluno();
		}else if(e.getSource()==telainicial.getListarAlunoButton()) {
			new TelaListaAlunos();
		}else if(e.getSource()==telainicial.getRealizarVendaButton()) {
			new TelaVenda();
		}else if(e.getSource()==telainicial.getRealizarPagamentoButton()) {
			new TelaPagamento();
		}else if(e.getSource()==telainicial.getPesquisarAlunoButton()) {
			new TelaPesquisaAluno();
		}else if(e.getSource()==telainicial.getQuitarMensalidadeButton()) {
			new TelaQuitaMensalidade();
		}else if(e.getSource()==telainicial.getListarMensalidadesButton()) {
			try {
				new TelaListaMensalidades();
			} catch (SQLException e1) {
				e1.printStackTrace();
			} catch (Exception e1) {
				e1.printStackTrace();
			}
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
