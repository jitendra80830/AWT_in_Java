//Create a CardLayout Manager
import java.awt.*;

public class CardLayoutDemo extends java.applet.Applet{
	CardLayout layout;
	public void init(){
		layout=new CardLayout();
		setLayout(layout);
		add("1",new Button ("card1"));
		add("2",new Button ("card2"));
		add("3",new Button ("card3"));
		add("4", new Button ("card4"));
		add("5",new Button ("card5"));
	}
	public boolean keyDown(Event e,int key){
		layout.previous(this);
		return true;
	}
}
/*
<applet code="CardLayoutDemo.class" height=300 width=300></applet>
*/
