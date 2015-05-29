import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;


public class Monitor extends JFrame {
	JLabel p1y = new JLabel();
	JLabel p2y = new JLabel();
	JLabel bx = new JLabel();
	JLabel by = new JLabel();
	JLabel bdx = new JLabel();
	JLabel bdy = new JLabel();
	public Monitor(){
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(200, 200);
		p1y.setText("P1y: 0");
		p2y.setText("P2y: 0");
		bx.setText("BallX: 0");
		by.setText("BallY: 0");
		bdx.setText("Balldx: 0");
		bdy.setText("Balldy: 0");
		this.add(p1y);
		this.add(p2y);
		this.add(bx);
		this.add(by);
		this.add(bdx);
		this.add(bdy);
		this.setVisible(true);
	}
	
	public void setP1y(int i){
		p1y.setText("P1y: " +i);
	}
	public void setP2y(int i){
		p2y.setText("P2y: " +i);
	}
	public void setbx(int i){
		bx.setText("bx: " +i);
	}
	public void setby(int i){
		by.setText("by: " +i);
	}
	public void setbdx(int i){
		bdx.setText("bdx: " +i);
	}
	public void setbdy(int i){
		bdy.setText("bdy: " +i);
	}
}
