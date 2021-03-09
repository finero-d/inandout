package inandout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Structure extends JFrame {
	private static Structure instance;
	private Structure(JPanel e) {
		setTitle("1팀 프로젝트");
		setLayout(null);
		setSize(1000, 1200);
		
		add(e);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void getter(JPanel e) {
		instance=new Structure(e);
		instance.getContentPane().removeAll();
		instance.getContentPane().add(e);
		
		instance.revalidate();
		instance.repaint();
	}
}
