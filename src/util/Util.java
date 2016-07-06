package util;

import javax.swing.text.MaskFormatter;

public class Util {

	public static String tratadoraDeData(String a) {
		String data = a;
		try {
			data = data.substring(0, 2) + "/" + data.substring(2, 4) + "/" + data.substring(4, 8);
		} catch (Exception e) {
			return data = "##/##/####";
		}
		return data;
	}

	public static String tratadoraDeCPF(String a) {
		String cpf = a;
		try {
			cpf = cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-"
					+ cpf.substring(9, 11);
		} catch (Exception e) {
			return cpf = "###.###.###-##";
		}
		return cpf;
	}

	public static String tratadoraDeTelefone(String a) {
		String telefone = a;
		try {
			telefone = "(" + telefone.substring(0, 2) + ")" + telefone.substring(2, 3) + "." + telefone.substring(3, 7)
					+ "-" + telefone.substring(7, 11);
		} catch (Exception e) {
			return telefone = "(##)#.####-####";
		}
		return telefone;
	}

	public static MaskFormatter Mascara(String Mascara) {
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
