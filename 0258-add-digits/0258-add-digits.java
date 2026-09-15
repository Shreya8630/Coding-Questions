class Solution {
    public int addDigits(int num) {

        while (num >= 10) {

            String s = String.valueOf(num);
            int result = s.charAt(0) - '0';

            if (s.length() >= 2) {
                for (int i = 1; i < s.length(); i++) {
                    result = result + (s.charAt(i) - '0');
                }
            }

            num = result;
        }

        return num;
    }
}
