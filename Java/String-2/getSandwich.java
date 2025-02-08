public String getSandwich(String str) {
  boolean found = false;
  int firstIndex = -1;
  int lastIndex = -1;
  
  if (str.length() < 10)
    return "";
  
  for (int i = 0; i < str.length() - 5; i++) {
    if (str.substring(i,i+5).equals("bread")) {
      found = true;
      firstIndex = i;
      break;
    }
  }
  
  for (int i = str.length() - 5; i >= 0; i--) {
    if (str.substring(i,i+5).equals("bread") && found) {
      lastIndex = i;
      break;
    }
  }
  
  if(firstIndex != -1 && lastIndex != -1 && firstIndex != lastIndex)
    return str.substring(firstIndex + 5, lastIndex);
                                                                    
  return "";
}
