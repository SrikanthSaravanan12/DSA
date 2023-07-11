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
	    int n=in.nextInt();
	    if(n>0){
	        System.out.println("Positive");
	    }
	    else if(n<0){
	        System.out.println("Negative");
	    }
	    else{
	        System.out.println("Zero");
	    }
	
	}
}
