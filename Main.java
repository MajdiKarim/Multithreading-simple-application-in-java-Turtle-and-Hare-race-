package ex4;

public class Main {
	
    public static void main(String[] args) throws InterruptedException {
	    Turtle T = new Turtle();
	    Hare L = new Hare();
	    T.start();
	    L.start();
	    T.join();
	    L.stop();
	    System.out.println("The turtle won the race\n");
	    
	    
}
}
