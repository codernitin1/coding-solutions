class Solution {
    public int divisibleByDigits(String s) {
        int n = s.length();
        int[] rem = new int[10];
        for (int i = 0; i < n; i++) {
            int digitVal = s.charAt(i) - '0';
            for (int d = 1; d <= 9; d++) {
                rem[d] = (rem[d] * 10 + digitVal) % d;
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            int digitVal = s.charAt(i) - '0';
            if (digitVal != 0 && rem[digitVal] == 0) {
                count++;
            }
        }

        return count;
    }
}