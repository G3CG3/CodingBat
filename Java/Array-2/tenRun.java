public int[] tenRun(int[] nums) {
  int value = -1;
  int[] array = new int[nums.length];
  
  for(int i = 0; i < nums.length; i++) {
    if(nums[i] % 10 == 0) {
      value = nums[i];
      array[i] = value;
    } else if(value == -1) {
      array[i] = nums[i];
    } else {
      array[i] = value;
    }
  }
  return array;
}
