package operation;
import core.*;
import java.awt.*;
public class FillBackground implements Operation
{
	private Color c = new Color(255,255,255);
	public String getName()
	{
		return "FillBackground";
	}
	public String getStatus()
	{
		int ip = 0;
		int ic = 0;
		String erg = ic + ":" + ip;
		return erg;
	}
	public Icon operate(Icon icon) 
	{
		Protokol.write("FillBackground:operate:start");
		int width = icon.getSize().width;
		int height = icon.getSize().height;
		Icon erg = Factory.getIcon();
		erg.setSize(width,height);
		for (int i=0;i<width;i++)
		{
			for (int j=0;j<height;j++)
			{
				Pixel q = Factory.getPixel();
				q.setX(i);
				q.setY(j);
				q.setColor(c);
				erg.setPixel(q);
			}
		}
		return erg;
	}
	public void reset()
	{

	}
	public boolean isReady() 
	{
		boolean erg = true;
		return erg;
	}
	public void pushColor(Color c) 
	{
		this.c = c;
	}
	public void pushPixel(Pixel p) 
	{
	
	}
	public Operation copy()
	{
		FillBackground erg = new FillBackground();
		return erg;
	}
}
