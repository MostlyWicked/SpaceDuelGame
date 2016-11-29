package staticlibs;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GlobalVars {
	
	// Change this if you add more children of GameObject to the game.
	public static final int NUM_OF_GAMEOBJECT_TYPES = 6;
	
	// 2D or 3D game?
	public final static int DIMENSIONS = 2;
	
	// Dictionary of game objects nicknames and their corresponding handle (index of array == handle). Modify 
	// this when creating or erasing GameObjects and their derivatives.
	public static String[] gameObjectTypeList = {"GameObject","ship1","ship2","projectile","asteroid","DestroyableGameObject"};
	

}
