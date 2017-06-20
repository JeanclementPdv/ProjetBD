package Element;

public class Piece {
/**
 * Initiate WIDTH and HEIGHT at 32
 */
	private int WIDTH = 32;

	private int HEIGHT = 32;
/**
 * 
 * @author Adurtis
 *	Agragate the enumClass Direction
 */
	public class Direction {
		private Piece d;

		public Piece getDirection() {
			return d;
		}
		
		/**
		 * 
		 * @param animate
		 */
		public void kill (Animate animate){}

	}
	/**
	 * 
	 * @param direction
	 */
	public void slip(Direction direction){}
	/**
	 * Method in order to fall an element
	 */
	public void fall(){}
	
	/**
	 * 
	 * @param direction
	 * 
	 * Method
	 */
	public void setDirection(Direction direction){}
	
	/**
	 * 
	 * @return null by default for getDirection
	 */
	public Direction getDirection(){
		return null;
		
	}
	/**
	 * 
	 * @return
	 */
	public boolean isCollectable(){
		return false;
		
	}
	
	public boolean isMovable(){
		return false;
		
	}
	}

