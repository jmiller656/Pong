
public class ScoreThread extends Thread {
	private int l,r = 0;
	private Court c;
	private MyView v;
	public ScoreThread(Court c,MyView v){
		this.c = c;
		this.v = v;
	}
	
	public void run(){
		while(true){
			System.out.println("");
			if(l != c.getL() || r != c.getR()){
				this.l = c.getL();
				this.r = c.getR();
				v.setScore(c.getL(),c.getR());
			}
		}
	}
}
