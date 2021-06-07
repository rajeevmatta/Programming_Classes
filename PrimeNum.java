// prime number or not
import java.util.Scanner;
  
  class PrimeNum
{
   static boolean isprime(int x)
   {
    int i=2;
    while(i<=x/2)
     {
     if(x/i==0)
      return false;
     i++;
     }
    return true;
   }




  public static void main(String[] args)
  { 
  Scanner sc=new Scanner(System.in);
  int ns=sc.nextInt();

   boolean res=isprime(n);
    if(res==true)
     System.out.println(n+ "is prime number");
  else
    System.out.println(n+ "is not prime number");
  }

}