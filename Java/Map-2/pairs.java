public Map<String, String> pairs(String[] strings) {
  Map<String, String> map = new HashMap<String, String>();
  
  for (int i = 0; i < strings.length; i++) {
    map.put(strings[i].substring(0,1), strings[i].substring(strings[i].length()-1));
  }
  return map;
}
