package BinarySearch;

public class FloorCeil {

    // Function to find floor
    public int findFloor(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] <= x) {
                ans = arr[mid];   // Potential floor
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    // Function to find ceil
    public int findCeil(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] >= x) {
                ans = arr[mid];   // Potential ceil
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    // Function to return floor and ceil
    public int[] getFloorAndCeil(int[] arr, int x) {
        int floor = findFloor(arr, x);
        int ceil = findCeil(arr, x);

        return new int[]{floor, ceil};
    }

    public static void main(String[] args) {

        int[] arr = {3, 4, 4, 7, 8, 10};
        int x = 5;

        FloorCeil finder = new FloorCeil();

        int[] res = finder.getFloorAndCeil(arr, x);

        System.out.println("Floor = " + res[0]);
        System.out.println("Ceil = " + res[1]);
    }
}