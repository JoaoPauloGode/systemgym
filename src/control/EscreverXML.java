package control;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.Aluno;
import model.ListaDeAlunos;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class EscreverXML {

	public static XStream xstream = new XStream(new DomDriver());
	public ListaDeAlunos listaDeAlunos;

	public EscreverXML(ListaDeAlunos listaDeAlunos) {
		this.listaDeAlunos=listaDeAlunos;
		xstream.autodetectAnnotations(true);
	}

	public ArrayList<Aluno> buscarXML() {
		ListaDeAlunos listaDeAlunos=new ListaDeAlunos();
		try {
			FileReader ler = new FileReader(new File("D:\\Workspace2\\System-gym2Xml\\file\\listaDeAlunos.xml"));

			XStream xstream = new XStream(new DomDriver());

			xstream.alias("ListaDeAlunos", ListaDeAlunos.class);
			xstream.alias("Alunos", Aluno.class);
			ListaDeAlunos listaDeAlunos1 = (ListaDeAlunos) xstream.fromXML(ler);
			listaDeAlunos=listaDeAlunos1;
		} catch (FileNotFoundException e) {
			System.out.println("Arquivo XML não encontrado");
			gerarXML();
		}

		return listaDeAlunos.listaAlunos;
	}

	public void gerarXML() {

		String xml; 

		xml= xstream.toXML(listaDeAlunos);

		PrintWriter print = null;

		try {
			File file = new File("D:\\Workspace2\\System-gym2Xml\\file\\listaDeAlunos.xml");

			print = new PrintWriter(file);

			print.write(xml);
			print.flush();
			print.close();

		}
		catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Arquivo XML não encontrado, conferir diretórios das classes EscreverXml e Escritora");
		}
	}
}
