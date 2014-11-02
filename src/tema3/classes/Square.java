package tema3.classes;
import tema3.exception.RzvException;
import tema3.interfaces.*;

/**
 * @author Razvan
 *
 */
public class Square extends GeometricForm implements IDrawable{

	/**
	 * @param color
	 * @param X
	 * @param Y
	 */
	public Square(String color, int X, int Y)
	{
		this.setOwnColor(color);
		this.setCenterLocationX(X);
		this.setCenterLocationY(Y);
	}
	
	public Square(String color)
	{
		this.setOwnColor(color);
	}
	
	/* (non-Javadoc)
	 * @see tema3.classes.GeometricForm#rotate()
	 */
	public void rotate()
	{
		try
		{
			if (!this.canRotate())
				throw new RzvException("Eror 101", "The Square can not rotate!");
			System.out.println("The Square is rotating, can`t you see?");
		}
		catch(RzvException exc)
		{
			System.out.println(exc.getMessage());
			System.out.println(exc.getExtraErrorInfo());
		}
	}
	
	/* (non-Javadoc)
	 * @see tema3.interfaces.IDrawable#draw(int, int)
	 */
	public void draw(int X, int Y)
	{
		System.out.println("Finished drawing the " + this.getOwnColor() + " Square at (" + X + ", " + Y +").");
		this.setCenterLocationX(X);
		this.setCenterLocationY(Y);
	}
	
	/* (non-Javadoc)
	 * @see tema3.interfaces.IDrawable#moveTo(int, int)
	 */
	public void moveTo(int X, int Y)
	{
		System.out.println("Finished moving the Square at (" + X + ", " + Y +").");
		this.setCenterLocationX(X);
		this.setCenterLocationY(Y);
	}
	
	/* (non-Javadoc)
	 * @see tema3.interfaces.IDrawable#delete()
	 */
	public void delete()
	{
		System.out.println("Deleted the Square.");
	}
}
