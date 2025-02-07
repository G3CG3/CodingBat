public String extraFront(String str) {
  if (str.length() < 4)
    return str + str + str;
  String firstTwo = str.substring(0,2);
  return firstTwo + firstTwo + firstTwo;
}
