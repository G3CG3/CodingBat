public String[] fizzBuzz(int start, int end) {
  String[] arr = new String[end-start];

  for (int i = 0; start < end; i ++) {
    if (start % 15 == 0) {
      arr[i] = "FizzBuzz";
    }
    else if(start % 3 == 0) {
      arr[i] = "Fizz";
    }
    else if (start % 5 == 0) {
      arr[i] = "Buzz";
    }
    else {
      arr[i] = String.valueOf(start);
    }
    start ++;
  } 
  
  return arr;
}
