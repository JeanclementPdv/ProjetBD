package Element;

public class Animate {
/**
 * The Class Animate.
 * 
 *  @author Podevin Jean clement
 * @version 1.1
 */
	
	/**
	 * @param initiate the WIDTH and the HEIGHT 
	 */
	private int WIDTH = 32;

	private int HEIGHT= 32;
	/**
	 * Class constructor Animate
	 */
	public Animate (){}

	/**
	 * 
	 * @param direction with axis X
	 */
	public void xMove(Direction direction) {
	}

	/**
	 * 
	 * @param direction with axis Y 
	 */
	
	public void yMove(Direction direction) {
	}
	
/**
 * 
 * @return
 */
	public boolean CanDie() {
		return false;
	}
	/**
	 * 
	 * @return
	 */
	public Direction getDirection() {
		return null;
	}
/**
 * 
 * @param direction
 */
	public void setDirection(Direction direction) {
	}

/** a regarder 
 */
	public class Direction {
		private Animate a;

		public Animate getDirection() {
			return a;
		}
	}
}



