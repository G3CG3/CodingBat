public int countYZ(String str) {
  int count = 0;
  str = str.toLowerCase();
  
  for (int i = 0; i < str.length() - 1; i++) {
    if ((str.charAt(i) == 'z' || str.charAt(i) == 'y') 
    && !Character.isLetter(str.charAt(i+1)))
      count ++;
  }
  
  if(str.charAt(str.length() - 1) == 'y' || str.charAt(str.length() - 1) == 'z')
      count++;
  
  return count;
}
