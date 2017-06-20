package model;

import java.util.ArrayList;

public interface IBoulderDashModel {

	public ArrayList<Piece> getPiece();
	public ArrayList<Piece> getAnimate();
	public void Addpiece(Piece piece);
	public void DeletePiece(Piece piece);
	public void AddAnimate(Animate animate);
	public void DeleteAnimate(Animate animate);
	public void AddSetting (Setting setting);
	public void DeleteSetting(Setting setting);
	
}
