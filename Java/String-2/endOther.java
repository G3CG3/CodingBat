public boolean endOther(String a, String b) {
  a = a.toLowerCase();
  b = b.toLowerCase();
  int aLen = a.length();
  int bLen = b.length();
  
  if (aLen < bLen)
    return b.substring(bLen-aLen).equals(a);
  return a.substring(aLen-bLen).equals(b);
}
