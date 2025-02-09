public int scoreUp(String[] key, String[] answers) {
  int sum = 0;
  
  for (int i = 0; i < key.length; i++) {
    if (key[i] == answers[i])
      sum += 4;
    else if (answers[i].charAt(0) != '?')
      sum -=1;
  }
  return sum;
}
