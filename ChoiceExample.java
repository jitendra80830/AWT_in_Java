//Create a Choice box
import java.awt.*;

public class ChoiceExample{
	ChoiceExample(){
		Frame f=new Frame();
		Choice c=new Choice();
		c.setBounds(100,100,75,75);
		c.add("Item1");
		c.add("Item2");
		c.add("Item3");
		c.add("Item4");
		c.add("Item5");
		f.add(c);
		f.setSize(400,400);
		f.setBackground(Color.red);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args){
		new ChoiceExample();
	}
}