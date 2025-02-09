public int sum67(int[] nums) {
  int sum = 0;
  boolean found = false;
  
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 6) {
      found = true;
    }
    
    if (found == false)
      sum += nums[i];
      
    if (nums[i] == 7 && found)
      found = false;
  }
  
  return sum;
}
