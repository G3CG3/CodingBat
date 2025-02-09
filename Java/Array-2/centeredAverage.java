public int centeredAverage(int[] nums) {
  int sum = 0;
  int count = 0;
  
  Arrays.sort(nums);
  
  for (int i = 1; i < nums.length -1; i++) {
    sum += nums[i];
    count ++;
  }
  
  return sum / count;
}
