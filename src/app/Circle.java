package app;
import java. lang. Math. *;
public class Circle extends ShapeBase {

	public Circle(String name, int width, int height) {
		super(name, width, height);
		// TODO Auto-generated constructor stub
	}
	@Override
	public int calculateArea()
	{
		//convets pi to it(like rest of shapes) then multiplys by height which is radius^2
		return (int)Math.PI * height^2;
	}

}
