public class Main {

	public static void main(String[] args) {
		Paddle p1 = new Paddle(10,210,50,20);
		Paddle p2 = new Paddle(470,210,50,20);
		Ball b = new Ball(245,245,10);
		Court c = new Court(p1,p2,b);
		MyView v = new MyView(c);
		//Monitor m = new Monitor();
		//MonitorThread mt = new MonitorThread(b,p1,p2,m);
		v.addKeyListener(new MultiKeyListener(p1,p2,c));
		//mt.start();
	}
}
