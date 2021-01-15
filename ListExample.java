//Create a List
import java.awt.*;

public class ListExample{
	ListExample(){
		Frame f=new Frame();
		List l=new List(5);
		l.setBounds(100,100,75,75);
		l.add("Item1");
		l.add("Item2");
		l.add("Item3");
		l.add("Item4");
		f.add(l);
		f.setSize(400,400);
		f.setBackground(Color.red);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args){
		new ListExample();
	}
}