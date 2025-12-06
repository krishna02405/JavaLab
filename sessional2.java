class Messagethread extends Thread{
	String msg;
    int delay;
	Messagethread(String m,int d){
    	msg=m;
    	delay=d;
        }

        public void run() {
            try {
                Thread.sleep(delay);
                System.out.println(msg);
            } catch (Exception e) {
                System.out.println("Exception found: "+e);
            }
        }
    }
public class sessional2{
	public static void main(String [] args){
		Thread t1=new Messagethread("World Cup",2000);
		Thread t2=new Messagethread("Year 2025",4000);
		Thread t3=new Messagethread("Champion",6000);
		t1.start();
        t2.start();
        t3.start();
	}
}