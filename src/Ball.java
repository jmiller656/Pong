
public class Ball {
	private int x,y,w;
	private int dy, dx;
	public Ball(int x, int y, int w){
		this.x = x;
		this.y = y;
		this.w = w;
		this.dy = 0;
		this.dx = 3;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public int getW(){
		return w;
	}
	
	public int getdX(){
		return dx;
	}
	
	public int getdY(){
		return dy;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public void setY(int y){
		if(y>460 || y<0){
			this.dy = dy*-1;
			return;
		}
		this.y = y;
	}
	
	public void setW(int w){
		this.w = w;
	}
	
	public void reflect(){
		System.out.println("reflect");
		this.dx = dx*-1;
		int ch = (int) Math.random()*3 + 1;
		if(dx >0 && Math.abs(dx)<5)
			dx += 1;
		else
			dx -= 1;
		this.dy += ch;
	}

	public void reset(){
		this.x = 245;
		this.y = 245;
		this.dy = (int)(Math.random()*10 - Math.random()*10);
		this.dx = 3;
	}
}
