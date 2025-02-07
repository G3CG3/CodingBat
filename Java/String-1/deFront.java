public String deFront(String str) {    
  String result = str.substring(2);
  
  if (str.charAt(1) == 'b')
    result = "b" + result;
  if (str.charAt(0) == 'a')
    result = "a" + result;
  return result;
}
