import java.awt.*;  
import java.awt.event.*;  
 public class ActionListenerExample extends Frame implements ActionListener  
 {  
TextField tf;
public ActionListenerExample()
{
        tf=new TextField();  
    tf.setBounds(50,50, 150,20);  
    Button b=new Button("Click Here");  
    b.setBounds(50,100,60,30);  
    b.addActionListener(this);  
    add(b);add(tf);  
   setSize(400,400);  
    setLayout(null);  
    setVisible(true);   
}  

public void actionPerformed(ActionEvent e){  
            tf.setText("Welcome to Javatpoint.");  
}  
public static void main(String[] args)
{
new ActionListenerExample();
}  }
