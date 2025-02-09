public String[] firstSwap(String[] strings) {
  Map<Character, Integer> firstOccurence = new HashMap<>();
  HashSet<Character> swappedChars = new HashSet<>();
  
  for (int i = 0; i < strings.length; i++) {
    char firstChar = strings[i].charAt(0);
    
    if (swappedChars.contains(firstChar)) {
      continue;
    }
    
    if (firstOccurence.containsKey(firstChar)) {
      int prevIndex = firstOccurence.get(firstChar);
      String temp = strings[i];
      strings[i] = strings[prevIndex];
      strings[prevIndex] = temp;
      
      swappedChars.add(firstChar);
      firstOccurence.remove(firstChar);
    } else {
      firstOccurence.put(firstChar, i);
    }
  }
  return strings;
}
