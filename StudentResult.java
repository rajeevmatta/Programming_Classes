 import java.util.Scanner;
  
  class StudentResult
{

   String getResult(int m1,int m2,int m3,int m4)
   {
    if(m1<35||m2<35||m3<35||m4<35)
      return "fail";

     double per=(m1+m2+m3+m4)/100;
      if(m1>=85)
      return "Distriction";
      if(m2>=60)
      return "FirstClass";
      if(m3>=50)
      return "SecondClass";

      return "pass";
   }
   
    public static void main(String[] args)
    {
      
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the marks first sub: ");
       int n1=sc.nextInt();

       System.out.println("Enter the marks second sub: ");
       int n2=sc.nextInt();

       System.out.println("Enter the marks third sub: ");
       int n3=sc.nextInt();

       System.out.println("Enter the marks fourth sub: ");
       int n4=sc.nextInt();



       
    }
}