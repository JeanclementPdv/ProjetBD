package model;

import model.IAnimate;


public interface IPiece{

		public void Kill (Animate animate);
		
		 public void Slip (Direction direction);
		
		 public void fall();
		
		public void SetDirection (Direction direction);
		
		public Direction GetDirection();
		
		
	}


