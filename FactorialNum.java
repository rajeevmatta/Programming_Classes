// factorial of number

import java.util.Scanner;

 class FactorialNum
{

 static int fact(int num)
   {
   int fact=1;
     while(num>0)
       {
          fact=fact*num;
          num--;
       }
       return fact;
}


   public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
System.out.println("Enter the number");
 int num=sc.nextInt();

System.out.println(fact(num));
sc.close();

}


}
