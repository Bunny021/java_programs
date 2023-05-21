/*Basic Salary <= 10000 : HRA = 20%, DA = 80%
    Basic Salary <= 20000 : HRA = 25%, DA = 90%
    Basic Salary > 20000 : HRA = 30%, DA = 95%*/

import java.util.Scanner;
public class Sample1{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    float basic_salary;
    System.out.println("enter the salary of employee");
    basic_salary=sc.nextFloat();
    float hra,da,gross_salary;
    if(basic_salary<=10000)
    {
      hra=((basic_salary*20)/100);
      da=((basic_salary*80)/100);
      gross_salary=(basic_salary+hra+da);
      System.out.println("gross_salary" +gross_salary);
    }
    else if(basic_salary<=20000)
    {
      hra=((basic_salary*25)/100);
      da=((basic_salary*90)/100);
      gross_salary=(basic_salary+hra+da);
      System.out.println("gross_salary" +gross_salary);
    }
    else if(basic_salary>20000)
    {
      hra=((basic_salary*30)/100);
      da=((basic_salary*95)/100);
      gross_salary=(basic_salary+hra+da);
      System.out.println("gross_salary" +gross_salary);
    }
  }
}