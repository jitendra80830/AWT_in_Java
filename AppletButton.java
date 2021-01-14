//creat a button in an Applet
import java.applet.*;
import java.awt.*;
public class AppletButton extends Applet{
	public void init(){
		Button b1,b2,b3;
		b1=new Button("Welcome");
		add(b1);
		b2=new Button("Click1");
		add(b2);
		b3=new Button("Click1");
		add(b3);
		setBackground(Color.red);
	}
}
/*
<applet code="AppletButton.class" width=400 height=400></applet>
*/