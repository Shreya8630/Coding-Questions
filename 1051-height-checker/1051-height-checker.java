
class Solution {
    public int heightChecker(int[] heights) {

        int[] n = heights.clone();
        int j = 0;
        int count = 0;
        while (j < n.length - 1) {

            for (int i = 0; i < n.length - 1 - j; i++) {

                if (n[i] > n[i + 1]) {
                    int t = n[i];
                    n[i] = n[i + 1];
                    n[i + 1] = t;
                }
            }

            j++;
        }
        for (int k = 0; k < heights.length; k++) {

            if (heights[k] != n[k]) {
                count++;
            }
        }

        return count;
    }
}