  import java.util.*;
class bitwise{
	public static void main(String ags[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter marks:\t");
		int marks=sc.nextInt();
		if(marks<0 & marks>100){
			System.out.println("Enter valid marks!");
		}
		else if(marks<=50 | marks>=95){
			System.out.println("The student can provided with special attention");
		}
		else{
			System.out.println("The student has passed");
		}
	}
}
