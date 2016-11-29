package gameclasses;

public class GameAsteroid extends GameProjectile{
	
	protected int radius;
	
	public GameAsteroid(int r){
		super();
		this.radius = r;
		this.handle = 4;
	}
	
	public int getRadius(){
		return this.radius;
	}

}
