package Element;

public class Animate {

	private int WIDTH = 32;

	private int HEIGHT= 32;

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



