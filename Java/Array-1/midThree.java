public int[] midThree(int[] nums) {
  int middle = nums.length / 2;
  return new int[] {nums[middle-1], nums[middle], nums[middle+1]};
}
