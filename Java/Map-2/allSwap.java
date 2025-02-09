public String[] allSwap(String[] strings) {
  Map<Character, Integer> firstOccurence = new HashMap<>();
  
  for (int i = 0; i < strings.length; i++) {
    char firstChar = strings[i].charAt(0);
    
    if (firstOccurence.containsKey(firstChar)) {
      int prevIndex = firstOccurence.get(firstChar);
      String temp = strings[i];
      strings[i] = strings[prevIndex];
      strings[prevIndex] = temp;
      firstOccurence.remove(firstChar);
    } else {
      firstOccurence.put(firstChar, i);
    }
  }
  return strings;
}
