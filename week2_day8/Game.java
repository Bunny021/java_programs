import java.util.Scanner;
public class Game{
  public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    int player1,player2;
    System.out.println("enter the move 1-rock");
    System.out.println("enter the move 2-paper");
      System.out.println("enter the move 3-scissor");
    player1= sc.nextInt();
    player2=sc.nextInt();
    if((player1==1)&&(player2==2))
       System.out.println("player2 is winner");
    else if((player1==1)&&(player2==3))
      System.out.println("player1 is winner");
    else if((player1==2)&&(player2==3))
      System.out.println("player2 is winner");
    else if((player1==3)&&(player2==2))
      System.out.println("player2 is wimmer");
    else if((player1==3)&&(player2==2))
    System.out.println("player2 is winner");
    else if(player1==player2)
    System.out.println("tie");
    
  }
}