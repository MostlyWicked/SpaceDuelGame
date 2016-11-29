package maingame;
import gameclasses.*;
import graphicsclasses.DrawGameBoard;

import java.awt.Graphics;
import java.util.*;

public class GameTestClass {
	public static void main(String[] args) throws InterruptedException{
	
		GameSession game = new GameSession();
		game.start();
		
		/*
		GameVector a = new GameVector(4,5);
		GameVector b = new GameVector(1,3);
		GameVector c = new GameVector(1,2,3);
		
		GameGrid gr = new GameGrid(750);
		GameObject ship = new ShipObject();
		GameObject asteroid = new GameAsteroid(18);
		ship.setLocation(new GameVector(400,2));
		((ShipObject)ship).applyThrust(0,5);
		((ShipObject)ship).applyThrust(-20,0);
		asteroid.setLocation(new GameVector(50,50));
		gr.addObject(ship);
		gr.addObject(asteroid);
		DrawGameBoard g = new DrawGameBoard(gr);
		for(int i = 0; i<70;i++){
			g.activateFrame();
			((ShipObject)ship).applyNextLocation();
			Thread.sleep(200);
		}
		*/
		
		/*
		ShipObject x = new ShipObject();
		
		System.out.println(x);
		x.setThrustLimit(500.0);
		
		List<GameObject> l = new LinkedList<>();
		
		l.add(x);
		System.out.println(l.get(0).getHandle());
		
		ShipObject y = (ShipObject)l.get(0);
		System.out.println(y.getHandle());
		y.setVelocity(new GameVector(1,1));
		System.out.println(y+"\n"+y.getThrustLimit()+"\n"+y.getHandle());
		*/
		
		/*
		System.out.println(a.getSize()); //V
		System.out.println(c.getSize()); //V
		System.out.println(a.addToVector(b).getVectorValue(0)); //V
		System.out.println(a.addToVector(b).getVectorValue(1)); //V
		System.out.println(a.getLength()); //V
		System.out.println(new GameVector(666,0).getLength()); //V
		System.out.println(Arrays.toString(Arrays.copyOf(new double[0], 10))); //V
		System.out.println(a.addToVector(c)); //V
		
		
		
		
		//V
		ShipObject starship_one = new ShipObject();
		System.out.println(starship_one+"\n");
		starship_one.applyThrust(1,2);
		System.out.println(starship_one+"\n");
		starship_one.applyThrust(2,3);
		System.out.println(starship_one+"\n");
		System.out.println(starship_one.getNextLocation());
		starship_one.applyNextLocation();
		System.out.println(starship_one);
		starship_one.applyNextLocation();
		System.out.println(starship_one);
		starship_one.applyNextLocation();
		System.out.println(starship_one);
		starship_one.applyNextLocation();
		System.out.println(starship_one);
		*/

	}

}
