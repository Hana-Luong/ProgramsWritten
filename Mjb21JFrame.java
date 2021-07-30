import java.awt.*;  
import java.awt.event.WindowEvent;  
import java.awt.event.WindowListener;


  
public class Mjb21JFrame extends Frame implements WindowListener{  

	Mjb21JFrame(){  
        	addWindowListener(this);  
		setTitle("Book Order");          
        	setSize(400,400);  
        	setLayout(null);  
        	setVisible(true); 
 
    	} 
	public static void main(String[] args) {  
    		new Mjb21JFrame(); 

        	 
	}  
	public void windowActivated(WindowEvent arg0) {  
    		System.out.println("activated");  
	}  
	public void windowClosed(WindowEvent arg0) {  
    		System.out.println("closed");  
	}  
	public void windowClosing(WindowEvent arg0) {  
    		System.out.println("closing");  
    		dispose();  
	}  

	public void windowDeactivated(WindowEvent arg0) {  
    		System.out.println("deactivated");  
	}  
	public void windowDeiconified(WindowEvent arg0) {  
    		System.out.println("deiconified");  
	}  
	public void windowIconified(WindowEvent arg0) {  
    		System.out.println("iconified");  
	}  
	public void windowOpened(WindowEvent arg0) {  
    		System.out.println("opened");  
	}  
} 