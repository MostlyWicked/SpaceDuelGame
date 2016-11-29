package gameinterfaces;

import gameclasses.GameVector;

public interface GameObjectInterface<GenericHandle,GenericVector> {
	
	public GenericHandle getHandle();
	
	public GenericVector getLocation();

}
