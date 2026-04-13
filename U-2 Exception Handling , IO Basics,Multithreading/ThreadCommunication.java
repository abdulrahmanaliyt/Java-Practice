//Interthread Communication

class ToffeeContainer {
	private boolean hasToffee = false;

	public synchronized void putToffee() {
		while (hasToffee) {
			try {
			wait(); // Wait if toffee already present
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Mother puts a toffee in the container.");
		hasToffee = true;
		notify(); // Notify the son that toffee is available
	}
public synchronized void takeToffee() {
	while (!hasToffee) {
		try {
			wait(); // Wait until mother puts the toffee
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	System.out.println("Son takes the toffee from the container.");
	hasToffee = false;
	notify(); // Notify the mother that container is empty
	}
}

class Mother implements Runnable {
	ToffeeContainer container;
	
	Mother(ToffeeContainer container) {
		this.container = container;
	}
	public void run() {
		for (int i = 1; i <= 5; i++) {
			container.putToffee();
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
					System.out.println(e);
			}
		}
	}
}

class Son implements Runnable {
	ToffeeContainer container;
	Son(ToffeeContainer container) {
		this.container = container;
	}
	public void run() {
		for (int i = 1; i <= 5; i++) {
			container.takeToffee();
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}

public class ThreadCommunication {
	public static void main(String[] args) {
		ToffeeContainer container = new ToffeeContainer();

		// Mother Thread
		Thread mother = new Thread(new Mother(container));

		// Son Thread
		Thread son = new Thread(new Son(container));
	
		mother.start();
		son.start();
	}
}