package controleFluxo;

public class ParametrosInvalidosException extends Exception {

	private static final long serialVersionUID = 1L;
	private int errorNumber;
	
	public ParametrosInvalidosException(int errorNumber) {
		this.errorNumber = errorNumber;
	}

	public String getMessage() {
		String errorMessage = "";
		if (errorNumber == 1) {
			errorMessage = "Primeiro erro";
		} else if (errorNumber == 2) {
			errorMessage = "O segundo parâmetro deve ser maior que o primeiro";
		}
		return errorMessage;
	}
	
}

