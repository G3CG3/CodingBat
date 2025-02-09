public Map<String, String> firstChar(String[] strings) {
  Map<String, String> map = new HashMap<String, String>();
  
  for (String word : strings) {
    String char1 = word.substring(0,1);
    map.put(char1, map.getOrDefault(char1, "") + word);
  }
  return map;
}
