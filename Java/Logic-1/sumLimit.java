public int sumLimit(int a, int b) {
  int sum = a + b;
  String strS = String.valueOf(sum);
  String strA = String.valueOf(a);
  
  if (strS.length() > strA.length())
    return a;
    
  return sum;
}
