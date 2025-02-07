public String extraEnd(String str) {
  String lastChars = str.substring(str.length()-2);
  return lastChars + lastChars + lastChars;
}
