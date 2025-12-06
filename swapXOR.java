import java.util.*;
class swapXOR{
	public static void main(String ags[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 nos:\t");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println("The nos are:\t"+n1+" "+n2);
		n1=n1^n2;
		n2=n1^n2;
		n1=n1^n2;
		System.out.println("The swapped nos are:  n1= "+n1+"  n2= "+n2);
	}
}