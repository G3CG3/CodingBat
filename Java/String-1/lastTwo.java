public String lastTwo(String str) {
  if (str.length() < 2)
    return str;
    
  StringBuilder sb = new StringBuilder(str.substring(0,str.length()-2));
  sb.append(str.charAt(str.length()-1));
  sb.append(str.charAt(str.length()-2));
  return sb.toString();
}
