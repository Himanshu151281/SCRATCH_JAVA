// Again input in arr
//
// import java.util.*;
// public class testarr {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int arr[] = new int[size];
        
//         for(int i = 0; i < size; i++){
//             arr[i] = sc.nextInt();
//         }

//         for(int i = 0; i < size; i++){
//             System.out.print(arr[i]);
//             System.out.print(" ");
//         }
//     }
// }
// -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -
// New
// .sort --> it is used to sort array but we get some value like this [I@58372a00
// .toString --> So, for converting [I@58372a00 we use .toString
//
// import java.util.*;

// public class testarr{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int curarr[] = {98,54,84,82,92};
//         java.util.Arrays.sort(curarr);
//         //value of currarray we get [I@58372a00
//         System.out.println("Sorted Array " + java.util.Arrays.toString(curarr));
//     }
// }
// -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -
// New 
// .copyOf --> ye dusree array kii value apne array ke ander sore krta hain, and it takes two parameters jis array ki value copy krni hain and length for new array, hmne yaha pe previous array ka length liya hain.
//
// import java.util.*;

// public class testarr{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int curarr[] = {98,54,84,82,92};
//         int cpyarr[] = java.util.Arrays.copyOf(curarr,curarr.length);
//         System.out.println(java.util.Arrays.toString(cpyarr));
//     }
// }
// -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -  -

