
public class MonitorThread extends Thread {
	private Ball b;
	private Paddle p1,p2;
	private Monitor m;
	public MonitorThread(Ball b, Paddle p1, Paddle p2, Monitor m){
		this.b =b;
		this.p1=p1;
		this.p2=p2;
		this.m = m;
	}
	public void run(){
		while(true){
		m.setP1y(p1.getY());
		m.setP2y(p2.getY());
		m.setbdx(b.getdX());
		m.setbdy(b.getdY());
		m.setbx(b.getX());
		m.setby(b.getY());
		}
	}
}
