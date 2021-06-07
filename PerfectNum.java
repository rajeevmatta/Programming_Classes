// perfect number

   import java.util.Scanner;
  class PerfectNum
{

  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");

    int n=sc.nextInt();
    int i=1,sum=0;
    
    while(i<=n/2)
     {
        if(n%i==0)
        sum=sum+i;
        i++;
     }
if(sum==n)
System.out.println(n+ "is perfect number");
else
System.out.println(n+ "is not perfect number");

  }
}