package exceptions;

public class DifferentSizeVectorsException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getMessage(){
		return "Cannot perform binary operation on vectors of different sizes";
	}
}
