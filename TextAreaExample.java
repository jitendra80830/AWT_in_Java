//Create a TextArea
import java.awt.*;

public class TextAreaExample{
	TextAreaExample(){
		Frame frame=new Frame();
		
		TextArea area=new TextArea("wlcome to IIT kanp");
		area.setBounds(10,30,300,300);
		frame.add(area);
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	
	
	public static void main(String[] args){
		new TextAreaExample();
	}
}
		