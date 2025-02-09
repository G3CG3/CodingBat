public boolean lucky13(int[] nums) {
  boolean no1s = true;
  boolean no3s = true;
  
  for(int i = 0; i < nums.length; i++) {
    if (nums[i] == 1)
      no1s = false;
    if (nums[i] == 3)
      no3s = false;
  }
  
  return no1s && no3s;
}
