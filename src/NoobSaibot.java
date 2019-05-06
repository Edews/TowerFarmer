import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class NoobSaibot implements Runnable {
	public void run() {
		try {
			Robot NoobSaibot = new Robot();
			while (true) {
				NoobSaibot.keyPress(KeyEvent.VK_ENTER);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		} catch (AWTException e) {
			e.printStackTrace();
		}

	}

}
