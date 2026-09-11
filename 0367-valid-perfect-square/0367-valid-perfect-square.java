class Solution {
    public boolean isPerfectSquare(int num) {
        for (long i = 1; i * i <= num; i++) {
            long p = i * i;
            if (p == num) {
                return true;
            }
        }
        return false;
    }
}