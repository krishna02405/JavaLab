// Implementing interface with  multiple inheritance
interface operation{
	void deposit(double amt);
	void withdraw(double amt);
}

class bank{
	int adhaarno,contactno;
	String name,address;
	void openaccount(String n,int no,String adr,int adhr){
		adhaarno=adhr;
		name=n;
		address=adr;
		contactno=no;
		System.out.println("The details(name,contact no,address,adhaar no) of the new customer are: "+name+" "+contactno+" "+address+" "+adhaarno);
	}
	void closeaccount(){
		System.out.println("The account is closed ");
	}
}
class HDFC extends bank implements operation{
	String accountno;
	double balance;
	public HDFC(double a,String accno){
		balance=a;
		accountno=accno;
	}

	 public void deposit(double amt){
		 balance+=amt;
		 System.out.println("The updated balance: "+balance);
	 }

	 public void withdraw(double amt){
		 balance-=amt;
		 System.out.println("The updated balance: "+balance);
	 }
 }

 public class lab6_Q3{
	 public static void main(String args[]){
		 HDFC myacc=new HDFC(45645.46,"HDFCKRI3435");

		 myacc.openaccount("Krishna Agarwal",798595,"Kolkata",249782);
		 myacc.closeaccount();

		 myacc.deposit(3243.54);
		 myacc.withdraw(24556.5);
	 }
 }






