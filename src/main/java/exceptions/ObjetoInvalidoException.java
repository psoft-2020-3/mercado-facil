package exceptions;

public class ObjetoInvalidoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ObjetoInvalidoException(String erro) {
		super("ExcecaoDados: " + erro);
	}
}