 import java.util.Scanner;
class Main1
{

public static void main(String[] args)
   {

  sc=new Scanner(System.in);
  System.out.println("Enter your name");
  String name=sc.nextLine();

   int n=sc.nextInt();
   while(n>0)
       {
         System.out.println("your name is :" + name);
         n--;
       }

    }
}