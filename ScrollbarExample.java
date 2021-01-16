//Create a Scrollbar
import java.awt.*;

public class ScrollbarExample{
	ScrollbarExample(){
		Frame f=new Frame();
		Scrollbar s=new Scrollbar();
		s.setBounds(100,100,50,50);
		f.add(s);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args){
		new ScrollbarExample();
	}
}