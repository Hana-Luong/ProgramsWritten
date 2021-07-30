import java.awt.*;  

class Mjb20FrameJavaTPoint2{ // no extends Frame
 
	Mjb20FrameJavaTPoint2(){  
		Frame f=new Frame();  		// have to instantiate f
		Button b=new Button("click me");  
		b.setBounds(30,50,80,30);  
		f.add(b);  			//f.add(b) instead of add(b);
		f.setSize(300,300);  		//same as above, f is needed
		f.setLayout(null);  
		f.setVisible(true);  
	} 
 
	public static void main(String args[]){  
		Mjb20FrameJavaTPoint2 f=new Mjb20FrameJavaTPoint2(); 
						// still have to instantiate here. 
	}
} 

