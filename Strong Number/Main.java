import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int temp=n,temp2;
      int fact=1,result=0;
      while(temp>0)
      {
        temp2=temp%10;
        fact=1;
        for(int i=1;i<=temp2;i++)
      {

        fact=fact*i;

      }
        result=result+fact;
        temp=temp/10;
             


      }
     
      if(result==n)
      {
              System.out.println("Yes");

      }
      else
      {
              System.out.println("No");

      }
	}
}