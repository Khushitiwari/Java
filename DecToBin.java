//import java.util.*;

public class DecToBin{
   // Decimal to binary 

    public static void DecToBin(int n){
        int myNum = n;
        int pow = 0;
        int binNum = 0;

        while( n > 0 ){
            int rem = n % 2;
            binNum = binNum + (rem * (int)Math.pow(10,pow));
            pow ++;
             n = n/2;
        }

        System.out.println("binary form  of " + myNum +" = " + binNum);

    }
    public static void main(String args[]){
        DecToBin(7);
    }


    //binary to decimal 
//    public static void binToDec(int binNum){
//     int myNum = binNum;
//     int pow =0;
//     int decNum =0;
//     while(binNum>0){
//       int lastDigit = binNum % 10;

//       decNum = decNum + (lastDigit*(int)Math.pow(2,pow)); // Math.pow(base,power) to calculate power (int) is used to typecast bcoz Math.pow returns double value
//       binNum = binNum/10;
//       pow++;
//     }
//        System.out.println("decimal of " + myNum  + " = " + decNum);

//    }

//    public static void main(String args[]){
//     // binToDec(int 1011101); this is wrong calling
//     // binToDec(1011101); //this is right calling
//       binToDec(11);
//  }

}