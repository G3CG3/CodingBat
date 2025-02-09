public String wordAppend(String[] strings) {
  Map<String, Integer> map = new HashMap<String,Integer>();
  StringBuilder sb = new StringBuilder();
  
  for (String word : strings) {
    map.put(word, map.getOrDefault(word, 0) + 1);
  
    if (map.get(word) % 2 == 0) 
      sb.append(word);
  }
  
  return sb.toString();
}
