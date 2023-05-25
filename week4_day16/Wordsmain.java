import java.util.Scanner;
class Words{
  public void na(){
  Scanner sc=new Scanner(System.in);
    int count=0;
    System.out.println("enter the string");
    String str=sc.nextLine();
    for(int i=0;i<str.length();i++){
      count++;
    }
  System.out.println(count);    
  }
}
 public class Wordsmain{
  public static void main(String[] args){
    Words a= new Words();
    a.na();
  }
}