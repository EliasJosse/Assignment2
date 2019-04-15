import javax.swing.*;
import java.awt.*;

public class View {
	
	private JTextArea textArea;
	private JLabel drawArea;
    private JButton westButton;
    private JButton eastButton;
    JTextField textField;
	
    public View(){
    	
        final JFrame frame = new JFrame();
        frame.setSize(1000, 1000);
        frame.setLayout(new FlowLayout());
        
        textArea = new JTextArea();
        drawArea = new JLabel();
        westButton = new JButton("<");
        eastButton = new JButton(">");
        textField = new JTextField(10);
        textField.setText("");

        ImageIcon icon = new ImageIcon("Dog1.png");
        drawArea.setIcon(icon);
        
        frame.add(textArea);
        frame.add(drawArea);
        frame.add(westButton);
        frame.add(eastButton);
        frame.add(textField);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.pack();
        frame.setVisible(true);

    }

}
