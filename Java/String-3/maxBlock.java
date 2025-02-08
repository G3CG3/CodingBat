public int maxBlock(String str) {
  int max = 1;
  int count = 1;
  
  if (str.length() < 1)
    return 0;
    
  for (int i = 1; i <str.length(); i++) {
    if (str.charAt(i) == str.charAt(i-1)) {
      count ++;
      if (max < count)
        max = count;
    } else {
      count = 1;
    }
  }
  
  return max;
}
