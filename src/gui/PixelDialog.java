package gui;
import core.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class PixelDialog extends JDialog implements ActionListener
{
	public static final long serialVersionUID= 0;
	private JPanel cpan = new JPanel();
	private JPanel apan = new JPanel();
	private JLabel lab1 = new JLabel("x-Position");
	private JTextField tf1 = new JTextField(20);
	private JLabel lab2 = new JLabel("y-Position");
	private JTextField tf2 = new JTextField(20);
	private JPanel bpan = new JPanel();
	private JPanel bpanx = new JPanel();
	private JButton buttb1 = new JButton("save");
	private JButton buttb2 = new JButton("cancel");
	private Pixel pixel = null;
	public PixelDialog(String name)
	{
		super(new JFrame(name));
		this.setModal(true);
		this.setName(name);
		this.setTitle(name);
		tf1.setText("0");
		tf2.setText("0");
		apan.setLayout(new GridLayout(2,2));
		apan.add(lab1);
		apan.add(tf1);
		apan.add(lab2);
		apan.add(tf2);
		bpan.setLayout(new GridLayout(1,2));
		bpan.add(buttb1);
		bpan.add(buttb2);
		bpanx.setLayout(new BorderLayout());
		bpanx.add(bpan,BorderLayout.WEST);
		cpan.setLayout(new BorderLayout());
		cpan.add(apan,BorderLayout.CENTER);
		cpan.add(bpanx,BorderLayout.SOUTH);
		setContentPane(cpan);
		buttb1.addActionListener(this);
		buttb2.addActionListener(this);
		this.pack();
		this.setVisible(true);
	}
	public Pixel getPixel()
	{
		return pixel;
	}
	public void actionPerformed(ActionEvent ae)
	{
		Object quelle = ae.getSource();
		if (quelle == buttb1)
		{
			String s1 = tf1.getText();
			String s2 = tf2.getText();
			int x = getNumber(s1);
			int y = getNumber(s2);
			pixel = Factory.getPixel();
			pixel.setX(x);
			pixel.setY(y);
			dispose();
		}
		if (quelle == buttb2)
		{
			dispose();
		}
	}
	public int getNumber(String s)
	{
		int erg = 0;
		try
		{
			erg = Integer.parseInt(s);
		}
		catch (Exception e)
		{
			erg = 0;
			Protokol.write("PixelDialog:getNumber:not a Number:" + s);
		}
		return erg;
	}
	public double getDouble(String s)
	{
		double erg = 0;
		try
		{
			erg = Double.parseDouble(s);
		}
		catch (Exception e)
		{
			erg = 0;
			Protokol.write("PixelDialog:getDouble:not a Number:" + s);
		}
		return erg;
	}
}
