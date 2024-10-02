package CH20;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class C04SwingMain {
	public static void main(String[] args) {
		new C04GUI();
	}

}

class C04GUI extends JFrame {

	C04GUI() {
		super("네번째 프레임입니다");
		setBounds(100, 100, 1200, 800);

		JPanel panel = new JPanel();
		add(panel);
		
		JButton btn1 = new JButton("BUTTON01");
		btn1.setBounds(10, 10, 100, 30);
		JButton btn2 = new JButton("BUTTON01");
		btn2.setBounds(120, 10, 100, 30);
		
		JTextField txt1 = new JTextField();
		txt1.setBounds(10, 50, 210, 30);
		
		JTextField txt2 = new JTextField();
		txt2.setBounds(10, 90, 210, 30);
		
		JTextArea area = new JTextArea();
		area.setBounds(10, 130, 210, 200);
		
		JScrollPane scroll = new JScrollPane();
		scroll.setBounds(10, 130, 210, 200);
		
		
		
		panel.setLayout(null);
		panel.add(btn1);
		panel.add(btn2);
		panel.add(txt1);
		panel.add(txt2);
		panel.add(area);
		panel.add(scroll);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
