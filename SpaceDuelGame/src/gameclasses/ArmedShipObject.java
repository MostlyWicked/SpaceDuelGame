package gameclasses;

import java.util.LinkedList;
import java.util.List;

public class ArmedShipObject extends ShipObject{
	
	protected List<GameWeapon> weaponsList;
	
	public ArmedShipObject(){
		super();
		this.weaponsList = new LinkedList<GameWeapon>();
		this.handle = 2;
	}

}
