//Problem for binary search where the time complexity of the solution is O(log n) in the worst case and in the best case the time complexity is O(1):
//The problem approchaes in the sorted array only 
// Input: nums = [1,3,5,6], target = 5
// Output: 2
//Binary Search Algorithm
//Consist of 3 pointer 
    //1.left
    //2.right
    //3.mid
//The left is the 1 indexed value of the array
//The right is the last indexed value of the array i.e arr.length-1
//The mid is the left+right/2
//The main idea of the binary search is to dived the array into two parts and repeat the same operation until the result is found


package Leetcode;

public class binarysearch {
    
    public static int binarySearch(int[] arr, int target){
        //2 variables left and right
        int right=arr.length-1;
        int left=0;
       
        while(left<=right){
            int mid = (left+right)/2;
            
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) left = mid+1;
            else right = mid-1;
        }
        return left+1;
    }

    public static void main(String[] args) {
        
        //function
        int[] arr={1,3,5,7,9};
        int target = 33;

        int result = binarySearch(arr,target);
        System.out.println(result);
    }
}
