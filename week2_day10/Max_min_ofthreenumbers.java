import java.util.Scanner;
public class Max_min_ofthreenumbers{
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    int n1,n2,n3;
    System.out.println("enter the value of n1,n2,n3");
    n1=sc.nextInt();
    n2=sc.nextInt();
    n3=sc.nextInt();
    if(n1>n2&&n1>n3)
      System.out.println("n1 is the maximum number");
    else if(n2>n1&&n2>n3)
      System.out.println("n2 is the maximum number");
    else if(n3>n2&&n3>n1)
      System.out.println("n3 is the maximum number");
    if(n1<n2&&n1<n3)
      System.out.println("n1 is the minimum number");
    else if(n2<n3&&n2<n1)
      System.out.println("n2 is the minimum number");
    else 
      System.out.println("n3 is the minimum number");
      
      
  } 
}