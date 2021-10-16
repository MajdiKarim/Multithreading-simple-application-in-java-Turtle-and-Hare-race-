package ex4;

public class Turtle extends Thread {
    int distance_traveled = 0;
    
	public void run() {
		System.out.println("the turtle starts \n");
		while(distance_traveled < 25) {
		   try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   distance_traveled = distance_traveled + 1;
		   System.out.println("the turle traveled" + distance_traveled+" units\n");
		   
		
		
		   
		}
		
	
	}
}
