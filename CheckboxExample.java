//Create a Checkbox
import java.awt.*;

public class CheckboxExample{
	CheckboxExample(){
		Frame frame=new Frame("CheckboxExample");
		Checkbox checkbox1=new Checkbox("c++");
		checkbox1.setBounds(100,100,50,50);
		Checkbox checkbox2=new Checkbox("java",true);
		checkbox2.setBounds(100,200,120,50);
		Checkbox checkbox3=new Checkbox("python");
		checkbox3.setBounds(100,150,100,50);
		frame.add(checkbox1);
		frame.add(checkbox2);
		frame.add(checkbox3);
		frame.setSize(400,400);
		frame.setBackground(Color.yellow);
		frame.setLayout(null);
		frame.setVisible(true);
	}
	public static void main(String[] args){
		new CheckboxExample();
	}
}