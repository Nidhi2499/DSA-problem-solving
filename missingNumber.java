public int missingNumber(int[] nums) {
    int sum = (nums.length * (nums.length+1))/ 2 ;

    int sumi =0;
    for(int i=0;i<nums.length ;i++){
        sumi = sumi + nums[i];
    }

    return sum - sumi;
}