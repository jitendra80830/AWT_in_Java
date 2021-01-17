//Cteate a BorderLayout
import java.awt.*;

public class MyBorderLayout{
	Frame f;
	MyBorderLayout(){
		f=new Frame();
		Button b1=new Button("1");
		Button b2=new Button("2");
		Button b3=new Button("3");
		Button b4=new Button("4");
		Button b5=new Button("5");
		f.add(b1,BorderLayout.NORTH);
		f.add(b2,BorderLayout.SOUTH);
		f.add(b3 ,BorderLayout.EAST);
		f.add(b4,BorderLayout.WEST);
		f.add(b5,BorderLayout.CENTER);
		f.setSize(300,300);
		f.setVisible(true);
	}
	public static void main(String[] args){
		new MyBorderLayout();
	}
}