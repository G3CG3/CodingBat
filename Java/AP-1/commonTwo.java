public int commonTwo(String[] a, String[] b) {
  int i = 0;
  int j = 0;
  int count = 0;
        
  while (i < a.length && j < b.length) {
    if (a[i].equals(b[j])) { 
      count++; 
      i++; 
      j++;  
                
      while (i < a.length && a[i].equals(a[i - 1])) 
        i++;
      while (j < b.length && b[j].equals(b[j - 1])) 
        j++;
    } else if (a[i].compareTo(b[j]) < 0) {  
      i++; 
    } else { 
      j++; 
    }
  }
  return count;
}
