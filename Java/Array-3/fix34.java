public int[] fix34(int[] nums) {
  int l = nums.length;
  int indexOf4 = 0;
  
  for (int i = 0; i < l-1; i++) {
    if (nums[i] == 3) {
      while (indexOf4 < l && (nums[indexOf4] != 4 || (indexOf4 > 0 && nums[indexOf4 - 1] == 3))) {
        indexOf4 ++;
      }
      if (indexOf4 < l) {
        int temp = nums[i+1];
        nums[i+1] = nums[indexOf4];
        nums[indexOf4] = temp;
      }
    }
  }
  return nums;
}
