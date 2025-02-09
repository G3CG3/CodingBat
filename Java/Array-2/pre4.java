public int[] pre4(int[] nums) {
  int index = 0;
  
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] == 4) {
      index = i;
      break;
    }
  }
  
  return Arrays.copyOfRange(nums, 0, index);
}
