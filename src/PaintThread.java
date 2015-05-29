import java.awt.Color;
import java.awt.Graphics;


public class PaintThread extends Thread {
	private Graphics g;
	private Paddle p1,p2;
	private Ball b;
	public PaintThread(Graphics g, Paddle p1, Paddle p2, Ball b){
		this.g = g;
		this.p1 = p1;
		this.p2 = p2;
		this.b = b;
	}
	
	public void run(){
		g.setColor(Color.white);
		g.fillRect(p1.getX(), p1.getY(), p1.getW(), p1.getL());
		g.setColor(Color.white);
		g.fillRect(p2.getX(), p2.getY(), p2.getW(), p2.getL());
		g.setColor(Color.white);
		g.fillOval(b.getX(), b.getY(), b.getW(), b.getW());
		b.setX(b.getX()+b.getdX());
		b.setY(b.getY()+b.getdY());
		//System.out.println(b.getX()-10 + " " + b.getY() + 25);
		if((Math.abs(p1.getX()+10 -b.getX())<10 &&
			Math.abs(b.getY() - 25 -p1.getY())< 35 || 
		   (Math.abs(p2.getX()-b.getX())<10 && 
			Math.abs(p2.getY()+ 25 - b.getY())<35))){
			b.reflect();
		}

	}
}
