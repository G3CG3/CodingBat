public List<Integer> two2(List<Integer> nums) {
  return nums.stream()
                .map(n -> 2 * n)
                .filter(n -> n % 10 != 2)
                .collect(Collectors.toList());
}
