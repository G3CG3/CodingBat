public boolean haveThree(int[] nums) {
  int count = 0;
  boolean found = false;
  
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] != 3)
      found = false;
    if (nums[i] == 3 && found) 
      return false;
    if (nums[i] == 3 && !found) {
      count++;
      found = true;
    }
  }
  
  return count == 3;
}