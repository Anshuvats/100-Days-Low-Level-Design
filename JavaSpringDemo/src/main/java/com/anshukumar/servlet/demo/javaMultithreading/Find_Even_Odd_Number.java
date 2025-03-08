package javaMultithreading;

public class Find_Even_Odd_Number {
	
	private static final int MAX_NUMBER=20;
	private static Object lock=new Object();
	private static boolean evenTurn=true;

	public static void main(String[] args) {
		
		Thread evenThread = new Thread(()->{
			for(int i=2;i<=MAX_NUMBER;i+=2) {
				synchronized(lock) {
					while(!evenTurn) {
						try {
							lock.wait();
						}catch(InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println("Even Number from Even Thread is :"+i);
					evenTurn=false;
					lock.notify();
				}
			}
		});
		
		Thread oddThread = new Thread(()->{
			for(int i=1;i<=MAX_NUMBER;i+=2) {
				synchronized(lock) {
					while(evenTurn) {
						try {
							lock.wait();
						}catch(InterruptedException e) {
							e.printStackTrace();
						}
					}
				System.out.println("odd Number from odd Thread is :"+i);
				evenTurn=true;
				lock.notify();
				}
			}
		});
		
		evenThread.start();
		oddThread.start();
	}

}
