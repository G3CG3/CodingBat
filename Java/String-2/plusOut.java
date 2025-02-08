public String plusOut(String str, String word) {
  String s = "";
  int i = 0;
  int end = 0;
  int length =str.length();
  
  while(i < str.length()) {
    end = i + word.length();
    if( end > str.length()) {
      end = str.length();
    }
    
    if(str.substring(i,end).equals(word)) {
      s = s + word;
      i = i + word.length();
    } else {
      s = s + "+";
      i++;
    }
  }
  return s;
}
