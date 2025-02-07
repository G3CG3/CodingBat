public String stringX(String str) {
  StringBuilder sb = new StringBuilder();
  
  for (int i = 0; i < str.length(); i++) {
    if (!(i > 0 && i < str.length() - 1 &str.charAt(i)== 'x'))
      sb.append(str.charAt(i));
  }
  return sb.toString();
  
}
