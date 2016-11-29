package gameclasses;
import gameinterfaces.GameObjectInterface;
import staticlibs.GlobalVars;

import java.util.Arrays;

public abstract class GameObject implements GameObjectInterface<Integer,GameVector>{
	
	protected GameVector location;
	protected GameVector velocityVector;
	protected Integer handle;
	
	public GameObject(){
		this.location = new GameVector(Arrays.copyOf(new double[0], GlobalVars.DIMENSIONS));
		this.velocityVector = new GameVector(Arrays.copyOf(new double[0], GlobalVars.DIMENSIONS));
		this.handle = 0;
	}
	
	public GameVector getLocation(){
		return this.location;
	}
	
	public GameVector getVelocity(){
		return this.velocityVector;
	}
	
	public void setVelocity(GameVector vec){
		this.velocityVector = vec;
	}
	
	public void setLocation(GameVector vec){
		this.location = vec;
	}
	
	public Integer getHandle(){
		return this.handle;
	}
	
	
	
}
