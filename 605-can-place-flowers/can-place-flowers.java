class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int m = flowerbed.length;

        if (n == 0)
            return true;

        int i = 0;

        while (i < m) {

            if (flowerbed[i] == 0) {

                boolean left = (i == 0) || (flowerbed[i - 1] == 0);
                boolean right = (i == m - 1) || (flowerbed[i + 1] == 0);

                if (left && right) {
                    flowerbed[i] = 1;
                    n--;

                    if (n == 0)
                        return true;
                }
            }

            i++;
        }

        return false;
    }
}