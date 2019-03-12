import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;


class login extends Frame implements ActionListener 
{TextField t1,t2;
 login(){
  Button b1= new Button("Login");
  Label l1= new Label("Name:",Label.RIGHT);
  Label l2= new Label("Password:",Label.RIGHT);
   t1= new TextField();
   t2= new TextField();

  
  add(l1);  
  add(l2);
  add(t1);  
  add(t2);
  add(b1);
  
   l1.setBounds(50,75,100,25);
  l2.setBounds(50,125,100,25);
  t1.setBounds(175,75,100,25);
  t2.setBounds(175,125,100,25);
  
  b1.setBounds(100,175,50,50);
  b1.addActionListener(this);
  
   t2.setEchoChar('*');
  setSize(400,400); 
  setLayout(null); 
  setVisible(true); 
 }
 public void actionPerformed(ActionEvent e)
  {   String pass = t2.getText();
      String uname = t1.getText();
	  if(pass.equals("12345"))
	  {
      Welcome wel = new Welcome(uname);
      wel.setVisible(true);
      this.dispose();
      }
	  else
	  {System.out.println("Bye");	  }		

  }  
      
}

class Welcome extends Frame
{
	Welcome(String s)
	{
		Label l1=new Label("Hello "+s);
		l1.setBounds(50,75,100,25);
		
		add(l1);
    setSize(400,400); 
    setLayout(null); 
    setVisible(true); 
	}
}
  class karthik
  {
	public static void main(String args[]){   
            login f=new login();
               }
   }
