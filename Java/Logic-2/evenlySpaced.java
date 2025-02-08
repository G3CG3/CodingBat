public boolean evenlySpaced(int a, int b, int c) {
  int diffAB = Math.abs(a-b);
  int diffBC = Math.abs(b-c);
  int diffAC = Math.abs(a-c);
  
  if (a == b && a == c)
    return true;
    
  if ((a == b && b != c) || (b == c && a != c) || (a == c && a != b))
    return false;
  
  if(diffAB == diffBC || diffAB == diffAC || diffAC == diffBC)
    return true;
    
  return false;
}
