package staticlibs;
//possibly unnecessary

public class VectorMathLib {
	
	public static double[] addVectors(double[] vec1, double[] vec2,int length){
		double[] result = new double[length];
		for(int i=0; i<length; i++){
			result[i] = vec1[i] + vec2[i];
		}
		return result;
	}
	
	public static double[] multiplyScalarVector(double scalar, double[] vec,int length){
		double[] result = new double[length];
		for(int i=0; i<length; i++){
			result[i] = scalar * vec[i];
		}
		return result;
	}

}
