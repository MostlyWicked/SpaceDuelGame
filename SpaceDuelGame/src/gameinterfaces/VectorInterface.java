package gameinterfaces;

public interface VectorInterface<GenericVector> {
	
	public double getVectorValue(int index);
	public int getSize();
	public GenericVector addToVector(GenericVector vec);
	public GenericVector multiplyByScalar(double scalar);

}
