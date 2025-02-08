public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
  if (isAsleep || (isMorning && !isMom))
    return false;
  return true;
}
