package Inheritance;

public class App{

	public static void main(String [] args) {
		Machine m1=new Machine();
		m1.start();
		m1.stop();
		
		Car c1=new Car();
		c1.start();
		c1.speed();
		c1.color();
		c1.info();
		c1.stop();
	}
}
