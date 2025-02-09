public boolean splitArray(int[] nums) {
  return sum(nums, 0, 0, 0);
}

private boolean sum(int[] nums, int index, int sum1, int sum2) {
  if (index == nums.length)
    return sum1 == sum2;
    
  return sum(nums, index+1, sum1+nums[index], sum2) 
          || sum(nums, index+1, sum1, sum2+nums[index]);
}