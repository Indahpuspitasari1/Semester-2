public class BinarySearch {
    public static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key)
                return mid;

            if (arr[mid] < key)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int key = 14;

        long startTime = System.nanoTime();
        int index = binarySearch(arr, key);
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;

        if (index != -1)
            System.out.println("Target ditemukan pada indeks: " + index);
        else
            System.out.println("Target tidak ditemukan dalam array.");

        System.out.println("Execution time: " + executionTime + " nanoseconds");
    }
}
