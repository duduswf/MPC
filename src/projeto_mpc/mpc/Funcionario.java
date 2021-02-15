//Eduardo Luiz Pontes de Souza - UC19100270
package projeto_mpc.mpc;

public class Funcionario {

	// Atributos
	private int idFuncionario;
	private String nomeFuncionario;
	private String cpfFuncionario;
	private String telFuncionario;
	private String emailFuncionario;

	// Construtores
	Funcionario(int idFuncionario, String nomeFuncionario, String cpfFuncionario, String telFuncionario,
			String emailFuncionario) {
		setIdFuncionario(idFuncionario);
		setNomeFuncionario(nomeFuncionario);
		setCpfFuncionario(cpfFuncionario);
		setTelFuncionario(telFuncionario);
		setEmailFuncionario(emailFuncionario);
	}

	Funcionario() {

	}

	// Getters e setters
	public int getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(int idFuncionario) {
		if (idFuncionario != 0) { // Valida��o do campo do ID do funcion�rio
			this.idFuncionario = idFuncionario;
		} else {
			throw new IllegalArgumentException("[FUNCIONARIO]: Campo obrigat�rio, tente novamente.");
		}
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		if (!nomeFuncionario.isEmpty()) { // Valida��o do campo do nome do funcion�rio
			this.nomeFuncionario = nomeFuncionario;
		} else {
			throw new IllegalArgumentException("[FUNCIONARIO]: Campo obrigat�rio, tente novamente.");
		}
	}

	public String getCpfFuncionario() {
		return cpfFuncionario;
	}

	public void setCpfFuncionario(String cpfFuncionario) {
		if (!cpfFuncionario.isEmpty()) { // Valida��o do campo do CEP do funcion�rio
			this.cpfFuncionario = cpfFuncionario;
		} else {
			throw new IllegalArgumentException("[FUNCION�RIO]: Campo obrigat�rio, tente novamente.");
		}
	}

	public String getTelFuncionario() {
		return telFuncionario;
	}

	public void setTelFuncionario(String telFuncionario) {
		if (!telFuncionario.isEmpty()) { // Valida��o do campo do telefone do funcion�rio
			this.telFuncionario = telFuncionario;
		} else {
			throw new IllegalArgumentException("[FUNCION�RIO]: Campo obrigat�rio, tente novamente.");
		}
	}

	public String getEmailFuncionario() {
		return emailFuncionario;
	}

	public void setEmailFuncionario(String emailFuncionario) {
		if (!emailFuncionario.isEmpty()) { // Valida��o do campo do email do funcion�rio
			this.emailFuncionario = emailFuncionario;
		} else {
			throw new IllegalArgumentException("[FUNCION�RIO]: Campo obrigat�rio, tente novamente.");
		}
	}

}
