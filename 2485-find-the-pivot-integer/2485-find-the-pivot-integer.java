class Solution {
  public int pivotInteger(int n) {
    final int y = (n * n + n) / 2;
    final int x = (int) Math.sqrt(y);
    return x * x == y ? x : -1;
  }
}