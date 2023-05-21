//factorialof 
mport java.util.Scanner;
public class Reverse1{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int n,i;
    System.out.println(" enter the value of n");
    n=sc.nextInt();

    for(i=1;i<=n;i++){
      i=i*n;
    }
    System.out.println("factorial of" +n+"is:"+i);
    }
  }
}