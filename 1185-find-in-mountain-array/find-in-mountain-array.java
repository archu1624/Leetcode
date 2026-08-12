class Solution {
    public int findInMountainArray(int target, MountainArray arr) {

        int n = arr.length();

        // 1. Find peak
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr.get(mid) < arr.get(mid + 1)) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        int peak = left;

        // 2. Search increasing part
        left = 0;
        right = peak;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int value = arr.get(mid);

            if (value == target) {
                return mid;
            }

            if (value < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // 3. Search decreasing part
        left = peak + 1;
        right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int value = arr.get(mid);

            if (value == target) {
                return mid;
            }

            if (value > target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}