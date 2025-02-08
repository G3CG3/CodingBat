public boolean xyzThere(String str) {
  if(str.length() >= 3 && str.substring(0,3).equals("xyz"))
      return true;
  
  for (int i = 0; i < str.length()-3; i++) {
    if (str.substring(i+1, i+4).equals("xyz") && str.charAt(i) != '.') 
      return true;
  }
  
  return false;
}
