import java.util.Scanner;
public class Alphabet_digit_special
{
    public static void main(String args[])
    {
        char c;
        Scanner s=new Scanner(System.in);
        System.out.println("enter any  character");
        c=s.next().charAt(0);
        
        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
                    System.out.println(c + " is an alphabet.");
            else if((c>='0') && (c<='9'))
                    System.out.println(c + " is a digit.");
      else
       System.out.println(c + " is a special symbol.");
    }
}
        