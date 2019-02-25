import java.util.Scanner;

 class Fibonacci {

	public static void main(String[] args) {
	
 Scanner scan=new Scanner (System.in);
		    int n=scan.nextInt();
		    int a=0,b=1;
		    int c;
		    System.out.println(a+",\n"+b+",");
		    for(int i=0;i<n-2;i++)
		    {
		      c=a+b;
		      a=b;
		      b=c;
		      System.out.println(c+",");
		    }
		    
		    
		}
		}