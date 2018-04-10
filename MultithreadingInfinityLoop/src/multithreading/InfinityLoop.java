package multithreading;


import java.util.ArrayList;

public class InfinityLoop implements Runnable {

	static final ArrayList<String> infinilist = new ArrayList<String>();

	public static void main(String[] args) {

		InfinityLoop d = new InfinityLoop();
		for (int i = 1; i <= 3; i++) { // create three simultaneous threads
			Thread t = new Thread(d);
			t.setName("Thread: " + i);// Names the 3 individual threads
			t.start(); // starts the thread
		}
	}


	@Override
	public void run() {

		synchronized(this) {//The synchronized code will only be executed by one thread at a time. 
			for(;;){//infinite loop
				if (infinilist.isEmpty() || infinilist.get(infinilist.size()-1).equals("infinite")){
					infinilist.add("this");
					System.out.println(infinilist.get(infinilist.size()-1));
				}
				else if(infinilist.get(infinilist.size()-1).equals("this")) {
					infinilist.add("is");
					System.out.println(infinilist.get(infinilist.size()-1));
				}
				else if(infinilist.get(infinilist.size()-1).equals("is")) {
					infinilist.add("infinite");

					System.out.println(infinilist.get(infinilist.size()-1));
					try {
						int seconds = 1;
						Thread.sleep(Math.round(1000*seconds));
					} catch(InterruptedException e) {
						System.out.println(e);
					}
					//The loop infinitely adds a new word to the arraylist, depending on
					//the previous word. It then prints this newly added word by way of
					//infinilist.size()-1
					//The sleep method is used simply to break up the console printout
					//in order to clearly see the threads in use.
				}	

			}
		}
	}
}