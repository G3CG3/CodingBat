public boolean catDog(String str) {
  int countC = 0;
  int countD = 0;
  
  for (int i = 0; i < str.length() - 2; i++) {
    if(str.substring(i,i+3).equals("dog"))
      countD ++;
      
    if(str.substring(i,i+3).equals("cat"))
      countC ++;
  }
  
  return countC == countD;
}
