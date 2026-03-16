// Fibonacci Seies==================

// public class Demo {

//     public static void main(String [] args) {

//         int n = 10;
//       int a =0;
//        int b =1;
//        int c;
//         System.out.print("Fibonacci Series : ");
//         for(int i =0; i <= n; i++) {

//             System.out.print(a+" ");
//             c = a + b;
//             a = b;
//             b = c;
//         }
        
//     }
// }

// Check Prime Number ======================
// public class Demo {

//     public static void main(String [] args) {

        
//         int count = 0;

//         for(int i =1; i <= 100;i++) {

//             if(i % i == 0) {

//                 count++;
//             }
//              if(count == 2) {

//             System.out.println(i+"Prime Number");
//         }
//         }
        
       
//     }
// }


// sum of digit of the number

// public class Demo {

//     public static void main(String [] args) {

//         int num = 1234;
//         int sum =0;
          
//         while(num > 0) {

//             int digit = num % 10;
//             sum = sum + digit;
//             num = num / 10;
//         }
//         System.out.print("Sum of Digit is : "+sum);
//     }
// }


// Perfect number==============

// public class Demo {

//     public static void main(String [] args) {

//         int num = 28;
//         int sum =0;

//         for(int i = 1; i < num; i ++) {

//             if(num % i == 0) {

//                 sum += i;
//             }
//         }
//         if(sum == num) {

//             System.out.println(num +" is perfect number");
//         } else {

//             System.out.println(num + "is not perfect number");
//         }
//     }
// }

// Factorial of a Number

// public class Demo {

//     public static void main(String [] args) {

//         int n = 5;
//         int fact = 1;

//         for(int i = n; i > 0; i--) {

//             fact = fact * i;
//         }

//         System.out.println("Factorial of "+n +" is "+fact);
//     }
// }

// Prime Number =====================

public class Demo {

    public static void main(String [] args) {

        System.out.print("Prime Numbers : ");
        for(int num = 1; num <= 100; num++) {

            int count = 0;

            for(int i =1; i <= num; i++) {

                if(num % i == 0) {

                    count++;
                }
            }
            if(count == 2) {

                System.out.print(num + " ");
            }
        }
    }
}