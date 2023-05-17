import java.util.Scanner;
import java.lang.Math;
public class Absolute_sqareroot {
  public  static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int a,b;
    System.out.println("enter the values of a and b");
    a=sc.nextInt();
      b=sc.nextInt();
    double sqa= Math.sqrt(a);
    double sqb=Math.sqrt(b);
    int absa=Math.abs(a);
    int absb=Math.abs(b);
    System.out.println("square value of a"+sqa);
    System.out.println("square value of b"+sqb);
    System.out.println("absolute value of a"+absa);
    System.out.println("absolute value of b"+absb);
  }
}