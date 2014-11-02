/**
 * 
 */
package tema3.classes;

/**
 * @author Razvan
 *
 */
public abstract class GeometricForm {
	private String ownColor;
	private int centerLocationX;
	private int centerLocationY;
	
	/**
	 * @param color
	 */
	public GeometricForm()
	{
		
	}
	
	/**
	 * @return
	 */
	public boolean canRotate()
	{
		return false;
	}
	
	/**
	 * Abstract method used in children classes.
	 * Should throw an error if canRotate returns false.
	 */
	public abstract void rotate();

	/**
	 * @return
	 */
	public String getOwnColor() {
		return ownColor;
	}

	/**
	 * @return
	 */
	public int getCenterLocationX() {
		return centerLocationX;
	}

	/**
	 * @param centerLocationX
	 */
	public void setCenterLocationX(int centerLocationX) {
		this.centerLocationX = centerLocationX;
	}

	/**
	 * @return
	 */
	public int getCenterLocationY() {
		return centerLocationY;
	}

	/**
	 * @param centerLocationY
	 */
	public void setCenterLocationY(int centerLocationY) {
		this.centerLocationY = centerLocationY;
	}

	/**
	 * @param ownColor
	 */
	public void setOwnColor(String ownColor) {
		this.ownColor = ownColor;
	}
	
}
