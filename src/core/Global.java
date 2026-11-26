package core;

public class Global 
{
	private static Pixel pixel = Factory.getPixel();
	public static void setPixel(Pixel p)
	{
		pixel = p;
	}
	public static Pixel getPixel()
	{
		return pixel;
	}
}
