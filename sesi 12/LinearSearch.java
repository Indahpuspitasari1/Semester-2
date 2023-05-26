public class LinearSearch {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Mengembalikan indeks jika target ditemukan
            }
        }
        return -1; // Mengembalikan -1 jika target tidak ditemukan
    }

    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 10, 3, 4, 13, 21, 9, 6, 19, 23, 17, 22, 1};
        int target = 9;

        long startTime = System.nanoTime();
        int index = linearSearch(arr, target);
        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;

        int result = linearSearch(arr, target);
        if (result == -1) {
            System.out.println("Target tidak ditemukan dalam array.");
        } else {
            System.out.println("Target ditemukan pada indeks: " + result);
        }
        System.out.println("Execution time: " + executionTime + " nanoseconds");
    }
}
