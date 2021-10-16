package ex4;

public class Hare extends Thread {
    int distance_traveled = 0;
   
	public void run() {
		System.out.println("The hare starts\n");
		while(distance_traveled < 25) {
		   
			if (distance_traveled == 15) {
				System.out.println("The hare sleeps !!\n");	 
				try {
					Thread.sleep(100000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("The hare wakes up!!\n");
		   try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		   distance_traveled = distance_traveled + 1;
		   System.out.println("The hare traveled " + distance_traveled+" units\n");
	}
		
	}
	
}

