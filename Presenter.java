import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



/*
 * Set graphical interface. BUttons, frame, text area, all except the picture in the middle
 * 
 * 
 * 
 */
public abstract class Presenter implements ActionListener
{
	JTextField textField;
	
	public void showText(String text) {
       textField.setText(text);
	}
	
	public JFrame createFrame(){
		   JFrame frame = new JFrame();
		   frame.setSize(350, 350);
		   frame.setLayout(new BorderLayout());
		   
		   textField = new JTextField(10);
	       frame.add(textField);
		   JButton westButton = new JButton("<");
	       JButton eastButton = new JButton(">");
	       frame.add(westButton, BorderLayout.WEST);
	       frame.add(eastButton, BorderLayout.EAST);
	       frame.add(createCenterComponent(), BorderLayout.CENTER);
	       frame.add(textField, BorderLayout.SOUTH);
		   
		   
		   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   frame.setVisible(true);
		   
	        westButton.addActionListener(new ActionListener(){
	     			public void actionPerformed(ActionEvent event){
	     				westButtonPressed();
	     			}
	     		});
	        
	        eastButton.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent event){
					eastButtonPressed();
				}
			});
	       
		   return frame;
	}
	
	
	
	public abstract JLabel createCenterComponent();
	public abstract void northButtonPressed();
	public abstract void eastButtonPressed();
	public abstract void southButtonPressed();
	public abstract void westButtonPressed();
	public abstract void showPresenter();
}