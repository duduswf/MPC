//Eduardo Luiz Pontes de Souza - UC19100270
package projeto_mpc.mpc;

import projeto_mpc.mpc.Background_image.Image;
import projeto_mpc.mpc.View.View;
import projeto_mpc.mpc.View.Util;

public class Executora {

	public static void main(String[] args) {

		new Image(); // Chamando a fun��o da imagem de plano de fundo para o programa

		MinhaPrimeiraCasa c = new MinhaPrimeiraCasa();
		c.setNome("Minha Crimeira Casa"); // Criando imobili�ria e cabe�alho do programa

		int opcaoMenu = 0; // Vari�vel de escolha para os menus

		// Fun��o primeiro Menu do sistema
		while (true) {
			try {
				opcaoMenu = Util.menu(opcaoMenu);
			} catch (Exception e) { // Exception caso seja inserido um outro tipo que n�o int no menu principal
				View.exibirErro("[MENU PRINCIPAL]: Insira apenas n�meros", "Erro detectado pelo sistema");
			}

			switch (opcaoMenu) {

			// Primeiro menu op��o 1, leva ao submenu de cadastro
			case 1:
				try {
					opcaoMenu = Util.menuCadastro(opcaoMenu);

					if (opcaoMenu < 1 || opcaoMenu > 5) { // Exception caso um n�mero inv�lido (menor que 1 ou maior que
															// 5) seja inserido
						View.exibirErro("[MENU PRINCIPAL]: Insira um digito v�lido (1 - 5).",
								"Erro detectado pelo sistema");
						opcaoMenu = 4; // Op��o voltar ao menu acionada automaticamente
					}
				} catch (Exception e) { // Exception caso seja inserido um outro tipo que n�o int no menu cadastrar
										// im�veis no sistema
					View.exibirErro("[MENU PRINCIPAL]: Insira apenas n�meros.", "Erro detectado pelo sistema");
					opcaoMenu = 4; // Op��o voltar ao menu acionada automaticamente
				}

				switch (opcaoMenu) { // Submenu da primeira op��o do menu principal

				case 1: // Fun��o Cadastrar im�veis no sistema case 1, cadastro de funcion�rio no
						// sistema
					try {
						int idF = View.inserirInt("Insira um ID para o funcion�rio: ",
								"Cadastro de informa��es do funcion�rio");
						String nomeF = View.inserirString("Insira o nome completo do funcion�rio: ",
								"Cadastro de informa��es do funcion�rio");
						String cpfF = View.inserirString("Insira o CPF do funcion�rio: ",
								"Cadastro de informa��es do funcion�rio");
						String telF = View.inserirString("Insira o n�mero de celular ou fixo do funcion�rio: ",
								"Cadastro de informa��es do funcion�rio");
						String emailF = View.inserirString("Insira o e-mail do funcion�rio: ",
								"Cadastro de informa��es do funcion�rio");
						Funcionario funcionario = new Funcionario(idF, nomeF, cpfF, telF, emailF); // Criando
																									// funcion�rio
						Util.CadastrarFuncionario(funcionario);
					} catch (Exception e) { // Exception caso seja inserido uma informa��o n�o condizente na cria��o do
											// funcion�rio
						View.exibirErro(
								"[CADASTRO DE INFORMA��ES DO FUNCION�RIO]: ID ou nome do funcion�rio inv�lido, tente novamente.",
								"Erro detectado pelo sistema");
					}
					break;

				case 2: // Fun��o Cadastrar im�veis no sistema case 2, cadastro de propriet�rio ou
						// corretor do im�vel
					try {
						int cpfD = View.inserirInt("Insira o CPF do propriet�rio ou corretor respons�vel pelo im�vel: ",
								"Cadastro de informa��es do propriet�rio ou corretor de im�vel");
						String nomeD = View.inserirString(
								"Insira o nome completo do propriet�rio ou corretor respons�vel pelo im�vel: ",
								"Cadastro de informa��es do propriet�rio ou corretor de im�vel");
						String telD = View.inserirString(
								"Insira o n�mero de celular ou fixo do propriet�rio ou corretor respons�vel pelo im�vel: ",
								"Cadastro de informa��es do propriet�rio ou corretor de im�vel");
						String descD = View.inserirString(
								"Insira uma breve descri��o do propriet�rio ou corretor respons�vel pelo im�vel (hor�rios dispon�veis pra visita, etc.): ",
								"Cadastro de informa��es do propriet�rio ou corretor de im�vel");
						String emailD = View.inserirString(
								"Insira o e-mail do propriet�rio ou corretor respons�vel pelo im�vel: ",
								"Cadastro de informa��es do propriet�rio ou corretor de im�vel");
						Proprietario proprietario = new Proprietario(cpfD, nomeD, telD, descD, emailD); // Criando
																										// propriet�rio
						Util.cadastrarProprietario(proprietario);
					} catch (Exception e) { // Exception caso seja inserido uma informa��o n�o condizente na cria��o do
											// propriet�rio
						View.exibirErro(
								"[CADASTRO DE INFORMA��ES DO PROPRIET�RIO OU CORRETOR DE IM�VEL]: Alguma informa��o n�o � v�lida, tente novamente.",
								"Erro detectado pelo sistema");
					}
					break;

				case 3: // Fun��o Cadastrar im�veis no sistema case 3, cadastro de informa��es do im�vel
					try {
						int mat = View.inserirInt("Insira o ID do funcion�rio respons�vel pelo cadastramento: ",
								"Cadastro de informa��es do im�vel");
						int matFuncionario = (mat);
						int concatImovel = (View.inserirInt(
								"Insira o CPF do propriet�rio ou corretor respons�vel pelo im�vel: ",
								"Cadastro de informa��es do im�vel"));

						if (Util.funcionarioExiste(matFuncionario) && Util.proprietarioExiste(concatImovel)) {
							String enderecoI = View.inserirString("Insira o endere�o do im�vel: ",
									"Cadastro de informa��es do im�vel");
							int numCepI = View.inserirInt("Insira o n�mero do CEP do im�vel: ",
									"Cadastro de informa��es do im�vel");
							int numSuiteI = View.inserirInt("Insira o n�mero de su�tes do im�vel: ",
									"Cadastro de informa��es do im�vel");
							int numQuartoI = View.inserirInt("Insira o n�mero de quartos do im�vel: ",
									"Cadastro de informa��es do im�vel");
							int numBanheiroI = View.inserirInt("Insira o n�mero de banheiros do im�vel: ",
									"Cadastro de informa��es do im�vel");
							String descI = View.inserirString("Insira uma breve descri��o do im�vel: ",
									"Cadastro de informa��es do im�vel");
							float valorI = View.inserirFloat("Insira o valor do im�vel: R$",
									"Cadastro de informa��es do im�vel");

							Imovel imovel = new Imovel(enderecoI, numCepI, numSuiteI, numQuartoI, numBanheiroI, descI,
									valorI, concatImovel);
							Util.cadastrarImovel(imovel);
						} else {
							View.exibirMensagem("Funcion�rio ou propriet�rio n�o encontrado no sistema.");
						}
					} catch (Exception e) {
						View.exibirErro(
								"[CADASTRO DE INFORMA��ES DO IM�VEL]: Alguma informa��o n�o � v�lida, tente novamente.",
								"Erro detectado pelo sistema");
					}
					break;

				case 4: // Fun��o dedicada a voltar ao menu principal
					break;

				case 5: // Fun��o dedicada a sair do programa
					System.exit(0);
					break;

				default:
					View.exibirMensagem("[DEFAULT SUBMENU CADASTRAR]: Digite um n�mero v�lido, tente novamente.");
					break;
				}
				break;

			// Primeiro menu op��o 2, leva ao submenu de edi��o de cadastro
			case 2:
				opcaoMenu = View.inserirMenu(c.getNome() + "\n\n Editar cadastro de im�veis do sistema \n\n"
						+ "1. Editar informa��es de funcion�rios cadastrados no sistema \n"
						+ "2. Editar informa��es do propriet�rio ou corretor de im�veis cadastrados no sistema \n"
						+ "3. Editar informa��es de im�veis cadastrados no sistema \n" + "4. Voltar ao menu \n"
						+ "5. Sair do programa");

				switch (opcaoMenu) {

				case 1: // Fun��o para editar informa��es de funcion�rios cadastrados no sistema
					Funcionario auxFuncionario = Util
							.pesquisarFuncionario(View.inserirInt("Insira o ID do funcion�rio a ser editado: ",
									"Editar cadastro de informa��es do funcion�rio"));
					if (auxFuncionario == null) {
						View.exibirErro("ID do Funcion�rio n�o encontrada no sistema!", "Erro detectado pelo sistema");
					} else {
						View.exibirMensagem(
								"Funcion�rio " + auxFuncionario.getNomeFuncionario() + " encontrado no sistema!");
						int newIdF = View.inserirInt("Insira um novo ID para o funcion�rio a ser editado: ",
								"Editar cadastro de informa��es do funcion�rio");
						String newNomeF = View.inserirString("Insira um novo nome para o funcion�rio a ser editado: ",
								"Editar cadastro de informa��es do funcion�rio");
						String newCpfF = View.inserirString("Insira um novo CPF para o funcion�rio a ser editado: ",
								"Editar cadastro de informa��es do funcion�rio");
						String newTelF = View.inserirString(
								"Insira um novo n�mero de celular ou fixo para o funcion�rio a ser editado: ",
								"Editar cadastro de informa��es do funcion�rio");
						String newEmailF = View.inserirString(
								"Insira um novo e-mail para o funcion�rio a ser editado: ",
								"Editar cadastro de informa��es do funcion�rio");

						Funcionario auxF2 = new Funcionario(newIdF, newNomeF, newCpfF, newTelF, newEmailF);
						Util.removerFuncionarioAnterior(auxFuncionario);
						Util.CadastrarFuncionario(auxF2);
					}
					break;

				case 2: // Fun��o para editar informa��es de propriet�rios ou corretores cadastrados no
						// sistema

					Proprietario auxProprietario = Util.pesquisarProprietario(View.inserirInt(
							"Insira o CPF do propriet�rio ou corretor respons�vel pelo im�vel a ser editado: ",
							"Editar cadastro de informa��es do propriet�rio ou corretor de im�vel"));
					if (auxProprietario == null) {
						View.exibirErro(
								"CPF do propriet�rio ou corretor respons�vel pelo im�vel n�o encontrada no sistema!",
								"Erro detectado pelo sistema");
					} else {
						View.exibirMensagem("Propriet�rio ou corretor respons�vel pelo im�vel "
								+ auxProprietario.getNomeDono() + " encontrado no sistema!");
						int newCpfD = View.inserirInt(
								"Insira um novo CPF para o propriet�rio ou corretor respons�vel pelo im�vel: ",
								"Editar cadastro de informa��es do propriet�rio ou corretor de im�vel");
						String newNomeD = View.inserirString(
								"Insira um novo nome completo para o propriet�rio ou corretor respons�vel pelo im�vel: ",
								"Editar cadastro de informa��es do propriet�rio ou corretor de im�vel");
						String newTelD = View.inserirString(
								"Insira um novo n�mero de celular ou fixo para o  propriet�rio ou corretor respons�vel pelo im�vel: ",
								"Editar cadastro de informa��es do propriet�rio ou corretor de im�vel");
						String newDescD = View.inserirString(
								"Insira uma nova breve descri��o do propriet�rio ou corretor respons�vel pelo im�vel (hor�rios dispon�veis pra visita, etc.): ",
								"Editar cadastro de informa��es do propriet�rio ou corretor de im�vel");
						String newEmailD = View.inserirString(
								"Insira um novo e-mail para o propriet�rio ou corretor respons�vel pelo im�vel: ",
								"Editar cadastro de informa��es do propriet�rio ou corretor de im�vel");
						Proprietario auxP2 = new Proprietario(newCpfD, newNomeD, newTelD, newDescD, newEmailD);
						Util.removerProprietarioAnterior(auxP2);
						Util.cadastrarProprietario(auxP2);
					}
					break;

				case 3: // Fun��o para editar informa��es de im�veis cadastrados no sistema
					Imovel auxImovel = Util.pesquisarImovel(View.inserirInt("Insira o CEP do im�vel a ser editado: ",
							"Editar cadastro de informa��es do im�vel"));
					if (auxImovel == null) {
						View.exibirErro("CEP do im�vel n�o encontrada no sistema!", "Erro detectado pelo sistema");
					} else {
						View.exibirMensagem("Im�vel " + auxImovel.getNumCepImovel() + " encontrado no sistema!");
						String newEnderecoI = View.inserirString("Insira um novo endere�o para o im�vel: ",
								"Editar cadastro de informa��es do im�vel");
						int newNumCepI = View.inserirInt("Insira um novo CEP para o im�vel: ",
								"Editar cadastro de informa��es do im�vel");
						int newNumSuiteI = View.inserirInt("Insira um novo n�mero de su�tes para o im�vel: ",
								"Editar cadastro de informa��es do im�vel");
						int newNumQuartoI = View.inserirInt("Insira um novo n�mero de quartos para o im�vel: ",
								"Editar cadastro de informa��es do im�vel");
						int newNumBanheiroI = View.inserirInt("Insira um novo n�mero de banheiros para o im�vel: ",
								"Editar cadastro de informa��es do im�vel");
						String newDescI = View.inserirString("Insira uma nova breve descri��o para o im�vel: ",
								"Editar cadastro de informa��es do im�vel");
						float newValorI = View.inserirInt("Insira um novo valor para o im�vel: R$",
								"Editar cadastro de informa��es do im�vel");
						int newCpfD = View.inserirInt("Insira um novo CPF para o propriet�rio ou corretor do im�vel: ",
								"Editar cadastro de informa��es do im�vel");
						Imovel auxI2 = new Imovel(newEnderecoI, newNumCepI, newNumSuiteI, newNumQuartoI,
								newNumBanheiroI, newDescI, newValorI, newCpfD);
						Util.removerImovelAnterior(auxI2);
						Util.cadastrarImovel(auxI2);
					}
					break;

				case 4: // Fun��o dedicada a voltar ao menu principal
					break;

				case 5: // Fun��o dedicada a sair do programa
					System.exit(0);
					break;

				default:
					View.exibirMensagem("[DEFAULT SUBMENU EDITAR]: Digite um n�mero v�lido, tente novamente.");
				}
				break;

			// Primeiro menu op��o 3, leva ao submenu de pesquisa de cadastro
			case 3:
				opcaoMenu = View.inserirMenu(c.getNome().toString()
						+ "\n\n Pesquisar cadastro de im�veis do sistema \n\n"
						+ "1. Pesquisar informa��es de funcion�rios cadastrados no sistema \n"
						+ "2. Pesquisar informa��es do propriet�rio ou corretor de im�veis cadastrados no sistema \n"
						+ "3. Pesquisar informa��es de im�veis cadastrados no sistema \n" + "4. Voltar ao menu \n"
						+ "5. Sair do programa");

				switch (opcaoMenu) {

				case 1: // Fun��o para pesquisar informa��es de funcion�rios cadastrados no sistema
					Funcionario auxFuncionario = Util
							.pesquisarFuncionario(View.inserirInt("Insira o ID do funcion�rio a ser pesquisado: ",
									"Pesquisar cadastro de informa��es do funcion�rio"));
					if (auxFuncionario == null) {
						View.exibirErro("ID do Funcion�rio n�o encontrada no sistema!", "Erro detectado pelo sistema");
					} else {
						View.exibirMensagem(
								"Funcion�rio " + auxFuncionario.getNomeFuncionario() + " encontrado no sistema!");
					}
					break;

				case 2: // Fun��o para pesquisar informa��es de propriet�rios ou corretores cadastrados
						// no sistema
					Proprietario auxProprietario = Util.pesquisarProprietario(View.inserirInt(
							"Insira o CPF do propriet�rio ou corretor respons�vel pelo im�vel a ser pesquisado: ",
							"Pesquisar cadastro de informa��es de propriet�rios ou corretores"));
					if (auxProprietario == null) {
						View.exibirErro(
								"CPF do propriet�rio ou corretor respons�vel pelo im�vel n�o encontrada no sistema!",
								"Erro detectado pelo sistema");
					} else {
						View.exibirMensagem("Propriet�rio ou corretor respons�vel pelo im�vel "
								+ auxProprietario.getNomeDono() + " encontrado no sistema!");
					}
					break;

				case 3: // Fun��o para pesquisar informa��es de im�veis cadastrados no sistema
					Imovel auxImovel = Util.pesquisarImovel(View.inserirInt("Insira o CEP do im�vel a ser editado: ",
							"Editar cadastro de informa��es do im�vel"));
					if (auxImovel == null) {
						View.exibirErro("CEP do im�vel n�o encontrada no sistema!", "Erro detectado pelo sistema");
					} else {
						View.exibirMensagem("Im�vel " + auxImovel.getNumCepImovel() + " encontrado no sistema!");
					}
					break;

				case 4: // Fun��o dedicada a voltar ao menu principal
					break;

				case 5: // Fun��o dedicada a sair do programa
					System.exit(0);
					break;

				default:
					View.exibirMensagem("[DEFAULT SUBMENU EDITAR]: Digite um n�mero v�lido, tente novamente.");
				}
				break;

			// Primeiro menu op��o 4, leva ao submenu de listagem
			case 4:
				opcaoMenu = View.inserirMenu(c.getNome().toString() + "\n\n Listar cadastro de im�veis do sistema \n\n"
						+ "1. Listar informa��es de funcion�rios cadastrados no sistema \n"
						+ "2. Listar informa��es do propriet�rio ou corretor de im�veis cadastrados no sistema \n"
						+ "3. Listar informa��es de im�veis cadastrados no sistema \n" + "4. Voltar ao menu \n"
						+ "5. Sair do programa");

				switch (opcaoMenu) {

				case 1: // Fun��o listar funcion�rios do sistema
					View.exibirMensagem(Util.listarFuncionarios());
					Util.list = "";
					break;
				case 2: // Fun��o listar propriet�rios ou corretores respons�veis por im�veis do sistema
					View.exibirMensagem(Util.listarProprietarios());
					Util.list = "";
					break;
				case 3: // Fun��o listar im�veis do sistema
					View.exibirMensagem(Util.listarImoveis());
					Util.list = "";
					break;

				case 4: // Fun��o dedicada a voltar ao menu principal
					break;

				case 5: // Fun��o dedicada a sair do programa
					System.exit(0);
					break;

				default:
					View.exibirMensagem("[DEFAULT SUBMENU EDITAR]: Digite um n�mero v�lido, tente novamente.");
				}
				break;

			// Primeiro menu op��o 5, leva ao submenu de exclus�o
			case 5:
				opcaoMenu = View.inserirMenu(c.getNome().toString() + "\n\n Excluir cadastro de im�veis do sistema \n\n"
						+ "1. Excluir informa��es de funcion�rios cadastrados no sistema \n"
						+ "2. Excluir informa��es do propriet�rio ou corretor de im�veis cadastrados no sistema \n"
						+ "3. Excluir informa��es de im�veis cadastrados no sistema \n" + "4. Voltar ao menu \n"
						+ "5. Sair do programa");

				switch (opcaoMenu) {

				case 1: // Fun��o excluir funcion�rios do sistema
					int auxIdFuncionario = View.inserirInt("Insira o ID do funcion�rio a ser exclu�do: ",
							"Excluir cadastro de informa��es do funcion�rio");
					Funcionario auxFuncionario = Util.pesquisarFuncionario(auxIdFuncionario);
					if (auxFuncionario == null) {
						View.exibirErro("ID do Funcion�rio n�o encontrada no sistema!", "Erro detectado pelo sistema");
					} else {
						String auxNomeFuncionario = auxFuncionario.getNomeFuncionario();
						Util.removerFuncionarioAnterior(auxFuncionario);
						View.exibirMensagem(
								"Funcion�rio " + auxNomeFuncionario + " encontrado no sistema e exclu�do com sucesso!");
					}
					break;

				case 2: // Fun��o excluir propriet�rios ou corretores respons�veis por im�veis do
						// sistema
					int auxCpfProprietario = View.inserirInt(
							"Insira o CPF do propriet�rio ou corretor respons�vel pelo im�vel a ser exclu�do: ",
							"Excluir cadastro de informa��es do propriet�rio ou corretor de im�vel");
					Proprietario auxProprietario = Util.pesquisarProprietario(auxCpfProprietario);
					if (auxProprietario == null) {
						View.exibirErro(
								"CPF do propriet�rio ou corretor respons�vel pelo im�vel n�o encontrada no sistema!",
								"Erro detectado pelo sistema");
					} else {
						String auxNomeProprietario = auxProprietario.getNomeDono();
						Util.removerProprietarioAnterior(auxProprietario);
						View.exibirMensagem("Propriet�rio ou corretor respons�vel " + auxNomeProprietario
								+ " encontrado no sistema e exclu�do com sucesso!");
					}
					break;

				case 3: // Fun��o excluir im�veis do sistema
					int auxCepImovel = View.inserirInt("Insira o CEP do im�vel a ser exclu�do: ",
							"Excluir cadastro de informa��es do funcion�rio");
					Imovel auxImovel = Util.pesquisarImovel(auxCepImovel);
					if (auxImovel == null) {
						View.exibirErro("CEP do im�vel n�o encontrada no sistema!", "Erro detectado pelo sistema");
					} else {
						String auxEnderecoImovel = auxImovel.getEnderecoImovel();
						Util.removerImovelAnterior(auxImovel);
						View.exibirMensagem("Im�vel do endere�o " + auxEnderecoImovel
								+ " encontrado no sistema e exclu�do com sucesso!");
					}
					break;

				case 4: // Fun��o dedicada a voltar ao menu principal
					break;

				case 5: // Fun��o dedicada a sair do programa
					System.exit(0);
					break;

				default:
					View.exibirMensagem("[DEFAULT SUBMENU EDITAR]: Digite um n�mero v�lido, tente novamente.");
				}
				break;

			// Primeiro menu op��o 6, leva ao submenu de exclus�o geral
			case 6:
				opcaoMenu = View.inserirMenu(c.getNome().toString()
						+ "\n\n Exclus�o geral de informa��es cadastradas de im�veis do sistema \n\n"
						+ "1. Excluir todas as  informa��es de funcion�rios cadastrados no sistema \n"
						+ "2. Excluir todas as informa��es do propriet�rio ou corretor de im�veis cadastrados no sistema \n"
						+ "3. Excluir todas as informa��es de im�veis cadastrados no sistema \n"
						+ "4. Voltar ao menu \n" + "5. Sair do programa");

				switch (opcaoMenu) {

				case 1: // Fun��o excluir todas as informa��es de funcion�rios do sistema
					Util.removerAllFuncionario();
					View.exibirMensagem("Funcion�rios encontrados no sistema exclu�dos com sucesso!");
					break;

				case 2:
					Util.removerAllProprietario();
					View.exibirMensagem("Proprietarios encontrados no sistema exclu�dos com sucesso!");
					break;

				case 3:
					Util.removerAllImovel();
					View.exibirMensagem("Im�veis encontrados no sistema exclu�dos com sucesso!");
					break;

				case 4: // Fun��o dedicada a voltar ao menu principal
					break;

				case 5: // Fun��o dedicada a sair do programa
					System.exit(0);
					break;

				default:
					View.exibirMensagem("[DEFAULT SUBMENU EDITAR]: Digite um n�mero v�lido, tente novamente.");
				}
				break;

			case 7:
				View.exibirMensagem("Obrigado por usar o sistema Minha Primeira Casa, volte sempre!"
						+ "\n\n Programa desenvolvido por Eduardo Luiz Pontes de Souza - UC19100270");
				System.exit(0);
				break;
			default:
				break;
			}
		}
	}
}