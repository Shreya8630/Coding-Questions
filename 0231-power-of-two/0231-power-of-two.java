class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n == 1 || n == 2) {
            return true;
        }
        if (n <= 0) {
            return false;
        }
        long i = 2;
        while (i < n) {
            i = 2 * i;
            if (i == n) {
                return true;
            }
        }
        return false;
    }
}