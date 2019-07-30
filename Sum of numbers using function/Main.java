import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      
        Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      System.out.println(sumofnumber(n));
	} 
  public static int sumofnumber(int n)
  {
    int sum=0;
    for(int i=n;i>=1;i--)
    {
      sum=sum+i;
    }
    return sum;
  }
	
}