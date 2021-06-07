/* print the name number of times*/ 
import java.util.Scanner;
class MainName
{

public static void main(String[] args)
   {

 Scanner sc=new Scanner(System.in);
  System.out.println("Enter your name");
  String name=sc.nextLine();
System.out.println("start");
   int n=sc.nextInt();
   while(n>0)
       {
         System.out.println("your name is :" + name);
         n--;
       }

    }
}