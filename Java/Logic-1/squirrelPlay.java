public boolean squirrelPlay(int temp, boolean isSummer) {
  return (isSummer && temp >= 60 && temp <=100) || (!isSummer && temp >= 60 && temp <=90);
}
