public String wordEnds(String str, String word) {
  String s = "";
  
  for (int i = 0; i < str.length() - word.length() + 1; i++) {
    String temp = str.substring(i, i+word.length());
    
    if (i > 0 && temp.equals(word))
      s += str.substring(i-1,i);
      
    if (i < str.length() - word.length() && temp.equals(word))
      s += str.substring(i + word.length(), i + word.length() + 1);
  }
  
  return s;
}

