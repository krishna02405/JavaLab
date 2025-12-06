class Student{
	int roll_no;
	String course;

	void register(int r,String c){
		roll_no=r;
		course=c;
		System.out.println("roll no: "+roll_no+" Course: "+course+" is registered!");
	}
}
class Kiitian extends Student{
	void hostelrequest(){
		System.out.println("Hostel request application is submitted for roll no:\t"+roll_no);
	}
}
public class inheritence{
	public static void main(String []args){
		Kiitian k1=new Kiitian();
		k1.register(10,"IT");
		k1.hostelrequest();
	}
}