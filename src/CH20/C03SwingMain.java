package CH20;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class C03SwingMain {
	public static void main(String[] args) {
		new C03GUI();
	}

}

class C03GUI extends JFrame {

	C03GUI() {
		super("세번째 프레임입니다");
		setBounds(100, 100, 1200, 800);
		
		JPanel panel = new JPanel();
		Color col = new Color(233, 233, 15);
		panel.setBackground(col);
		add(panel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

}
