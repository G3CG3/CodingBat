public String nTwice(String str, int n) {
  String front = str.substring(0, n);
  String end = str.substring(str.length()-n);
  return front + end;
}
