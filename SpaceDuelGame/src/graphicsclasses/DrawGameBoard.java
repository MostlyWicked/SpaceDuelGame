package graphicsclasses;


import java.awt.Color;
import java.awt.Graphics;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;

import staticlibs.GlobalVars;
import gameclasses.*;

public class DrawGameBoard extends JPanel{
	
	GameGrid gameGrid;
	public int count;
	private JFrame frame;
	
	public DrawGameBoard(GameGrid grid){
		this.gameGrid = grid;
		this.count = 0;
		this.frame = null;
	}

	public void paint(Graphics g) {
		List<GameObject> objectsList = null;
		for (int i = 0; i < GlobalVars.NUM_OF_GAMEOBJECT_TYPES; i++) {
			objectsList = this.gameGrid.getListOfGameObjects(i);
			g.setColor(Color.black);
			if (objectsList != null) {
				for (GameObject x : objectsList) {
					this.drawObject(x, g);
				}
			}
		}
	}

	//TODO: Either figure out how to update existing frame, or close the previous one
	public void activateFrame() {
		this.count++;
		if (this.frame != null)
			this.frame.setVisible(false);
		JFrame f = new JFrame();
		this.frame = f;
		f.getContentPane().add(this);
		f.setName("Game In Progress");
		f.setTitle(String.format("Game In Progress - turn %d",this.count));
		f.setSize(this.gameGrid.getSize(), this.gameGrid.getSize()); // size of opened frame
		f.setLocation(500,250);
		
		f.setVisible(true);
	}
	
	public void drawObject(GameObject obj, Graphics g){
		int objType = obj.getHandle();
		//TODO seems iffy. Should work over the entire handle system from the ground up?
		if(objType != 0 && ((DestroyableGameObject)obj).isDestroyed())
			return;
		switch (objType){
		case 1: case 2:
			g.drawLine(obj.getLocation().getInt(0) - 3, obj.getLocation()
				.getInt(1), obj.getLocation().getInt(0) + 3, obj
				.getLocation().getInt(1));
			g.drawLine(obj.getLocation().getInt(0), obj.getLocation()
				.getInt(1)-3, obj.getLocation().getInt(0), obj
				.getLocation().getInt(1)+3);
			break;
		case 4:
			g.drawOval(obj.getLocation().getInt(0),
					obj.getLocation().getInt(1),
					((GameAsteroid)obj).getRadius()*2,((GameAsteroid)obj).getRadius()*2);
		}
		
	}

}
