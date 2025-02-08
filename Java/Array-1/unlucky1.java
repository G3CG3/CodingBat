public boolean unlucky1(int[] nums) {
  int last = nums.length - 1;
  
  if (nums.length < 2)
    return false;
  
  return (nums[0] == 1 && nums[1] == 3) || (nums[last-1] == 1 && nums[last] == 3)
          || (nums[1] == 1 && nums[2] == 3);
}
