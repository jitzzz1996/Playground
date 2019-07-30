import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner in = new Scanner(System.in);
	    int base = in.nextInt();
	    int power=in.nextInt();
      System.out.println(Powerof(base,power));
	    
	}
	// Function to find the prime number
	public static double Powerof(int b,int p)
	{
	    return Math.pow(b,p);
	}
}// End of Main class