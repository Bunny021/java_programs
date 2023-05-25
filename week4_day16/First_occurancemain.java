import java.util.Scanner;
class First_occurance{
  public void na(){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the string");
    String str=sc.nextLine();
    System.out.println("enter the character");
    char ch=sc.nextLine().charAt(0);
     System.out.println(ch);
    System.out.println(str.indexOf(ch));
    
  }
}
public class First_occurancemain{
  public static void main(String [] args){
    First_occurance a= new First_occurance();
    a.na();
  }
}