package gameclasses;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import staticlibs.GlobalVars;

public class GameGrid {
	
	/*
	 * The game plane is represented by a list of game objects. Each GameObject has a getLocation() method, allowing us
	 * to track which squares are occupied at any given moment. The field objectsList is an array of lists,
	 * each index contains a list of objects whose handle equals the same index.
	 * 
	 */
	
	protected int gridSize;
	List<List<GameObject>> objectsList;
	
	public GameGrid(int size){
		this.gridSize = size;
		this.objectsList = new ArrayList<>(GlobalVars.NUM_OF_GAMEOBJECT_TYPES);
		for(int i=0 ; i<GlobalVars.NUM_OF_GAMEOBJECT_TYPES; i++){
			this.objectsList.add(new LinkedList<GameObject>());
		}
	}
	
	public int getSize(){
		return this.gridSize;
	}
	
	public List<List<GameObject>> getListOfGameObjects(){
		return this.objectsList;
	}
	
	public List<GameObject> getListOfGameObjects(int i){
		return this.objectsList.get(i);
	}
	
	public void addObject(GameObject gameObject){
		this.objectsList.get(gameObject.getHandle()).add(gameObject);
	}

}
