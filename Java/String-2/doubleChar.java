public String doubleChar(String str) {
  StringBuilder sb = new StringBuilder();
  
  for (int i = 0; i < str.length(); i++) {
    sb.append(str.charAt(i)).append(str.charAt(i));
  }
  
  return sb.toString();
}
