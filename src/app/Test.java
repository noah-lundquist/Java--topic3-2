package app;

public class Test {
	//sets up print statement to print shape
	private static void displayArea(ShapeBase shape)
	{
		System.out.println("This is a shape name " +shape.getName()+ " with an area of " +shape.calculateArea());
	}
	
	public static void main (String [] args)
	{
		//sets array, then sets up objects in the array
		ShapeBase[] shapes = new ShapeBase[4];
		shapes[0] = new Rectangle("Rectangle", 10, 200);
		shapes[1] = new Triangle("Triangle", 10, 50);
		shapes[2] = new Circle("Circle", 0, 50);
		shapes[3] = new Oval("Oval", 20, 60);
		
		//loops through array, prints above print statement
		for(int x = 0; x < shapes.length; ++x)
		{
			displayArea(shapes[x]);
		}
	}

}
