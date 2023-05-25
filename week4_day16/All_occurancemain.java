import java.util.Scanner;
class All_occurance{
  public void na(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string");
    String str=sc.nextLine();
    System.out.println("enter the character");
    char ch=sc.next().charAt(0);
    for(int i=0;i<str.length();i++){
    if(ch==str.charAt(i))
    System.out.println(i);
    }
  }
}
public class All_occurancemain{
  public static void main(String[] args){
    All_occurance a= new All_occurance();
    a.na();
  }
}