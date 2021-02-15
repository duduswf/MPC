//Eduardo Luiz Pontes de Souza - UC19100270
package projeto_mpc.mpc.View;

import projeto_mpc.mpc.Funcionario;
import projeto_mpc.mpc.Imovel;
import projeto_mpc.mpc.MinhaPrimeiraCasa;
import projeto_mpc.mpc.Proprietario;

import java.util.ArrayList;

public class Util {

	public static String list = ""; // Vari�vel de listagem

	public static MinhaPrimeiraCasa cabecalho = new MinhaPrimeiraCasa(
			"Sistema de cadastramento imobili�rio Minha Primeira Casa"); // Cabe�alho do programa

	// Primeiro Menu
	public static int menu(int menu) {
		int opcao = View.inserirMenu(cabecalho.getNome() + "\n\n Menu Principal \n\n" + "1. Cadastrar no sistema \n"
				+ "2. Editar cadastros do sistema \n" + "3. Pesquisar cadastro no sistema\n"
				+ "4. Listar cadastrados no sistema \n" + "5. Excluir cadastro do sistema \n"
				+ "6. Excluir todos os cadastrados no sistema \n" + "7. Sair do programa");
		return opcao;
	}

	// Menu da op��o 1, cadastrar no sistema
	public static int menuCadastro(int menu) {
		int opcao = View.inserirMenu(cabecalho.getNome() + "\n\n Cadastrar no sistema \n\n"
				+ "1. Cadastrar funcion�rio \n" + "2. Cadastrar propriet�rio ou corretor do im�vel \n"
				+ "3. Cadastrar informa��es do im�vel \n" + "4. Voltar ao menu principal \n" + "5. Sair do programa");
		return opcao;
	}

	// Cria��o de Array lists
	private static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>(); // Array para a cria��o de
																						// funcion�rios
	private static ArrayList<Proprietario> proprietarios = new ArrayList<Proprietario>(); // Array para a cria��o de
																							// propriet�rios
	private static ArrayList<Imovel> imoveis = new ArrayList<Imovel>(); // Array para a cria��o de im�veis

	// Cadastrar funcion�rio
	public static void CadastrarFuncionario(Funcionario funcionarios) {
		Util.funcionarios.add(funcionarios);
	}

	// Fun��o dedicada a listar funcion�rios presentes no sistema
	public static String listarFuncionarios() {
		list = "";
		for (int i = 0; i < funcionarios.size(); i++) {
			list += "ID do funcion�rio: " + ((Funcionario) funcionarios.get(i)).getIdFuncionario()
					+ "\n Nome do funcion�rio: " + ((Funcionario) funcionarios.get(i)).getNomeFuncionario()
					+ "\n CPF do funcion�rio: " + ((Funcionario) funcionarios.get(i)).getCpfFuncionario()
					+ "\n Telefone de contato do funcion�rio: "
					+ ((Funcionario) funcionarios.get(i)).getTelFuncionario() + "\n E-mail do funcion�rio: "
					+ ((Funcionario) funcionarios.get(i)).getEmailFuncionario() + "\n\n";
		}
		return list;
	}

	// Pesquisar funcion�rios cadastrados para editar
	public static Funcionario pesquisarFuncionario(int idFuncionario) {
		for (int i = 0; i < funcionarios.size(); i++) {
			if (((Funcionario) funcionarios.get(i)).getIdFuncionario() == idFuncionario) {
				return (Funcionario) funcionarios.get(i);
			}
		}
		return null;
	}

	// Fun��o dedicada a remover funcion�rios antigos depois de editar novos
	public static void removerFuncionarioAnterior(Funcionario idFuncionario) {
		funcionarios.remove(idFuncionario);
	}

	// Fun��o dedicada a excluir todas as informa��es referentes aos funcion�rios
	// cadastrados no sistema
	public static void removerAllFuncionario() {
		funcionarios.clear();
	}

	// Cadastrar propriet�rios respons�veis pelos im�veis
	public static void cadastrarProprietario(Proprietario proprietarios) {
		Util.proprietarios.add(proprietarios);
	}

