public int[] withoutTen(int[] nums) {
  int[] arr = new int[nums.length];
  int j = 0;
  
  for (int i = 0; i < nums.length; i++) {
    if (nums[i] != 10) {
      arr[j] = nums[i];
      j ++;
    }
  }
  
  for (int i = j; i < nums.length; i++) {
    arr[j] = 0;
  }
  
  return arr;
}
