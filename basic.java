import java.util.*;

public class basic{

    public static void main(String args[]){

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter first number");
        // int a = sc.nextInt();
        // System.out.println("Enter second number");
        // int b = sc.nextInt();
        // int pro = a * b ;
        // System.out.print("the product of two numbers is : ");
        // System.out.println(pro);
        // System.out.println("Enter radius value");
        // float radius = sc.nextFloat();

        // float area = 3.14f*radius*radius; // 3.14 ke f use krne se float ho gya otherwise it will be considered as double
        // System.out.println("The area of circle is: ");
        // System.out.println(area);
        

        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter first number");
        // int a = input.nextInt();
        // System.out.println("Enter second number");
        // int b = input.nextInt();
        // System.out.println("Enter third number");
        // int c = input.nextInt();
        // float avg = (a+b+c)/3;
        // System.out.print("Average of given three numbers is: ");
        // System.out.println(avg);
        

        // Scanner in = new Scanner(System.in);
        // System.out.println("Enter side of sqaure");
        // int side = in.nextInt();
        // int area = side*side;
        // System.out.println("area of sqaure is: ");
        // System.out.println(area);

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter cost of first item");
        // float c1 = sc.nextFloat();
        // System.out.println("Enter cost of second item");
        // float c2 = sc.nextFloat();
        // System.out.println("Enter cost of third item");
        // float c3 = sc.nextFloat();
        // float gst = (c1+c2+c3)*0.18f;
        // float bill = (c1+c2+c3) + gst;
        // System.out.print("Your bill along with 18% of gst is: ");
        // System.out.println(bill);
       
    //    int $ = 23;
    //    System.out.println($);


       // Lets build a income tax calculator in Java
      //  Scanner sc = new Scanner(System.in);
      //  System.out.println("Enter your income: " );
      //  int income = sc.nextInt();
      //  int tax ;

       // condition for checking how much income 

      //  if(income < 5000000){
      //    tax = 0 ;
      //  }
      //  else if(income >= 5000000 && income <= 10000000 ){
      //   tax = (int)(income * 0.20);
      //  }
      //  else {
      //  tax = (int)(income * 0.30);
      //  }

      //  System.out.println("Your tax is : " + tax);


     // to print a pattern of alphabets in Java
      
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of rows for the pattern: ");
      int n = sc.nextInt();
      char ch = 'A';

      for (int i=1 ; i<= n ; i++){
         for (int j= 1 ; j <= i;j++){
          System.out.print(ch + " ");
          ch++; // incrementing the character to next alphabet
         }
         System.out.println();
      }


    



   } 

}