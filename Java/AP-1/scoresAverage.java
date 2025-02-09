public int scoresAverage(int[] scores) {
  int middle = scores.length / 2;
   int a1 = average(scores, 0, middle);
   int a2 = average(scores, middle, scores.length);
   
   return Math.max(a1, a2);
}

int average(int[] scores, int start, int end) {
  int sum = 0;
  
  for (int i = start; i < end; i++) {
    sum += scores[i];
  } 
  
  return sum / (end - start);
}
