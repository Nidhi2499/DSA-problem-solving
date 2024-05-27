/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.

brute force - sort and compare the adjacent numbers
optimised - bit manipulation
*/

public int singleNumber(int[] nums) {
    Arrays.sort(nums);
    for(int i=0;i<=nums.length-1;i=i+2){
        if(i==nums.length-1)
            return nums[i];
        if(nums[i]!=nums[i+1])
            return nums[i];
    }
    return -1;
}

public int singleNumber(int[] nums) {
    return xor(0, nums);
}
public static int xor(int x, int[] nums) {
    if(x>=nums.length) {
        return 0;
    }
    return nums[x]^xor(x+1, nums);
}
