public boolean more14(int[] nums) {
  int count1s = 0;
  int count4s = 0;
  
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 1)
      count1s ++;
      
    if (nums[i] == 4)
      count4s ++;
  }
  
  return count1s > count4s;
}
