public boolean no14(int[] nums) {
  boolean ones = false;
  boolean fours = false;
  
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 1) {
      ones = true;
    }
    
    if (nums[i] == 4) {
      fours = true;
    }
  }
  
  return !ones || !fours;
}
