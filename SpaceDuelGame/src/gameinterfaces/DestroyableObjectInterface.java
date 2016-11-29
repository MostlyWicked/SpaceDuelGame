package gameinterfaces;

public interface DestroyableObjectInterface<GenericHP> {
	
public void destroy();
	
	public GenericHP getHP();
	
	public void setHP(GenericHP newHP);

}
