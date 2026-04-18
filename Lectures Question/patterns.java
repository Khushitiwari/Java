


public class patterns{
 
 // hollow rectangle pattern
    // public static void hollow_rec(int totrows , int totcols){
    //     //for outer loop
    //     for(int i = 1; i<= totrows; i++){
    //         for(int j= 1 ; j<=totcols; j++){
    //             if(i == 1 || i ==totrows || j== 1 || j == totcols){
    //                 System.out.print("*");
                    
    //             }else{
    //                   System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
    //     }
    // }

    //inverted & rotated half pyramid

    //  public static void ihalf_py(int n){
    //     //outer loop
    //         for(int i = 1; i<= n  ; i ++ ){
    //             for(int j = 1 ; j <= n - i ; j++){
    //                 System.out.print(" ");
    //             }
    //             for(int j = 1 ; j <= i ; j++ ){
    //               System.out.print("*");
    //             }
    //             System.out.println();
    //         }
    //  }


    // inverted  half pyramid with numbers

    // public static void ihalf_py_num(int n){
    //     //outer loop
      
        

    //       for(int i =1 ; i<= n ; i++){
    //         for(int j = 1 ; j <=n-i + 1 ; j++ ){
    //           System.out.print(j + " ");
              
    //         }
            
    //         System.out.println();
    //       }
        

    // }


    // FLOYD'S Traingle
    // public static void floyd_triangle(int n){
        
      
    //      int num = 1;
    //      //outer loop
    //       for(int i =1 ; i<= n ; i++){
    //         // inner loop- how many times will number be printed
    //         for(int j = 1 ; j <=i ; j++ ){
    //           System.out.print(num + " ");
    //            num ++ ;
    //         }
           
            
    //         System.out.println();
    //       }
        

    // }



    // trianlge of 0 and 1

    // public static void zero_one_triangle(int n){
    //       for (int i=1 ; i<= n ; i++){
    //         for (int j = 1 ; j<= i; j++){
    //           if( (i+j)%2 == 0){ // condition for printing 1 if even
    //             System.out.print(" 1 ");
    //           }else{// if odd then 0 will be printed
    //              System.out.print(" 0 ");
    //           }
    //         }
    //         System.out.println();
    //       }
    // }


    // diamon pattern
    public static void diamond(int n){
    //first half

    for(int i= 1; i <= n ; i++){

      //spaces
      for(int j = 1; j <= n-i ; j++){
        System.out.print(" ");
      }

      //stars 
      for(int j = 1 ; j <= (2*i-1); j++){
        System.out.print("*");
      }

     
       System.out.println();
    }

    //second half

     for(int i= n; i >= 1 ; i--){

      //spaces
      for(int j = 1; j <= n-i ; j++){
        System.out.print(" ");
      }

      //stars 
      for(int j = 1 ; j <= (2*i-1); j++){
        System.out.print("*");
      }

     
       System.out.println();
    }



    }
           
      public static void  main(String args[]){
          //  zero_one_triangle(6);
          diamond(9);
      }
} 