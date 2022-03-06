package app;

public class Oval extends ShapeBase {

	public Oval(String name, int width, int height) {
		super(name, width, height);
		// TODO Auto-generated constructor stub
	}
	//calculates area
	public int calculateArea()
	{
		//multiplys pi converted to in, by raidus 2(height) by raidus 2(width)
		return (int)Math.PI * height * width;
	}

}
