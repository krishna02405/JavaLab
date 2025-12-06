// write code to demonstrate abstract class
abstract class student{
	int roll_no;
	int regno;
	abstract void course();
	public student(int r,int reg){
		roll_no=r;
		regno=reg;
	}
}

class kiitian extends student{
	public kiitian(int r,int reg){
		super(r,reg);
	}
	void course(){
		System.out.println("student roll and registration no: "+roll_no+" "+regno+" is registed in course IT!");
	}
}

public class lab6_Q1{
	public static void main(String []args){
		kiitian std1=new kiitian(2406035,634665);
		std1.course();
	}
}