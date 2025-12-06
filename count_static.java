 class counter{
	static int count=0;

	counter(){
		count++;
	}

	static void showcount(){
		System.out.println("The no of objects is: "+count);
	}
}
	public class count_static{
		public static void main(String []args){
			counter c1=new counter();
			counter c2=new counter();

			counter.showcount();
			}
		}