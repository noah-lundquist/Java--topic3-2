package app;

public class Triangle extends ShapeBase {

	//sets constructor
	public Triangle(String name, int width, int height) {
		super(name, width, height);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	//calculates area
	public int calculateArea()
	{
		return width * height/2;
	}

}
