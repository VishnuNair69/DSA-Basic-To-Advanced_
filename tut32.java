
import java.util.Scanner;

public class tut32 {
    public static void main(String[] args) {

        //scanner class logic
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = scn.nextInt();
        System.out.println("Enter array elements");
        int[] arr = new int[size];

        //logic for inserting
        for(int i = 0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }
        int max = arr[0]; //runtime value

        //logic
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("The Smallest element is "+ max);

    }
}
