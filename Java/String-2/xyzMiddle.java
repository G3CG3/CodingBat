public boolean xyzMiddle(String str) {
  if (str.length() < 3)
    return false;
    
  int odd = str.length() / 2;
  int even = (str.length() / 2) -1;
  
  if (str.length() % 2 == 0) {
    return str.substring(even - 1, even + 2).equals("xyz") 
          || str.substring(even, even + 3).equals("xyz");
  } else {
    return str.substring(odd - 1, odd + 2).equals("xyz");
  }
}