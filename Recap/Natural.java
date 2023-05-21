import java.util.Scanner;
public class Natural{
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    int count=1,sum=0,n;
    System.out.println("enter the n");
    n=sc.nextInt();
    while(count<=n){
      sum=sum+count;
    count=count+1;
    }
    System.out.println(sum);
  }
}
    