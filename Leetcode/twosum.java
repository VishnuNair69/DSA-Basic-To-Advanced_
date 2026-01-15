package Leetcode;

public class twosum {

    
    public static void main(String[] args) {

//Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

    // int[] nums = {2,7,11,15};
    // int target = 10;
    // for(int i=1;i<nums.length;i++){
    //     if(nums[i]+nums[i-1]==target){
    //         System.out.println("Found at index "+(i-1)+" "+i);
    //         break;
    //     }
    //     else{
    //         System.out.println("Not Found");
    //         break;
    //     }
    // }


    //now go

    int[] nums = {2,7,7,11,15};
    int target = 14;
    boolean Found=false;
    for(int i=0;i<nums.length;i++){
        for(int j=1;j<nums.length;j++){
            if(nums[i]+nums[j]==target){
                System.out.println("Found at "+(i)+" "+(j));
                Found = true;
                break;
            }
               
            
        }
        if(Found) break;
    }
    if(!Found) System.out.print("Not Found");
    
        
    }
}
