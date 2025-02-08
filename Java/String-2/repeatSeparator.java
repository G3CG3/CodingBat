public String repeatSeparator(String word, String sep, int count) {
  String s = word;
  
  if (count == 0)
    return "";
  
  for (int i = 1; i < count; i++) {
    s = s + sep + word;
  }
  
  return s;
}
