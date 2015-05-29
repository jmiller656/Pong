
public class Paddle {
private int x,y,l,w;

public Paddle(int x, int y, int l, int w){
	this.setX(x);
	this.setY(y);
	this.setL(l);
	this.setW(w);	
}

public int getY() {
	return y;
}

public void setY(int y) {
	this.y = y;
}

public int getL() {
	return l;
}

public void setL(int l) {
	this.l = l;
}

public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}

public int getW() {
	return w;
}

public void setW(int w) {
	this.w = w;
}

public void up(){
	if(y==0)
		return;
	else{
		y-=30;
	}
		
}

public void down(){
	if(y>=420)
		return;
	else{
		y+=30;
	}
}
}
