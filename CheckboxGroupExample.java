//Create a CheckboxGroup
import java.awt.*;

public class CheckboxGroupExample{
	CheckboxGroupExample(){
		Frame f=new Frame("CheckboxGroupExample");
		CheckboxGroup cbg=new CheckboxGroup();
		
		Checkbox checkbox1=new Checkbox("c++",cbg,false);
		checkbox1.setBounds(50,100,50,50);
		
		Checkbox checkbox2=new Checkbox("java",cbg,true);
		checkbox2.setBounds(50,150,50,50);
		
		Checkbox checkbox3=new Checkbox("python",cbg,false);
		checkbox3.setBounds(50,200,50,50);
		
		f.add(checkbox1);
		f.add(checkbox2);
		f.add(checkbox3);
		
		f.setSize(400,400);
		f.setBackground(Color.blue);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args){
		new CheckboxGroupExample();
	}
}