//Unlike Frame, JFrame has the option to hide 
//or close the window with the help of setDefaultCloseOperation(int) method.


import java.awt.FlowLayout;  
import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JPanel;
  
public class Mjb18JFrameJavaTPoint {  

    public static void main(String s[]) {  
        JFrame frame = new JFrame("JFrame Example1");  
        JPanel panel = new JPanel();  
        panel.setLayout(new FlowLayout());  
        JLabel label = new JLabel("JFrame By Example2");  

        JButton button = new JButton();  
	button.setText("Button");  
        panel.add(label);  
        panel.add(button);  
        frame.add(panel);  
        frame.setSize(200, 300);  
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //
        frame.setVisible(true);  
    }  
}  