import javax.swing.*;

public class Mjb17JFrame extends JFrame{
	public Mjb17JFrame(){
		setTitle("Book Order");		//from the Frame class
		setBounds(267, 200, 267, 200);	//from the Component class
	}

	public static void main(String[] args){
		JFrame frame = new Mjb17JFrame();
		//frame.show();			//from the window class
		//JFrame frame = new JFrame("JFrame Example1");  
		frame.setVisible(true);
	}
}