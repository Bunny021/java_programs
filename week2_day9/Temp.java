import java.util.Scanner;
public class Temp{
public static void main(String[]args){
  char ch;
  float C,F;
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter any character");
  ch=sc.next().charAt(0);
  if(ch=='c'||ch=='C')
  {
    System.out.println("Enter the value of C");
    C=sc.nextFloat();
    F= (C*9/5+32);
    System.out.println("temp of f is"+F);
  }
  else if(ch=='f'||ch=='F')
  {
    System.out.println("Enter the F");
    F=sc.nextFloat();
    C=(F-32)*5/9;
    System.out.println("temperature of c is"+C);
  }
  else
    System.out.println("invalid character");
    
  }
}