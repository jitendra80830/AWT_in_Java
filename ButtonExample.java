//Create a button in main method
import java.awt.*;

public class ButtonExample extends Component{
	public static void main(String[] args){
		
		Frame frame=new Frame("ButtonExample");
		Button button=new Button("Click");
		button.setBounds(30,100,40,30);
		frame.add(button);
		frame.setSize(300,300);
		frame.setBackground(Color.red);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
