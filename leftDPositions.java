// time limit exceeded
public void rotate(int[] nums, int k) {
    k=k%nums.length;

    while(k!=0){

        int last = nums[nums.length-1];
        for(int i=nums.length-1;i>=1;i--){
            nums[i] = nums[i-1];
        }
        nums[0] = last;
        k--;
    }
}



// optimised
public void rotate(int[] nums, int k) {
    k %= nums.length;
    reverse(nums, 0, nums.length - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, nums.length - 1);
}