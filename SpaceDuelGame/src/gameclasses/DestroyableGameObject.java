package gameclasses;

import gameinterfaces.DestroyableObjectInterface;

public class DestroyableGameObject extends GameObject implements
		DestroyableObjectInterface<Integer> {

	protected boolean destroyed;
	protected Integer HPscore;
	protected int dodgeRate;

	public DestroyableGameObject() {
		super();
		this.handle = 5;
		this.destroyed = false;
		this.HPscore = -1;
		this.dodgeRate = 0;
	}

	public void destroy() {
		this.destroyed = true;
	}

	public boolean isDestroyed() {
		return this.destroyed;
	}

	public void setHP(Integer newHP) {
		this.HPscore = newHP;
	}

	public Integer getHP() {
		return this.HPscore;
	}

	public void damage(int x) {
		this.HPscore -= x;
	}

	public void heal(int x) {
		this.HPscore += x;
	}

	public void setDodge(int newDodge) {
		this.dodgeRate = newDodge;
	}

	public int getDodge() {
		return this.dodgeRate;
	}

}
