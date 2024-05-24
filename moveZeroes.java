// move zeroes to the end 

/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.

Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]

Example 2:
Input: nums = [0]
Output: [0]
 */

public void moveZeroes(int[] nums) {
    int j=0;
    for(int i =1;i<nums.length ;i++){
        if(nums[j] == 0 && nums[i]!= 0){
            nums[j] = nums[i];
            nums[i] = 0;
            j++;
            
        }
        if(nums[j]!=0) j++;
        if(nums[i]==0) continue;
    }
}