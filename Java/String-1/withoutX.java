public String withoutX(String str) {
  int start = 0;
  int end = str.length();
      
  if(str.length() > 0 && str.charAt(0) == 'x')
    start = 1;
  if(str.length() > 1 && str.charAt(str.length() - 1) == 'x')
    end--;
                          
  return str.substring(start, end);
}
