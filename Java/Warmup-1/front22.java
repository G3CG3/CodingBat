public String front22(String str) {
  if (str.length() < 2)
    return str + str + str;
  String chars = str.substring(0,2);
  return chars + str + chars;
}
