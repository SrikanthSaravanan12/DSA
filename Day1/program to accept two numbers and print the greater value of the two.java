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
	    int m=in.nextInt();
	    if(n>m){
	        System.out.println("Greater Value"+n);
	    }
	    else{
	        System.out.println("Greater Value "+m);
	    }
	
	}
}
