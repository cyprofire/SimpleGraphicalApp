import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI  implements ActionListener {	//implements actionlistener to listen to the onclick event
	//all these are declared private so that they can be used by all the class methods like actionPerformed and main etc
	private JFrame frame;	//JFrame object created
	private JPanel panel;	//JPanel object created
	private JButton button;	//JButton object created
	private JLabel label;	//JLabel object created
	private int count = 0;	//counter for the clicks

	public GUI() {	//default constructor for the class which should be public so that it can be accessed by the main fn
		
		frame = new JFrame();	//creation of frame object in memory

		panel = new JPanel();	//creation of panel object in memory
	
		button = new JButton("Click Me");	//button created
		
		label = new JLabel("No. of clicks: 0");	//label created
		
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));	//created panel with a border
		panel.setLayout(new GridLayout(0, 1));	//gridlayout used

		//button.setSize(5, 5);
		panel.add(button);	//button added to panel
		panel.add(label);	//label added to panel
		button.addActionListener(this);	//the button listens to the action performed in its own object (i.e current instance of the class)
		
		frame.setSize(500, 500);	//setting size of frame
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Mukul's App");	//setting title of the window
		frame.pack();
		frame.setVisible(true);
	
	}
	
	public static void main(String[] Args) {
		
		new GUI();	//instanciating the class and hence calling the constructor

	}

	@Override	//for overriding the actionPerformed method defined in the superclass i.e. ActionListener
	public void actionPerformed(ActionEvent e) {	//activates on the action performed on the button and ovverrides the default method in the superclass i.e.ActionListener
		count++;	//increasing the count
		label.setText("No. of clicks: " + count);	//sets the text in the label with updated value
		
	}
}
