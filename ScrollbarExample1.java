//Create Scrollbar
import java.awt.*;

public class ScrollbarExample1{
	Frame f;
	ScrollbarExample1(){
		f=new Frame();
		Scrollbar h=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,100);
		h.setBounds(100,50,300,50);
		
		Scrollbar v=new Scrollbar(Scrollbar.VERTICAL,0,20,0,100);
		v.setBounds(100,200,50,300);
		
		f.add(h);
		f.add(v);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String[] args){
		new ScrollbarExample1();
	}
}