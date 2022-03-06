package app;

public class ShapeBase implements ShapeInterface {

	//calls variables
	protected String name;
	protected int width, height;
	
	
	//sets constructor
	public ShapeBase(String name, int width, int height)
	{
		this.name = name;
		this.width = width;
		this.height = height;
	}
	
	@Override
	public int calculateArea() {
		// TODO Auto-generated method stub
		return -1;
	}
	//gets name
	public String getName()
	{
		return name;
	}
	//gets width
	public int getWidth()
	{
		return width;
	}

	//gets height
	public int getHeight()
	{
		return height;
	}


}
