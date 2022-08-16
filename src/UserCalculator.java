
import java.util.Scanner;

class Menu{
	
	long add(long a,long b) {
		long s=a+b;
	  return s;
	}
	long sub(long a,long b) {
		long s=a-b;
		  return s;
		}
	long mul(long a,long b) {
		long s=a*b;
		  return s;
		}
	double div(long a,long b) {
		double s=(double)a/b;    //  Explicit type casting
		  return s;
		}
	
}

public class UserCalculator {

	static int input;

	public static void main(String[] args) {
		Menu obj=new Menu();
		  Scanner sc=new Scanner(System.in);
	do {	
   
     System.out.println("Enter 1 for Addition of two numbers");
     System.out.println("Enter 2 for Subtruction of two numbers");
     System.out.println("Enter 3 for Multiplication of two numbers");
     System.out.println("Enter 4 for Division of two numbers");
     System.out.println("Enter 0 to exit the Application");
     input=sc.nextInt();
     if(input==0) {
    	 System.out.println("Application is closed");
    	 System.exit(0);
     }else if(input>=5){
    	 System.out.println("Please enter valid input");
    	 System.out.println("----------------------------------");
     }else {
	
     System.out.println("Enter first number");
     long n1=sc.nextLong();
   	 System.out.println("Enter second number");
   	long n2=sc.nextLong();
     switch(input){
     case 1:
    	 long result =obj.add(n1,n2);
    	 System.out.println("Addition is : "+result);
    	 System.out.println("----------------------------------");
    	 break;
     case 2:
    	 long result1 =obj.sub(n1,n2);
    	 System.out.println("Subtruction is : "+result1);
    	 System.out.println("----------------------------------");
    	 break;
     case 3:
    	 long result2 =obj.mul(n1,n2);
    	 System.out.println("Multiplication is : "+result2);
    	 System.out.println("----------------------------------");
    	 break;
     case 4:
    	 double result3 =obj.div(n1,n2);
    	 System.out.println("Division is : "+result3);
    	 System.out.println("----------------------------------");
    	 break;
    default :
    	System.out.println("Please enter valid input");
     }
	}
	}while(input!=0);
    sc.close();
	}

}
