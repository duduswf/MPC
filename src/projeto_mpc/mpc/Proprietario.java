//Eduardo Luiz Pontes de Souza - UC19100270
package projeto_mpc.mpc;

public class Proprietario {

	// Atributos
	private int cpfDono;
	private String nomeDono;
	private String telDono;
	private String descDono; // Descri��o do propriet�rio � um breve resumo de hor�rios dispon�veis, etc.
	private String emailDono;

	// Construtores
	Proprietario(int cpfDono, String nomeDono, String telDono, String descDono, String emailDono) {
		setCpfDono(cpfDono);
		setNomeDono(nomeDono);
		setTelDono(telDono);
		setDescDono(descDono);
		setEmailDono(emailDono);
	}

	// Getter e setters

	public int getCpfDono() {
		return cpfDono;
	}

	public void setCpfDono(int cpfDono) {
		if (cpfDono != 0) { // Valida��o do campo do CPF do propriet�rio
			this.cpfDono = cpfDono;
		} else {
			throw new IllegalArgumentException("[PROPRIET�RIO]: Campo obrigat�rio, tente novamente.");
		}
	}

	public String getNomeDono() {
		return nomeDono;
	}

	public void setNomeDono(String nomeDono) {
		if (!nomeDono.isEmpty()) { // Valida��o do campo do nome do propriet�rio
			this.nomeDono = nomeDono;
		} else {
			throw new IllegalArgumentException("[PROPRIET�RIO]: Campo obrigat�rio, tente novamente.");
		}
	}

	public String getTelDono() {
		return telDono;
	}

	public void setTelDono(String telDono) {
		if (!telDono.isEmpty()) { // Valida��o do campo do email do funcion�rio
			this.telDono = telDono;
		} else {
			throw new IllegalArgumentException("[FUNCION�RIO]: Campo obrigat�rio, tente novamente.");
		}
	}

	public String getDescDono() {
		return descDono;
	}

	public void setDescDono(String descDono) {
		if (!descDono.isEmpty()) { // Valida��o do campo da descri��o do propriet�rio
			this.descDono = descDono;
		} else {
			throw new IllegalArgumentException("[PROPRIET�RIO]: Campo obrigat�rio, tente novamente.");
		}
	}

	public String getEmailDono() {
		return emailDono;
	}

	public void setEmailDono(String emailDono) {
		if (!emailDono.isEmpty()) { // Valida��o do campo do email do propriet�rio
			this.emailDono = emailDono;
		} else {
			throw new IllegalArgumentException("[PROPRIET�RIO]: Campo obrigat�rio, tente novamente.");
		}
	}
}
