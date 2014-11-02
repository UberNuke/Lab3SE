import tema3.exception.*;
import tema3.classes.*;

/**
 * @author Razvan
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Square mySquare = new Square("red");
		mySquare.draw(4, 5);
		mySquare.moveTo(10, 20);
		mySquare.rotate();
	}

}
