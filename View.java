import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View{
	
	private JTextArea textArea;
	private JLabel drawArea;
    private JButton westButton;
    private JButton eastButton;
    JTextField textField;
    int count;
	
    public View(){
    	
    	count = 0;
    	
    	final ImageIcon[] pictures = new ImageIcon[3];
    	String[] texts = new String[3];
    	
    	pictures[0] = new ImageIcon("Dog1.png");
    	pictures[1] = new ImageIcon("Dog2.png");
    	pictures[2] = new ImageIcon("Dog3.png");
    	
    	texts[0] = "This is the first dog.";
    	texts[1] = "This is the second dog.";
    	texts[2] = "This is the third dog.";
    	
        final JFrame frame = new JFrame();
        frame.setSize(350, 350);
        frame.setLayout(new BorderLayout());
        
        textArea = new JTextArea();
        drawArea = new JLabel();
        westButton = new JButton("<");
        eastButton = new JButton(">");
        textField = new JTextField(10);
        textField.setText(texts[count]);
        
        westButton.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent event){
				
				count--;
				ImageIcon icon = pictures[count];
		        drawArea.setIcon(icon);
				frame.add(drawArea, BorderLayout.CENTER);
				
			}
			
		});
        
        eastButton.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent event){
				
				count++;
				ImageIcon icon = pictures[count];
		        drawArea.setIcon(icon);
				frame.add(drawArea, BorderLayout.CENTER);
				
			}
			
		});

        ImageIcon icon = pictures[count];
        drawArea.setIcon(icon);
        
        frame.add(textArea);
        frame.add(drawArea, BorderLayout.CENTER);
        frame.add(westButton, BorderLayout.WEST);
        frame.add(eastButton, BorderLayout.EAST);
        frame.add(textField, BorderLayout.SOUTH);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.pack();
        frame.setVisible(true);

    }

	/*@Override
	public void eastButtonPressed() {
		
		
		
	}*/



}
