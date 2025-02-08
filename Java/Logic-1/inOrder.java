public boolean inOrder(int a, int b, int c, boolean bOk) {
  if (bOk && b < c)
    return true;
  else
    return a < b && b < c;
}
