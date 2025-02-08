public String notReplace(String str) {
  String s = "";
  int l = str.length();
  
  for (int i = 0; i < l; i++) {
    if(i-1 >= 0 && Character.isLetter(str.charAt(i-1))  || i+2 < l && Character.isLetter(str.charAt(i+2))) {
		  s += str.charAt(i);
	  }
	  else if(i+1 < l && str.substring(i, i+2).equals("is")) {
		  s += "is not";
		  i++;
		} else 
		  s += str.charAt(i);
  }
  return s;
}
