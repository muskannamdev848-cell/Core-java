package BinarySearch;

public class KokoEatingBananas {

    public int minEatingSpeed(int[] piles, int h) {

        int s = 1;
        int e = 0;

        // Find maximum pile
        for (int pile : piles) {
            e = Math.max(e, pile);
        }

        int ans = e;

        while (s <= e) {

            int mid = s + (e - s) / 2;

            long result = 0;

            for (int x : piles) {
                result += (x + mid - 1L) / mid;
            }

            if (result <= h) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] piles = {3, 6, 7, 11};
        int h = 8;

        KokoEatingBananas obj = new KokoEatingBananas();

        System.out.println(obj.minEatingSpeed(piles, h));
    }
}