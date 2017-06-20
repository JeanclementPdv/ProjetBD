import java.util.ArrayList;

import Element.Animate;
import Element.Piece;
import model.IBoulderDashModel;
import setting.Setting;
/**
 * the class BoulderDashModel.
* @author MaximeHollebecq
* @version 1.0
*/
public abstract class BoulderDashModel implements IBoulderDashModel {

	/**
	 * definition of the method BoulderDashModel
	 */
	public BoulderDashModel(){}

	/**
	 * 
	 * @return null by default for getPiece
	 */
	public ArrayList<Piece> getPiece() {
		return null;
	}

	/**
	 * 
	 * @return null by default for getsetting
	 */
	public ArrayList<Setting> getSetting() {
		return null;
	}

	/**
	 * 
	 * @param piece with the method AddPiece
	 */
	public void AddPiece ( Piece piece) {
	}

	/**
	 * 
	 * @param piece with the method DeletePiece
	 */
	public void DeletePiece ( Piece piece) {
	}

	/**
	 * 
	 * @param animate with the method AddAnimate
	 */
	public void AddAnimate ( Animate animate) {
	}
	
	/**
	 * 
	 * @param animate with the method DeleteAnimate
	 */
	public void DeleteAnimate ( Animate animate) {
	}
	
	/**
	 * 
	 * @param setting with the method AddSetting
	 */
	public void AddSetting ( Setting setting) {
	}
	
	/**
	 * 
	 * @param setting with the method Deletesetting
	 */
	public void DeleteSetting ( Setting setting) {
	}
}

