public boolean canBalance(int[] nums) {
  int total = 0;
  int leftSum = 0;
  int rightSum = 0;
  
  for (int num : nums) {
    total += num;
  }
  
  for(int i = 0; i < nums.length; i++) {
    leftSum += nums[i];
    
    rightSum = total - leftSum;
    
    if (leftSum == rightSum)
      return true;
  }
  return false;
}
