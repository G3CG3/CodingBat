public Map<String, String> mapAB4(Map<String, String> map) {
  String av = map.get("a");
  String bv = map.get("b");
        
  if (av != null && bv != null) {
    if (av.length() > bv.length())
      map.put("c", av);
    else if (bv.length() > av.length())
      map.put("c", bv);
    else {
      map.put("a", "");
      map.put("b", "");
    }
  }
  return map;
}
