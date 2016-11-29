package gameclasses;

public class ShipObject extends DestroyableGameObject{
	
	protected double thrustLimit;
	protected double velocityLimit;
	
	public ShipObject(){
		super();
		this.thrustLimit = Double.POSITIVE_INFINITY;
		this.velocityLimit = Double.POSITIVE_INFINITY;
		this.handle = 1;
	}
	
	public void applyThrust(GameVector thrustVec){
		this.setVelocity(thrustVec.addToVector(this.velocityVector));
	}
	
	public void applyThrust(double ... thrustVec){
		this.setVelocity(new GameVector(thrustVec).addToVector(this.velocityVector));
	}
	
	// Returns a vector for the ship's next location after application of velocity
	public GameVector getNextLocation(){
		return this.getLocation().addToVector(this.velocityVector);
	}
	
	// Increments ships current location depending on current velocity and direction 
	public void applyNextLocation(){
		this.setLocation(this.getNextLocation());
	}
	
	public void setThrustLimit(double arg){
		this.thrustLimit = arg;
	}
	
	public double getThrustLimit(){
		return this.thrustLimit;
	}
	
	public void setVelocityLimit(double arg){
		this.velocityLimit = arg;
	}
	
	public double getVelocityLimit(){
		return this.velocityLimit;
	}
	
	public String toString(){
		return String.format("Current Location: %s\nCurrent Velocity: %s",this.location,this.velocityVector);
	}

}
