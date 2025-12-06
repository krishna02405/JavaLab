import java.util.*;
public class sum_diagonal{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int arr[][]=new int[3][3];
		System.out.println("Enter values in array:\t");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		int l_sum=0;
		int r_sum=0;
		for(int k=0;k<3;k++){
			l_sum=l_sum+arr[k][k];
			r_sum=r_sum+arr[k][3-k-1];
			}
			System.out.println("The sum of left diagonal and right diagonal are:\t"+l_sum+" "+r_sum);

		}
	}