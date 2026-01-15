package Leetcode;

public class removedup {
    
public static void main(String[] args) {
    

//Input: nums = [0,0,1,1,1,2,2,3,3,4]
// Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
// Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
// It does not matter what you leave beyond the returned k (hence they are underscores).

    // int[] nums = {0,0,1,1,1,2,2,3,3,4};
    // int k =1;
    
    // for(int i=1;i<nums.length;i++){
    //     if(nums[i]!=nums[i-1]){
    //         nums[k]=nums[i];
    //         k++;
    //     }
    // }
    // System.out.println(k);

    int[] nums = {0,0,1,1,1,2,2,3,3,4};
    int k =1;
    for(int i=0;i<nums.length;i++){
        for(int j=1;j<nums.length;j++){
            if(nums[j]==nums[i]){
                nums[k]=nums[i];
                k++;
            }
        }
    }
    System.out.println(k);

}

}
