package exceptions;

public class DifferentSizeVectorsComparisonException extends DifferentSizeVectorsException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage(){
		return "Cannot compare vectors of different sizes";
	}

}
