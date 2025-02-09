public boolean dividesSelf(int n) {
  for (int i = n; i != 0; i /= 10) {
    int digit = i % 10;
    if (digit == 0 || n % digit != 0)
      return false;
  }
  return true;
}
