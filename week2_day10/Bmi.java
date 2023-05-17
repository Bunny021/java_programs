/*Write a Java program that prompts the user to enter their weight in kilograms and height in meters, and calculates their body mass index (BMI) using conditional statements and you need to print underweight,healthy ,overweight and obessity according to the following
    bmi <18                underweight
    bmi >=18 and bmi<25    healthy
    bmi>=25 and bmi<30     overweight
    bmi>=30                obessity  bmi=weight/(height*height)*/


import java.util.Scanner;
public class Bmi{
  public static void main(String[]args){
    Scanner sc =new Scanner(System.in);
    double height,weight,bmi;
    System.out.println("enter the height and weight");
    height=sc.nextDouble();
    weight=sc.nextDouble();
    bmi=(weight/(height*height));
    if(bmi<18)
      System.out.println("underweight");
    else if(bmi>=18&&bmi<25)
      System.out.println("healthy");
    else if(bmi>=25&&bmi<30)
      System.out.println("overweight");
    else
      System.out.println("obessity");
    
  }
}
