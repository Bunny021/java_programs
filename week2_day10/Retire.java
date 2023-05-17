import java.util.Scanner;
public class Retire{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int age,retire;
    System.out.println("enter the age");
    age=sc.nextInt();
    System.out.println("retire"+ (65-age));
  }
}