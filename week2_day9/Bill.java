/*For first 50 units Rs. 0.50/unit
    For next 100 units Rs. 0.75/unit
    For next 100 units Rs. 1.20/unit
     For unit above 250 Rs. 1.50/unit
     An additional surcharge of 20% is added to the bill*/
      
import java.util.Scanner;
public class Bill{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
     double units,bill,final_bill;
    System.out.println("enter the units");
    units=sc.nextDouble();
    if(units<=50)
      bill =units*0.50;
    else if(units<150)
      bill =(50*0.5)+(units-50*0.75);
    else if(units<=250)
      bill =(50*0.5)+(100*0.75)+(units-100*1.20);
    else
      bill =(50*0.50)+(100*0.75)+(100*1.20)+((units-250)*1.50);
    final_bill =bill+(20*bill/100);
      System.out.println("final bill is" + final_bill);
  }
}