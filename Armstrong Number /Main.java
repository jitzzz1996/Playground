import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int temp=n,temp2=n,count=0;
      double sum=0;
      while(temp>0)
      {
			count++;
        temp=temp/10;
      }
      for(int i=1;i<=count;i++)
      {
        sum=sum+Math.pow(temp2%10,count);
        temp2=temp2/10;
      }
      if(n==sum)
      {
        System.out.println("Armstrong Number");
      }
      else
      {
                System.out.println("Not a Armstrong Number");

      }
     
	}
}