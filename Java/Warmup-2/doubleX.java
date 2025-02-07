boolean doubleX(String str) {
  int index = str.indexOf("x");
  
  if (index < 0)
    return false;
  
  return str.substring(index).startsWith("xx");
}