	// Fun��o dedicada a listar propriet�rios ou corretores respons�veis por im�veis
	// presentes no sistema
	public static String listarProprietarios() {
		for (int i = 0; i < proprietarios.size(); i++) {
			Proprietario auxLP = (Proprietario) proprietarios.get(i);
			list += "\n CPF do propriet�rio ou corretor: " + auxLP.getCpfDono()
					+ "\n Nome completo do propriet�rio ou corretor: " + auxLP.getNomeDono()
					+ "\n Telefone de contato do propriet�rios ou corretor: " + auxLP.getTelDono() + "\n Descri��o: "
					+ auxLP.getDescDono() + "\n E-mail do propriet�rio ou corretor: " + auxLP.getEmailDono() + "\n\n";
		}
		return list;
	}

	// Pesquisar propriet�rios cadastrados para editar
	public static Proprietario pesquisarProprietario(int cpfDono) {
		for (int i = 0; i < proprietarios.size(); i++) {
			if (((Proprietario) proprietarios.get(i)).getCpfDono() == cpfDono) {
				return (Proprietario) proprietarios.get(i);
			}
		}
		return null;
	}

	// Fun��o dedicada a remover propriet�rios antigos depois de editar novos
	public static void removerProprietarioAnterior(Proprietario cpfDono) {
		proprietarios.remove(cpfDono);
	}

	// Fun��o dedicada a excluir todas as informa��es referentes aos propriet�rios
	// ou corretores respons�veis por im�veis cadastrados no sistema
	public static void removerAllProprietario() {
		proprietarios.clear();
	}

	// Cadastrar im�vel no sistema
	public static void cadastrarImovel(Imovel imoveis) {
		Util.imoveis.add(imoveis);
	}

	// Fun��o dedicada a listar im�veis presentes no sistema
	public static String listarImoveis() {
		for (int i = 0; i < imoveis.size(); i++) {
			Imovel auxLI = (Imovel) imoveis.get(i);
			list += "\n\n Endere�o do im�vel: " + auxLI.getEnderecoImovel() + "\n CEP do im�vel: "
					+ auxLI.getNumCepImovel() + "\n N�mero de su�tes do im�vel: " + auxLI.getNumSuiteImovel()
					+ "\n N�mero de quartos do im�vel: " + auxLI.getNumQuartoImovel()
					+ "\n N�mero de banheiros do im�vel: " + auxLI.getNumBanheiroImovel() + "\n Descri��o do im�vel: "
					+ auxLI.getDescImovel() + "\n CPF do propriet�rio ou corretor respons�vel pelo im�vel: "
					+ auxLI.getCpfDonoI() + "\n Valor do im�vel: R$" + auxLI.getValorImovel() + "\n\n\n";
		}
		return list;
	}

	// Fun��o para verificar se o funcion�rio respons�vel pelo cadastro � v�lido e
	// existe no sistema
	public static boolean funcionarioExiste(int matFuncionario) {
		for (int i = 0; i < funcionarios.size(); i++) {
			if (matFuncionario == ((Funcionario) funcionarios.get(i)).getIdFuncionario()) {
				return true;
			}
		}
		return false;
	}

	// Fun��o para verificar se o propriet�rio ou corretor do im�vel � v�lido e
	// existe no sistema
	public static boolean proprietarioExiste(int cpfDono) {
		for (int i = 0; i < proprietarios.size(); i++) {
			if (cpfDono == ((Proprietario) proprietarios.get(i)).getCpfDono()) {
				return true;
			}
		}
		return false;
	}

	// Pesquisar im�veis cadastrados para editar
	public static Imovel pesquisarImovel(int numCepImovel) {
		for (int i = 0; i < imoveis.size(); i++) {
			if (((Imovel) imoveis.get(i)).getNumCepImovel() == numCepImovel) {
				return (Imovel) imoveis.get(i);
			}
		}
		return null;
	}

	// Fun��o dedicada a remover im�veis antigos depois de editar novos
	public static void removerImovelAnterior(Imovel numCepImovel) {
		imoveis.remove(numCepImovel);
	}

	// Fun��o dedicada a excluir todas as informa��es referentes aos im�veis
	// cadastrados no sistema
	public static void removerAllImovel() {
		imoveis.clear();
	}
}
