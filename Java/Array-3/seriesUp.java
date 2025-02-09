public int[] seriesUp(int n) {
  int length = n * (n + 1) / 2; // Total size of the array
  int[] result = new int[length];
  int index = 0;

  for (int group = 1; group <= n; group++) { // Outer loop (each group)
    for (int num = 1; num <= group; num++) { // Inner loop (fill group)
      result[index++] = num;
    }
  }

  return result;
}
