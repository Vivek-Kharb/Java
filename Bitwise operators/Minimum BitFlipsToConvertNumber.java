class Solution {
    public int minBitFlips(int start, int goal) {
        int n = start^goal;

        return Integer.bitCount(n);

    }
}