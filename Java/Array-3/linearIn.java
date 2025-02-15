public boolean linearIn(int[] outer, int[] inner) {
  int i = 0, j = 0;
  
  while (i < outer.length && j < inner.length) {
    if (outer[i] == inner[j]) {
      j++;
    }
    i++;
    
    if (j == inner.length) {
      return true;
    }
  }
  return j == inner.length;
}
