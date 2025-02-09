public List<String> copies3(List<String> strings) {
  return strings.stream()
                .map(n -> n + n + n)
                .collect(Collectors.toList());
}
