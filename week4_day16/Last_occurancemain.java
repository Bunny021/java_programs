import java.util.Scanner;
class Last_occurance{
  public void na(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string");
    String str=sc.nextLine();
    System.out.println("enter the character");
    char ch=sc.next().charAt(0);
    System.out.println(str.lastIndexOf(ch));
    
  }
}
public class Last_occurancemain{
  public static void main(String[] args){
    Last_occurance a= new Last_occurance();
    a.na();
  }
}