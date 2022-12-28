import java.util.*;
public class A1 {
    public static void main(String[] args) {
     //int arr[];
     //int[] ar;
    /*  int[] arr={3,6,8,9,7};
     
     int[] ar= new int[5];
     ar[0]=5;
     ar[1]=9;
     ar[2]=51;
     ar[3]=44;
     ar[4]=77;

     int[] a,b; // a and b both are array
*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter "+n+"Elements:");
        //take input
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Output");
     for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
     }



    }
}