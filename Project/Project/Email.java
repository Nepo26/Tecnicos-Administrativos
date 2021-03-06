package Project;

/**
 *
 * @author Wanderley de Souza Alencar
 */
/*
* Nome.......: Email
* Objetivo...: Representar e-mail qualquer.
* Observacoes:
*/
public class Email {
    String                          prefixo;
    String                          sufixo;

	public Email(String prefixo, String sufixo) {
		this.prefixo = prefixo;
		this.sufixo = sufixo;
	}

	public String getPrefixo() {
		return prefixo;
	}
	public void setPrefixo(String prefixo) {
		this.prefixo = prefixo;
	}
	public String getSufixo() {
		return sufixo;
	}
	public void setSufixo(String sufixo) {
		this.sufixo = sufixo;
	}
}