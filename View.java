import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends Presenter{
	
	private JLabel drawArea;
    private JButton westButton;
    private JButton eastButton;
    JTextField textField;
    int count;
    ImageIcon[] pictures;
	
    public View(ImageIcon[] lib){
    	
    	count = 0;
    	
    	pictures = lib;
        JFrame frame = new JFrame();
        frame.setSize(350, 350);
        frame.setLayout(new BorderLayout());
        
        drawArea = new JLabel();
        westButton = new JButton("<");
        eastButton = new JButton(">");
        textField = new JTextField(10);
        textField.setText(pictures[0].getDescription());
        
        ImageIcon icon = pictures[count];
        drawArea.setIcon(icon);
        
        frame.add(drawArea, BorderLayout.CENTER);
        frame.add(westButton, BorderLayout.WEST);
        frame.add(eastButton, BorderLayout.EAST);
        frame.add(textField, BorderLayout.SOUTH);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        
        westButton.addActionListener(new ActionListener(){
     			public void actionPerformed(ActionEvent event){
     				rightButton();
     			}
     		});
        
        eastButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
				leftButton();
			}
		});
    }

	@Override
	public void leftButton() {
		if(count == pictures.length - 1) count = 0;	
		else count++;
		
		ImageIcon icon = pictures[count];
        drawArea.setIcon(icon);
        drawArea.repaint();
		textField.setText(pictures[count].getDescription());
		
	}

	@Override
	public void rightButton() {
		if(count == pictures.length - 1) count = 0;	
		else count++;
		
		ImageIcon icon = pictures[count];
        drawArea.setIcon(icon);
        drawArea.repaint();
		textField.setText(pictures[count].getDescription());
		
	}



}
