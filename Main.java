import java.util.*;
class box{

		float length,breadth,height;
		void setdim(){
			System.out.println("The dimensions are: "+length+" "+breadth+" "+height);
		}
		void volume(){
			System.out.println("The volume is:\t"+length*breadth*height);
		}

}
public class Main{
	public static void main(String[] args){
		box b1=new box();
		box b2=new box();
		b1.length=14;
		b1.breadth=11.2f;
		b1.height=6.8f;
		b1.setdim();
		b1.volume();
	}
}
