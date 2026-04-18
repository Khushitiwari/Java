//import java.util.*;
public class function{
    //  public static int multiply(int a , int b){
    //         int product = a* b;
    //         return product;
    // }
    // // function to add two numbers
    // public static int add(int a , int b){
    //         int sum = a + b;
    //         return sum;
    // }
    // // function to add three numbers
    // public static int add(int a , int b , int c){
    //     int sum = a+b+c;
    //     return sum;

    // }

    // public static void main (String args[]){
    //   Scanner input = new Scanner(System.in);
    //   System.out.println("Enter first number");
    //   int a = input.nextInt();
    //   System.out.println("Enter second number");
    //   int b = input.nextInt();

    //   int result = multiply(a,b);
    //   System.out.println("Product of two numbers are: " + result);

    // }

   

   //binary to decimal 
   public static void binToDec(int binNum){
    int myNum = binNum;
    int pow =0;
    int decNum =0;
    while(binNum>0){
      int lastDigit = binNum % 10;

      decNum = decNum + (lastDigit*(int)Math.pow(2,pow)); // Math.pow(base,power) to calculate power (int) is used to typecast bcoz Math.pow returns double value
      binNum = binNum/10;
      pow++;
    }
       System.out.println("decimal of " + myNum  + " = " + decNum);

   }

   public static void main(String args[]){
    // binToDec(int 1011101); this is wrong calling
    // binToDec(1011101); //this is right calling
      binToDec(11);
   }
 }