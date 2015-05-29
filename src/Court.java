import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComponent;
import javax.swing.Timer;


public class Court extends JComponent implements ActionListener {
	private Paddle p1,p2;
	private Ball b;
	private MyView v;
	private int l,r = 0;
	private boolean paused = true;
	public Court(Paddle p1,Paddle p2, Ball b) {
		this.p1 = p1;
		this.p2 = p2;
		this.b = b;
		Timer t = new Timer(1000/60, this);
		t.start();
	}

	public void paint(Graphics g){
			g.setColor(Color.white);
			g.fillRect(p1.getX(), p1.getY(), p1.getW(), p1.getL());
			g.setColor(Color.white);
			g.fillRect(p2.getX(), p2.getY(), p2.getW(), p2.getL());
			g.setColor(Color.white);
			if(b.getX()>500 || b.getX()<0){
				if(b.getX()>500){
					l++;
				}
				else{
					r++;
				}
				System.out.println(l + " " + r);
				b.reset();
				g.fillOval(b.getX(), b.getY(), b.getW(), b.getW());
				pause();
				return;
			}
			g.fillOval(b.getX(), b.getY(), b.getW(), b.getW());
			b.setX(b.getX()+b.getdX());
			b.setY(b.getY()+b.getdY());
		if((Math.abs(p1.getX()+10 -b.getX())<10 &&
				Math.abs(b.getY() - 25 -p1.getY())< 35 || 
			   (Math.abs(p2.getX()-b.getX())<10 && 
				Math.abs(p2.getY()+ 25 - b.getY())<35))){
					b.reflect();
			}
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(!paused)
			repaint();
	}
	
	public void pause(){
		paused = !paused;
	}
	
	public boolean isPaused(){
		return paused;
	}
	
	public int getL(){
		return l;
	}
	
	public int getR(){
		return r;
	}
}
