package app;

public class Rectangle extends ShapeBase {

	//sets up constructor
	public Rectangle(String name, int width, int height) {
		super(name, width, height);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	//calculates area
	public int calculateArea()
	{
		return width * height;
	}

}
