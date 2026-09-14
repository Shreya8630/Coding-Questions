class Solution {
    public String addBinary(String a, String b) {

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        String ans = "";

        while (i >= 0 || j >= 0) {

            int x = 0;
            int y = 0;

            if (i >= 0) {
                x = a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                y = b.charAt(j) - '0';
                j--;
            }

            int sum = x + y + carry;

            if (sum == 0) {
                ans = "0" + ans;
                carry = 0;
            } 
            else if (sum == 1) {
                ans = "1" + ans;
                carry = 0;
            } 
            else if (sum == 2) {
                ans = "0" + ans;
                carry = 1;
            } 
            else {
                ans = "1" + ans;
                carry = 1;
            }
        }

        if (carry == 1) {
            ans = "1" + ans;
        }

        return ans;
    }
}