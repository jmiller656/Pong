import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class MyView extends JFrame {
	private Court c;
	private JLabel score = new JLabel("0:0");
	public MyView(Court c){
		JPanel s = new JPanel();
		s.setBackground(Color.black);
		s.setLayout(new GridLayout(1,1));
		s.setAlignmentX(CENTER_ALIGNMENT);
		s.add(score);
		setResizable(false);
		score.setText("<html><center><font color='white' align='center'> 0:0 </font></center></html>");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setSize(510, 500);
		setBackground(Color.BLACK);
		//setContentPane(new JLayeredPane());
		getContentPane().setLayout(new BorderLayout());
		getContentPane().setBackground(Color.black);
		getContentPane().add(c);
		getContentPane().add(BorderLayout.SOUTH,s);
		score.setAlignmentX(Component.CENTER_ALIGNMENT);
		ScoreThread st = new ScoreThread(c,this);
		st.start();
		}
	public void setScore(int i, int j){
		System.out.println(i + " " + j);
		score.setText("<html><center><font color='white' align='center'> "+i+":"+j+" </font></center></html>");
		this.repaint();
	}
}
