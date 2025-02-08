public String mixString(String a, String b) {
  int aLen = a.length();
  int bLen = b.length();
  String s = "";
  
  int max = Math.max(aLen, bLen);
  
  for (int i = 0; i < max; i++) {
    if (i <= aLen - 1)
      s += a.substring(i,i+1);
    if (i <= bLen - 1)
      s += b.substring(i,i+1);
  }
  
  return s;
}
