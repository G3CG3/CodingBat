public int[] fix45(int[] nums) {
  int l = nums.length;
  int indexOf5 = 0;
  
  for (int i = 0; i < l-1; i++) {
    if (nums[i] == 4) {
      while (indexOf5 < l && (nums[indexOf5] != 5 || (indexOf5 > 0 && nums[indexOf5 - 1] == 4))) {
        indexOf5 ++;
      }
      if (indexOf5 < l) {
        int temp = nums[i+1];
        nums[i+1] = nums[indexOf5];
        nums[indexOf5] = temp;
      }
    }
  }
  return nums;
}
