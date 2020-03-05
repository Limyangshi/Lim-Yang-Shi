package javaapplication1;

import java.util.*;

public class JavaApplication1{

static Scanner sc = new Scanner(System.in);//create new object

public static void main (String[] args)
{
//Exercise 1

String college = new String ("College of Arts and Sciences");
String town="UUM Sintok"; // part (a)
int stringLength;
String change1, change2, change3;
stringLength=college.length(); // part (b)
System.out.println (college + " contains " + stringLength + " characters.");
change1 = college.toUpperCase(); // part (c)
System.out.println ("The string is all in upper case: " + change1);
change2 = change1.replace("O","*"); // part (d)
System.out.println ("All capital O's are replaced with the asterisk character: " + change2);
change3 = college.concat(town); // part (e)
System.out.println ("The final string is " + change3);



//Question 2
FunnyString();

//Question 3
Date();

//Question 4
number();
}

public static void FunnyString(){

   System.out.print("Enter your favourite colour");
   String colour = sc.nextLine();
   
   System.out.print("enter your favorite food");
   String food = sc.nextLine();
   
   System.out.print("Enter your favourite animal:");
   String animal = sc.nextLine();
   
   System.out.print("Enter your first name of friend");
   String friend = sc.nextLine();
   
   System.out.println("I had dream taht " +friend + " ate a " +colour+"" +animal+" and said it tasted like " +food+"!");
   }
   
   public static void Date(){
   System.out.print("Enter day month and year (in format dd/mm/yy)\t:");
   String date = sc.nextLine();
   
   date = date.replace("/",".");
   
   System.out.println(date);
   }
   
   public static void number(){//parameter 
      String digit = sc.nextLine();
      
      for(int i = 0 ; i<4; i++){//condition
      
         System.out.println(digit.charAt(i));
         num = String.valueOf(digit.charAt(i));
         j += Integer.parseInt(num);
         
         }
            System.out.println(j);
       }
   }