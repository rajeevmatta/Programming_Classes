import java.util.Scanner;
Class MonthDay
{
int dayno;
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the day);

int dayno=sc.nextInt();

switch (dayno)
    {
      case 1:
      System.out.println("Monday");
      break;

case 2:
      System.out.println("Tuesday");
      break;
case 3:
      System.out.println("Wedday");
      break;
case 4:
      System.out.println("Thursday");
      break;

case 5:
      System.out.println("Friday");
      break;

case 6:
      System.out.println("Saterday");
      break;

case 7:
      System.out.println("Sunday");
      break;

default:

System.out.println("Invalid");
break;

}
}
}

