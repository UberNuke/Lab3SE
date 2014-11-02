package tema3.interfaces;

/**
 * @author Razvan
 *
 * Interface for all drawable objects.
 */
public interface IDrawable {
	
	public void draw(int X, int Y);
	
	public void moveTo(int X, int Y);
	
	public void delete();
}
