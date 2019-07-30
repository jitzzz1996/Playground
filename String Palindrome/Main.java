import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in=new Scanner(System.in);
      String str=in.nextLine();
      String result="";
      for(int i=str.length()-1;i>=0;i--)
      {
        result=result+str.charAt(i);
      }
      if(result.equals(str))
      {
        System.out.println("Yes");
      }
      else
      {
        System.out.println("No");

      }
    } 
}