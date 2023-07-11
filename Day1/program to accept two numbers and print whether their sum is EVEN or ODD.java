/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner; 

public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int a=in.nextInt();
	    int b=in.nextInt();
	    int n=a+b;
	    if(n%2==0){
	        System.out.println("The sum is Even");
	    }
	    else{
	        System.out.println("The sum is Odd");
	    }
	    
	
	}
}
