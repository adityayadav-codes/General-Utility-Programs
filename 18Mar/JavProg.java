

// public class JavProg {

//     public static void main(String [] args) {

//         int [] arr = {10,10,40,50,20,40};

//         for(int i =0; i < arr.length; i++) {

//             for(int j = i + 1; j < arr.length; j++) {

//                 if(arr[i] == arr[j]) {

//                     System.out.println(arr[i]);
//                     break;
//                 }
//             }
//         }
//     }
// }

// Count Vowels in a Srirng ===================================

public class JavProg {

    public static void main(String [] args) {

        String str = "icecrean";
        int count = 0;

        for(int i = 0; i < str.length(); i++) {

            if(str.charAt(i)== 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {

                count++;
            }
        }
        System.out.println(count);
    }
}