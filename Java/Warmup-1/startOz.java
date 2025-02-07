public String startOz(String str) {
  StringBuilder sb = new StringBuilder();
  
  if (str.length() >= 1 && str.charAt(0) == 'o')
    sb.append('o');
  if (str.length() >= 2 && str.charAt(1) == 'z')
    sb.append('z');
  return sb.toString();
}
