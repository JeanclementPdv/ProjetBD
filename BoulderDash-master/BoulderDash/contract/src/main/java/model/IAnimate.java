package model;

public interface IAnimate {
	
	public void xMove (Direction direction);
	public void yMove (Direction direction);
	
	public void die();
	
	public Direction GetDirection();
	
	public void SetDirection (Direction direction);
	
	
	

}
