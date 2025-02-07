public String right2(String str) {
  int length = str.length();
  return str.substring(length-2) + str.substring(0, length-2);
}
