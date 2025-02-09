public Map<String, Integer> wordCount(String[] strings) {
  Map<String, Integer> map = new HashMap<String,Integer>();
  
  for (String word : strings) {
    map.put(word, map.getOrDefault(word, 0) + 1);
  }
  return map;
}
