public int[] squareUp(int n) {
  int[] result = new int[n * n];
        
  for (int group = 1; group <= n; group++) { 
    int startIndex = group * n - 1; 
            
    for (int j = 0; j < group; j++) { 
      result[startIndex - j] = j + 1; 
    }
  }
        
  return result;
}
