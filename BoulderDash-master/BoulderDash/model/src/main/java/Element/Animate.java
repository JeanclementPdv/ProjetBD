package Element;

public class Animate {
/**
 * <h1>The Class Animate.</h1>
 * 
 *  @author Podevin Jean clement
 * @version 1.0
 */
	
	/**
	 * @param initiate the WIDTH and the HEIGHT 
	 */
	private int WIDTH = 32;

	private int HEIGHT= 32;
	/**
	 * Class constructor
	 */
	public Animate (){}

	public void xMove(Direction direction) {
	}

	public void yMove(Direction direction) {
	}

	public boolean CanDie() {
		return false;
	}
	public Direction getDirection() {
		return null;
	}

	public void setDirection(Direction direction) {
	}


	public class Direction {
		private Animate a;

		public Animate getDirection() {
			return a;
		}
	}
}



