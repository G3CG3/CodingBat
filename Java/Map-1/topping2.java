public MapString, String topping2(MapString, String map) {
  if(map.get(ice cream) != null)
    map.put(yogurt, map.get(ice cream));
    
  if(map.get(spinach) != null)
    map.put(spinach, nuts);
    
  return map;
}
