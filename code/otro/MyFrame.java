import java.awt.*;

public class MyFrame extends Frame
{
    public MyFrame (String str)
    {
	super(str);
    }

    public static void main (String args[])
    {
	MyFrame fr = new MyFrame("Hello out there!");
	fr.setSize(500,500);
	fr.setBackground(Color.blue);
	fr.setVisible(true);
    }
}
