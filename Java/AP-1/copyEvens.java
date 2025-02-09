public int[] copyEvens(int[] nums, int count) {
  int index = 0;
  int[] arr = new int[count];
  
  for (int i = 0; index < count; i++) {
    if (nums[i] % 2 == 0) {
      arr[index] = nums[i];
      index ++;
    }
  }
  return arr;
}
