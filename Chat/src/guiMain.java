
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class guiMain extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new guiMain();
		
	}
	
	
	public guiMain (){
		
		JPanel panel = new JPanel();
		JLabel jlbHelloWorld = new JLabel("Hello World");
		JButton testButton = new JButton();
		add(jlbHelloWorld);
		add(panel);
		//add(testButton);
		this.setSize(500, 500);
		// pack();
		setVisible(true);
		
	}
	

}
