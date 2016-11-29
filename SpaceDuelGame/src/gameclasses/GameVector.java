package gameclasses;
import java.util.Arrays;

import exceptions.DifferentSizeVectorsException;
import gameinterfaces.VectorInterface;


public class GameVector implements Comparable<GameVector>,VectorInterface<GameVector>{
	
	private double[] internalVectorRepresentation;
	private int vectorSize;
	
	public GameVector(double ... vectorArray){
		this.internalVectorRepresentation = vectorArray;
		this.vectorSize = vectorArray.length;
	}
	
	public double getVectorValue(int index){
		return this.internalVectorRepresentation[index];
	}
	
	public double getX(){
		return this.getVectorValue(0);
	}
	
	public double getY(){
		return this.getVectorValue(1);
	}
	
	public int getSize(){
		return this.vectorSize;
	}
	
	//@Override
	public GameVector addToVector(GameVector vec){
		if(vec.getSize() != this.getSize()){
			throw new DifferentSizeVectorsException();
		}
		double[] resultArray = new double[vec.getSize()];
		for(int i=0 ; i<vec.getSize() ; i++){
			resultArray[i] = this.getVectorValue(i) + vec.getVectorValue(i);
		}
		return new GameVector(resultArray);
	}

	
	public GameVector multiplyByScalar(double scalar){
		double[] resultArray = new double[this.getSize()];
		for(int i=0 ; i<this.getSize() ; i++){
			resultArray[i] = this.getVectorValue(i) * scalar;
		}
		return new GameVector(resultArray);
	}
	
	public double getLength(){
		double vectorSum = 0;
		for(int i=0 ; i<this.getSize() ; i++){
			vectorSum += Math.pow(this.getVectorValue(i),2);
		}
		return Math.sqrt(vectorSum);
	}
	
	public String toString(){
		return Arrays.toString(this.internalVectorRepresentation);
	}
	
	public int getInt(int ind){
		return (int)Math.round(internalVectorRepresentation[ind]);
	}

	@Override
	public int compareTo(GameVector vec) {
		//TODO: need to implement the vector comparison as defined in Wikipedia.
		return 0;
	}

}
