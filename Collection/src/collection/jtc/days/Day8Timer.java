package collection.jtc.days;

import java.util.Timer;
import java.util.TimerTask;

class HelloTask{
	Timer timer;
	HelloTask(int seconds){
		timer=new Timer();
		timer.schedule(new HelloTask1(), seconds*1000);
	}
	class HelloTask1 extends TimerTask{
		public void run() {
			System.out.println("Hello I am doing my Task");
			timer.cancel();
		}
	}
}
public class Day8Timer {
	public static void main(String[] args) {
		System.out.println("I am going to do few task.....");
		new HelloTask(5);
		System.out.println("Done****");
	}

}
