public class cls {
    private String name;
    private  int age;

    cls(String name, int age){
        this.name = name;
        this.age = age;
    }

     void show(){
        
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }

    public static void main(String args[]){
    cls obj = new cls("Aga", 20);
    obj.show();
}
}

// // Example of final keyword in java

// public class cls {
//     final int speedlimit = 90; // final variable
//     void run(){
//         // speedlimit = 400; // will throw error
//     }
//     public static void main(String args[]){
//         cls obj = new cls();
//         obj.run();
//     }
// }
//----------------------------------------
// public class cls {
//     // static variable
//     static int count = 0;

//     // static block
//     static {
//         System.out.println("Static block executed.");
//     }

//     // static method
//     static void incrementCount() {
//         count++;
//         System.out.println("Count is: " + count);
//     }

//     public static void main(String args[]) {
//         // calling static method without creating an instance
//         cls.incrementCount();
//         cls.incrementCount();
//     }
// }

// public class cls {
// public static int partition(int arr[], int low, int high){
// int pivot = arr[high];
// int i= low-1;

// for(int j=low; j<high; j++) {
// if(arr[j] < pivot) {
// i++;
// //swap
// int temp = arr[i];
// arr[i] = arr[j];
// arr[j] = temp;

// }

// }

// i++;
// int temp = arr[i];
// arr[i] = pivot;
// arr[high] = temp;
// return i; // pivot index
// }

// public static void quickSort(int arr[], int low, int high) {
//     if(low < high) {
//     int pidx = partition(arr, low, high);
    
//     quickSort(arr, low, pidx-1);
//     quickSort(arr, pidx+1, high);
//     }
//     }
    
//     public static void main(String args[]) {
//         int[] arr = {6, 3, 9, 5, 2, 8};
//         int n = arr.length;

//         quickSort(arr, 0, n-1);

//         //print
//         for(int i=0; i<n; i++) {
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();

//     }
// }