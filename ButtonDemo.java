//Create A Button
import java.awt.*;

class ButtonDemo extends Frame{
	ButtonDemo(){
		
		Button b=new Button("Click");
		b.setBounds(30,100,80,30); //Setting Button Possition
		add(b); //adding button into Frame
		setBackground(Color.blue);
		setSize(300,300); //Frame size
		setLayout(null); //No layout manager
		setVisible(true);
	}
	public static void main(String[] args){
		ButtonDemo b=new ButtonDemo();
	}
}
		