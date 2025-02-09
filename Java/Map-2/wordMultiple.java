public Map<String, Boolean> wordMultiple(String[] strings) {
  Map<String, Integer> map = new HashMap<String,Integer>();
  Map<String, Boolean> result = new HashMap<String,Boolean>();
  
  for (String word : strings) {
    map.put(word, map.getOrDefault(word, 0) + 1);
    
    result.put(word, map.get(word) >= 2);
  }
  
  return result;
}
