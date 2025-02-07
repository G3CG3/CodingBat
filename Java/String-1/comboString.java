public String comboString(String a, String b) {
  int lengthA = a.length();
  int lengthB = b.length();
  int min = Math.min(lengthA, lengthB);
  
  if (min == lengthA)
    return a + b + a;
  return b + a + b;
}
