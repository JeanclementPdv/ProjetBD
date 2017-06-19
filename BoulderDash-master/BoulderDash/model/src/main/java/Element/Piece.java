package Element;

public class Piece {

	private int WIDTH = 32;

	private int HEIGHT = 32;

	public class Direction {
		private Piece d;

		public Piece getDirection() {
			return d;
		}
		public void kill (Animate animate){}

	}

	public void slip(Direction direction){}
	
	public void fall(){}
	
	public void setDirection(Direction direction){}
	
	}

