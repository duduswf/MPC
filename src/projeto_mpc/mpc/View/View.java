//Eduardo Luiz Pontes de Souza - UC19100270
package projeto_mpc.mpc.View;

import javax.swing.JOptionPane;

public class View {

	// Automa��o do menu
	public static int inserirMenu(String corpo) {
		String retorno = JOptionPane.showInputDialog(null, corpo);
		return Integer.parseInt(retorno);
	}

	// Automa��o de strings
	public static String inserirString(String corpo, String titulo) {
		return JOptionPane.showInputDialog(null, corpo, titulo, JOptionPane.DEFAULT_OPTION);
	}

	// Automa��o de inteiros
	public static int inserirInt(String corpo, String titulo) {
		String retorno = JOptionPane.showInputDialog(null, corpo, titulo, JOptionPane.DEFAULT_OPTION);
		return Integer.parseInt(retorno);
	}

	// Automa��o de mensagens do sistema
	public static void exibirMensagem(String corpo) {
		JOptionPane.showMessageDialog(null, corpo);
	}

	// Automa��o de mensagens de erro
	public static void exibirErro(String corpo, String titulo) {
		JOptionPane.showMessageDialog(null, corpo, titulo, JOptionPane.ERROR_MESSAGE);
	}

	// Automa��o de floats
	public static float inserirFloat(String corpo, String titulo) {
		String retorno = JOptionPane.showInputDialog(null, corpo, titulo, JOptionPane.DEFAULT_OPTION);
		return Float.parseFloat(retorno);
	}

}
