import java.util.Scanner;
public class Grade{
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    double phymarks,chemarks,biomarks,mathsmarks,computermarks,percentage;
    System.out.println("enter the marks of phy,che,bio,maths,computer");
    phymarks=sc.nextDouble();
    chemarks=sc.nextDouble();
    biomarks=sc.nextDouble();
    mathsmarks=sc.nextDouble();
    computermarks=sc.nextDouble();
    percentage=((phymarks+chemarks+biomarks+mathsmarks+computermarks)/500)*100;
    if(percentage>=90)
      System.out.println("grade A");
    else if(percentage>=80)
      System.out.println("grade B");
    else if(percentage>=70)
      System.out.println("grade C");
    else if(percentage>=60)
      System.out.println("grade D");
    else if(percentage>=40)
      System.out.println("grade E");
    else
      System.out.println("fail");
    
  }
  
}