public boolean xyBalance(String str) {
  boolean xFound = false;
  
  for (int i = 0; i < str.length(); i++) {
    if (str.charAt(i) == 'x')
      xFound = true;
    if (str.charAt(i) == 'y' && xFound) {
      xFound = false;
    }
  } 
  
  return !xFound;
}
