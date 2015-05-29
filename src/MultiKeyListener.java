import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.HashSet;


public class MultiKeyListener implements KeyListener {
	private HashSet<Integer> pressed = new HashSet<Integer>();
	private Paddle p1,p2;
	private Court c;
	public MultiKeyListener(Paddle p1, Paddle p2,Court c) {
		this.p1 = p1;
		this.p2 = p2;
		this.c = c;
	}

	@Override
	public synchronized void keyTyped(KeyEvent e) {
		
	}

	@Override
	public synchronized void keyPressed(KeyEvent e) {
		pressed.add(e.getKeyCode());
		for(Integer i: pressed){
			switch(i){
			case KeyEvent.VK_UP:
				if(!c.isPaused())
				p2.up();
				break;
			
			case KeyEvent.VK_DOWN:
				if(!c.isPaused())
				p2.down();
				break;
			
			case KeyEvent.VK_W:
				if(!c.isPaused())
				p1.up();
				break;
			
			case KeyEvent.VK_S:
				if(!c.isPaused())
				p1.down();
				break;
				
			case KeyEvent.VK_SPACE:
				c.pause();
				break;
		}
		}
	}

	@Override
	public synchronized void keyReleased(KeyEvent e) {
		pressed.remove(e.getKeyCode());
	}
}
