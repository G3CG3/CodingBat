public List<String> noX(List<String> strings) {
  return strings.stream()
                .map(n -> n.replace("x", ""))
                .collect(Collectors.toList());
}
